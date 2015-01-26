package zamowienia;

import java.sql.*;
import java.util.Scanner;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
/**
 *
 * @author Marek
 */
public class DatabasesOperation 
{
    Scanner scan = new Scanner(System.in);
    private final static String DBURL = "jdbc:mysql://85.128.135.13/mpadpl_zamowienia";
    private final static String DBUSER = "mpadpl_admin";
    private final static String DBPASS = "admin123";
    //private final static String DBDRIVER = "com.mysql.jdbc.Driver";
    private Statement statement;
    String txt;
    private String query;
    public  double price;
    static Connection conn;
    public void saveProdukt() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        //Class.forName(DBDRIVER).newInstance();
        txt = scan.nextLine();
        price = Double.parseDouble(txt.replace(',', '.'));
        Produkt item = new Produkt("Szampon",price);
        conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
        query = SaveToTable.saveProdukt(item);
        statement = conn.createStatement();
        statement.execute(query);
        System.out.println(statement);
    }
}