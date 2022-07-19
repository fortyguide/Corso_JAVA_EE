package database;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.SQLException;


public class EsempioConnessioneDatabase {

    /* Il dump del database esportato da MySql è nella cartella db del progetto Corso_JAVA_EE */

    private Connection con;

    public static void main(String[] args) {
        EsempioConnessioneDatabase esempioConnessioneDatabase = new EsempioConnessioneDatabase();

        try {
            /* Stampa false se la connessione è aperta, quindi se ha avuto successo */
            System.out.println(esempioConnessioneDatabase.getConnection().isClosed()); // false
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
}
