//Code written by Savvas Mantzouranidis

public class Student {

    private String username;
    private String am;
    private String name;
    private String tmhma;
    private String ex;
    private int deikths;

    public Student(String username, String am, String name, String tmhma, String ex) {
        this.username = username;
        this.am = am;
        this.name = name;
        this.tmhma = tmhma;
        this.ex = ex;
    }

    public String getUsername() {
        return username;
    }

    public String getAm() {
        return am;
    }

    public String getName() {
        return name;
    }

    public String getTmhma() {
        return tmhma;
    }

    public String getEx() {
        return ex;
    }

    public int getDeikths() {
        return deikths;
    }

}
