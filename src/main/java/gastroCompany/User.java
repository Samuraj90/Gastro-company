package gastroCompany;

public class User {
    private String name;
    private String surname;
    private String emailAdress;

    public User() {

    }

    public User(String name, String surname, String emailAdress) {
        this.name = name;
        this.surname = surname;
        this.emailAdress = emailAdress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }


}
