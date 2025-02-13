package entities;

public class Rent {
    private String name;
    private String Email;

    public Rent(){

    }

    public Rent(String name, String email) {
        this.name = name;
        this.Email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }


    @Override
    public String toString() {
        return  name  + ", " + Email;
    }
}


