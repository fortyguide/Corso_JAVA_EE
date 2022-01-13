package thread.concorrenza;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class GetPaginaSitoExecutor implements Callable <String>{ /*String è il tipo di output*/
    private String url;
    private String content;

    public GetPaginaSitoExecutor(String url){
        super();
        this.url = url;
    }

    @Override
    public String call() throws Exception {

        try {
            URL u = new URL(url);

            URLConnection con = u.openConnection();

            InputStream is = con.getInputStream();

            return Utils.getString(is);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

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

class MainConcorrenzaExecutor{
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Callable<String>> siti = new ArrayList<Callable<String>>();

        siti.add(new GetPaginaSitoExecutor("http://www.paolopreite.it"));
        siti.add(new GetPaginaSitoExecutor("http://www.google.it"));

        ExecutorService ex = Executors.newSingleThreadExecutor();

        List<Future<String>> out = ex.invokeAll(siti);

        for(Future<String> future : out){ /*for each*/
            System.out.println(future.get());
        }

        ex.shutdown();/*Termino l'istanza dell'ExecutorService*/
    }
}
