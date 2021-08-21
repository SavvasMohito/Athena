//Code written by Savvas Mantzouranidis

public class Mathima {

    private String code;
    private String name;
    private String ex;
    private String proap;

    public Mathima(String code, String name, String ex, String proap) {
        this.code = code;
        this.name = name;
        this.ex = ex;
        if (!proap.equals("#")) {
            this.proap = proap;
        } else {
            this.proap = "";
        }
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getEx() {
        return ex;
    }

    public String getProap() {
        return proap;
    }

}
