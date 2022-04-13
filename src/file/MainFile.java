package file;

import java.io.File;
import java.io.IOException;

public class MainFile {

    public static void main(String[] args) {
        MainFile m = new MainFile();

        String dir = "C:\\Users\\spanico\\IdeaProjects\\Corso_JAVA_EE\\src\\file\\directory_creata_dal_codice";
        m.creaDirectory(dir);
        m.creaFile(dir + "\\file_creato_dal_codice.txt");

        File d = new File(dir);
        System.out.println(d.isDirectory()); //true
        System.out.println(d.isFile()); //false

        File f = new File(dir + "\\file_creato_dal_codice.txt");
        System.out.println(f.isDirectory());//false
        System.out.println(f.isFile()); //true

        /* Il metodo listFiles() ritorna un array di file presenti nella directory specificata */
        File[] files = d.listFiles();

        for(File file2 : files){
            System.out.println(file2.getName());// file_creato_dal_codice.txt

            file2.delete();
        }
    }

    public void creaFile(String path){
        File f = new File(path);

        if (!f.exists()){
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void creaDirectory(String path){
        File d = new File(path);

        if (!d.exists()){
            d.mkdir();
        }
    }
}
