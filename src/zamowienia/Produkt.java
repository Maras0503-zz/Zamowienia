package zamowienia;

public class Produkt {
    public int id;
    private String name;
    private double cena;
    private char[] kod = new char[5];

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public char[] getKod() {
        return kod;
    }

    public void setKod(char[] kod) {
        this.kod = kod;
    }
    Produkt(String name,double  cena){
        this.name = name;
        this.cena = cena;
    }
    
}
