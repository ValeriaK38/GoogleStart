package googleStartEx.Visitor;

public class User implements Appliance {
    private String name;
    private final int id;
    private String password;

    public User(String name, int id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.exportToJson(this);
    }
}
