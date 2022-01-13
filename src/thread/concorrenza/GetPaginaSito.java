package thread.concorrenza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class GetPaginaSito extends Thread {

    private String url;
    private String content;

    /*Creo il costruttore per poter passare un parametro in ingresso
    * alla logica all'interno di new()*/
    public GetPaginaSito(String url){
        super();
        this.url = url;
    }

    @Override
    public void run() {
       /*Dentro il metodo run() implemento la logica che permette
       di invocare una URL e di recuperare le informazioni*/
        try {
            /*Sto passando la url in ingresso dal costruttore*/
            URL u = new URL(url);

            /*Creo la connessione*/
            URLConnection con = u.openConnection();

            /*Attraverso l'invocazione del metodo getInputStream(), recuperiamo
            l'output del nostro sito, quindi la nostra pagina html*/
            InputStream is = con.getInputStream();

            /*Scrivo il contenuto della pagina html in un file, mediante il
            metodo getString() della classe Utils, che prende in ingresso
            un InputStream e scrive in uno StringBuilder tutto l'output
            della nostra pagina web*/
            setContent(Utils.getString(is));

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*Genero i metodi getter e setter per l'accesso alla variabili private url e content*/
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

class Utils {
    public static String getString(InputStream is) {
        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();

        String line;
        try {
            br = new BufferedReader(new InputStreamReader(is));
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return sb.toString();
    }
}

class MainConcorrenza{
    public static void main(String[] args) {
        GetPaginaSito s1 = new GetPaginaSito("http://www.paolopreite.it");
        GetPaginaSito s2 = new GetPaginaSito("http://www.google.it");

        s1.start();
        s2.start();

        /*Attendo il completamento di ciascun thread, prima di eseguire
        quello successivo, in modo da non farli interrompere a vicenda*/
        try {
            s1.join();
            s2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Output sito Paolo Preite");
        System.out.println(s1.getContent());

        System.out.println("Output sito Google");
        System.out.println(s2.getContent());
    }
}

