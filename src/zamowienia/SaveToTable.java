package zamowienia;

public class SaveToTable {
 
    //Metoda tworząca zapytanie SQL zapisujące artykul do bazy
    public static String saveProdukt(Produkt article) {
        String query = "INSERT INTO produkty VALUES (NULL, '" + article.getName() + "', '" + article.getCena() +"');";

        return query;
    }
    public static String saveKlient(Produkt article) {
        String query = "INSERT INTO produkty VALUES (NULL, '" + article.getName() + "', '" + article.getCena() +"');";

        return query;
    }
}