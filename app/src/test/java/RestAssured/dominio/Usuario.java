package RestAssured.dominio;

public class Usuario {
    private String name;
    private String job;

    public Usuario(){

    }

    public Usuario(String name, String job){
        this.job = job;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }
}
