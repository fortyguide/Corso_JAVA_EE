package eccezione;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class EccezioniChecked {

    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("test.txt");

        f.exists();

        FileReader fr = new FileReader(f);//exception java.io.FileNotFoundException /*se il file non esiste*/
    }
}
