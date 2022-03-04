package array_liste_collection_classi_wrapper_autoboxing_unboxing;

public class ArrayMultidimensionale {

    public static void main(String[] args) {
        ArrayMultidimensionale arrayMultidimensionale = new ArrayMultidimensionale();

        arrayMultidimensionale.creaArrayMultidimensionale();
    }

    public void creaArrayMultidimensionale(){

        int[][] matrice = new int[10][10]; /*dichiarazione matrice 10x10, ossia 10 righe e 10 colonne*/

        /*Accesso in scrittura all'array multidimensionale con il ciclo for*/
        /*###################################################################*/
        for (int i = 0; i < matrice.length; i++){ /*iterazione sulle righe della matrice*/
            for (int j = 0; j < matrice[i].length; j++){ /*iterazione sulle colonne della matrice*/
                matrice[i][j] = i + j;
            }
        }
        /*###################################################################*/

        /*Accesso in lettura all'array multidimensionale con il ciclo for*/
        /*###################################################################*/
        for (int i = 0; i < matrice.length; i++){ /*iterazione sulle righe della matrice*/
            for (int j = 0; j < matrice[i].length; j++){ /*iterazione sulle colonne della matrice*/
                System.out.println(matrice[i][j]);
            }
        }
        /*###################################################################*/
    }
}
