package database;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.*;


public class EsempioConnessioneDatabase {

    /* Il dump del database esportato da MySql è nella cartella db del progetto Corso_JAVA_EE */

    private Connection con;

    public static void main(String[] args) {
        EsempioConnessioneDatabase esempioConnessioneDatabase = new EsempioConnessioneDatabase();

        try {
            /* Stampa false se la connessione è aperta, quindi se ha avuto successo */
            System.out.print("La connessione al database e' fallita: ");
            System.out.println(esempioConnessioneDatabase.getConnection().isClosed()); // false
            System.out.println("-----------------------");

            System.out.println("Le righe della query 'SELECT id, nome, cognome, email, telefono FROM clienti' sono le seguenti: ");
            System.out.println("-----------------------");
            esempioConnessioneDatabase.esempioSelect();


            System.out.println("Le righe della query 'SELECT id, nome, cognome, email, telefono FROM clienti WHERE cognome LIKE '%Pre%'' sono le seguenti: ");
            System.out.println("-----------------------");
            esempioConnessioneDatabase.esempioSelect2();

            esempioConnessioneDatabase.esempioInsert("Sara", "Bartoli", "sara@test.it", "9999999");
            System.out.println("-----------------------");

            esempioConnessioneDatabase.esempioUpdate();

            esempioConnessioneDatabase.esempioDelete();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Connection getConnection() throws SQLException {
        /* Se l'istanza Connection è null, la definiamo noi con la classe MysqlDataSource*/
        if (con == null) {
            MysqlDataSource dataSource = new MysqlDataSource();

            /* Indica indirizzo ip dove risiede il database*/
            dataSource.setServerName("localhost");

            dataSource.setPortNumber(3306);

            dataSource.setUser("root");
            dataSource.setPassword("root");

            dataSource.setDatabaseName("corso_java");

            /* Se tutto è andato per il meglio,
            * getConnection() mi restituisce un'istanza della connessione*/
            con = dataSource.getConnection();
        }

        return con;
    }

    private void esempioSelect() throws SQLException {
        /* Definiamo la query che restituisce l'elenco di tutti i clienti */
        String sql = "SELECT id, nome, cognome, email, telefono FROM clienti" ;

        /* Per eseguire la query, serve un oggetto di tipo PreparedStatement.
        Tale oggetto serve per passare in input a MySql la query, in modo da
        poterla effettuare. */
        PreparedStatement preparedStatement = getConnection().prepareStatement(sql);

        /* Il risultato delle query è un oggetto di tipo ResultSet */
        ResultSet resultSet = preparedStatement.executeQuery();

        /* Mediante il seguente while, estrapoliamo tutte le righe trovate dalla query,
        per poi stamparle */
        while(resultSet.next()) {

            /* Accediamo alle colonne dell' i-esima riga */
            System.out.println("id = " + resultSet.getInt(1));
            System.out.println("nome = " + resultSet.getString(2));
            System.out.println("cognome = " + resultSet.getString(3));
            System.out.println("email = " + resultSet.getString(4));
            System.out.println("telefono = " + resultSet.getString(5));
            System.out.println("-----------------------");
        }
    }

    private void esempioSelect2() throws SQLException {
        /* Definiamo la query che restituisce l'elenco di tutti i clienti */
        String sql = "SELECT id, nome, cognome, email, telefono FROM clienti WHERE cognome LIKE '%Pre%'" ;

        /* Per eseguire la query, serve un oggetto di tipo PreparedStatement.
        Tale oggetto serve per passare in input a MySql la query, in modo da
        poterla effettuare. */
        PreparedStatement preparedStatement = getConnection().prepareStatement(sql);

        /* Il risultato delle query è un oggetto di tipo ResultSet */
        ResultSet resultSet = preparedStatement.executeQuery();

        /* Mediante il seguente while, estrapoliamo tutte le righe trovate dalla query,
        per poi stamparle */
        while(resultSet.next()) {

            /* Accediamo alle colonne dell' i-esima riga */
            System.out.println("id = " + resultSet.getInt(1));
            System.out.println("nome = " + resultSet.getString(2));
            System.out.println("cognome = " + resultSet.getString(3));
            System.out.println("email = " + resultSet.getString(4));
            System.out.println("telefono = " + resultSet.getString(5));
            System.out.println("-----------------------");
        }
    }

    private void esempioInsert(String nome, String cognome, String email, String telefono) throws SQLException {
        String sql = "INSERT INTO clienti(nome, cognome, email, telefono) " +
                "VALUES ('"+nome+"', '"+cognome+"', '"+email+"', '"+telefono+"')";

        /* Il RETURN_GENERATED_KEYS è da utilizzare nei casi in cui
        l'id è generato automaticamente dal database */
        PreparedStatement preparedStatement = getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        preparedStatement.executeUpdate();

        ResultSet resultSet = preparedStatement.getGeneratedKeys();
        resultSet.next();

        System.out.println("L'id della nuova riga inserita (INSERT) e' "+ resultSet.getInt(1));
    }

    private void esempioUpdate () throws SQLException {
        String sql = "UPDATE clienti SET telefono = '12345678' WHERE id = 5";

        PreparedStatement preparedStatement = getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        preparedStatement.executeUpdate();
    }

    private void esempioDelete () throws SQLException {
        String sql = "DELETE FROM clienti WHERE nome = 'Sara'";

        PreparedStatement preparedStatement = getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        preparedStatement.executeUpdate();
    }
}
