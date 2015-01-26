package zamowienia;

import java.sql.SQLException;

public class Zamowienia {

    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        DatabasesOperation baza = new DatabasesOperation();
        baza.saveProdukt();
    }
    
}
