package thread.pool;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GetPaginaSitoPool extends Thread {
    private String url;
    private String content;

    public GetPaginaSitoPool(String url) {
        super();
        this.url = url;
    }

    @Override
    public void run() {
        try {
            URL site = new URL(url);
            URLConnection con = site.openConnection();

            InputStream in = con.getInputStream();
            String encoding = con.getContentEncoding();
            encoding = encoding == null ? "UTF-8" : encoding;

            System.out.println("************************************************");
            System.out.println("CONTENUTO DELLA PAGINA WEB: " + url);
            System.out.println(getString(in));
            System.out.println("************************************************");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getString(InputStream is) {
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

    public String getContent() {
        return content;
    }
}


class MainPool{
    public static void main(String[] args) {
        /*creo il thread pool*/
        ExecutorService pool = Executors.newCachedThreadPool();

        /*aggiunge i thread al pool*/
        pool.execute(new GetPaginaSitoPool("http://www.google.com"));
        pool.execute(new GetPaginaSitoPool("https://www.ibconline.it"));

        /*spengo il thread pool*/
        pool.shutdown();
    }
}
