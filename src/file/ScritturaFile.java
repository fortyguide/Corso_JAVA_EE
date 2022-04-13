package file;

import java.io.*;

public class ScritturaFile {

    public static void main(String[] args) {
        String dir = "C:\\Users\\spanico\\IdeaProjects\\Corso_JAVA_EE\\src\\file\\directory_creata_dal_codice\\";

        ScritturaFile sf = new ScritturaFile();
        try {
            sf.esempioFileWriter(dir + "file_creato_e_scritto_dal_codice_FileWriter", "Lorem ipsum ...");

            sf.esempioBufferedWriter(dir + "file_creato_e_scritto_dal_codice_BufferedWriter", "LALALALA");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void esempioFileWriter(String filePath, String testo) throws IOException {

        File file = new File(filePath);

        if(!file.exists()) {
            file.createNewFile();
        }

        FileWriter fw = new FileWriter(file);

        fw.write(testo);
        fw.close();

        /* Nel caso volessimo gestire noi le eccezioni, invece di demandarle al metodo
        * con throws, possiamo fare anche in quest altro modo:

        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileWriter fw = null;

        try {
            fw = new FileWriter(file);
            fw.write(testo);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
    }

    public void esempioBufferedWriter(String filePath, String testo) throws IOException {

        File file = new File(filePath);

        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter(file));
            bw.write(testo);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
