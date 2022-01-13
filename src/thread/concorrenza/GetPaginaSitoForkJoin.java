package thread.concorrenza;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class GetPaginaSitoForkJoin extends RecursiveTask<String> {
    private String url;
    private String content;

    public GetPaginaSitoForkJoin(String url){
        super();
        this.url = url;
    }

    @Override
    protected String compute() {
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

class MainConcorrenzaForkJoin{
    public static void main(String[] args) {
        ForkJoinPool f = new ForkJoinPool();

        System.out.println(f.invoke(new GetPaginaSitoForkJoin("http://www.paolopreite.it")));
        System.out.println(f.invoke(new GetPaginaSitoForkJoin("http://www.google.it")));

        f.shutdown();

    }
}
