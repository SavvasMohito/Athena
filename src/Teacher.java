//Code written by Savvas Mantzouranidis

public class Teacher {

    private String username;
    private String name;
    private String tmhma;

    public Teacher(String username, String name, String tmhma) {
        this.username = username;
        this.name = name;
        this.tmhma = tmhma;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getTmhma() {
        return tmhma;
    }

}
