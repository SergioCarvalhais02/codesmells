package pt.up.fe.ldts.example4;

public class Person {
    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    private final String name;
    private final String phone;
    private final String username;
    private final String password;
    public Person(String name, String phone, String username, String password){
        this.name=name;
        this.phone=phone;
        this.username=username;
        this.password=password;
    }
}
