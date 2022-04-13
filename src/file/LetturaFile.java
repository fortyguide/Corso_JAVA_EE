package file;

import java.io.*;

public class LetturaFile {

    public static void main(String[] args) {
        String dir = "C:\\Users\\spanico\\IdeaProjects\\Corso_JAVA_EE\\src\\file\\directory_creata_dal_codice\\file_creato_e_scritto_dal_codice_FileWriter";

        LetturaFile lw = new LetturaFile();
        lw.esempioFileReader(dir);
        lw.esempioBufferedReader(dir);
    }

    public void esempioFileReader(String filePath) {
        File f = new File(filePath);
        if(f.exists()){
            FileReader fr = null;
            try {
                fr = new FileReader(f);

                /*numero massimo di caratteri*/
                char[] testo = new char[1024];

                try {
                    /*fr.read(testo);*/

                    /*Faccio in modo che ciò che viene letto
                    * nel file venga scritto anche sulla console*/
                    /*########################*/
                    int size = fr.read(testo);
                    for (int i = 0; i < size; i++){
                        System.out.print(testo[i]);
                    }
                    /*########################*/
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } finally {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void esempioBufferedReader(String filePath) {
        File f = new File(filePath);
        if(f.exists()){
            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader(f));

                /*numero massimo di caratteri*/
                char[] testo = new char[1024];

                try {
                    /*fr.read(testo);*/

                    /*Faccio in modo che ciò che viene letto
                     * nel file venga scritto anche sulla console*/
                    /*########################*/
                    int size = br.read(testo);
                    for (int i = 0; i < size; i++){
                        System.out.print(testo[i]);
                    }
                    /*########################*/
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } finally {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
