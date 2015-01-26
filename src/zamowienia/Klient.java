package zamowienia;

public class Klient {
    private String firstName;
    private String name;
    private String phoneNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    Klient(String firtName, String name, String phoneNumber){
        this.firstName = firstName;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    
}
