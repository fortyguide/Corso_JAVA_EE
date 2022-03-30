package array_liste_collection_classi_wrapper_autoboxing_unboxing;

import java.io.*;
import java.util.Properties;

public class PropertiesEsempio {

    public static void main(String[] args) {

        PropertiesEsempio pe = new PropertiesEsempio();
        pe.getConfig();

    }

    public void getConfig(){
        Properties p = new Properties();

        InputStream is = null;
        try {
            is = new FileInputStream(new File("C:\\Users\\spanico\\IdeaProjects\\Corso_JAVA_EE\\src\\array_liste_collection_classi_wrapper_autoboxing_unboxing\\config.properties"));

            /*Metodo per caricare il file properties se esiste*/
            p.load(is);

            /*db-name=corso
            db-address=127.0.0.1
            db-user=root
            db-password=test*/

            System.out.println(p.getProperty("db-name")); // corso

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
