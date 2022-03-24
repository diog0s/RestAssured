package RestAssured.dominio;

public class Usuario {
    private String name;
    private String job;
    private String email;

    public Usuario(){

    }

    public Usuario(String name, String job, String email){
        this.job = job;
        this.name = name;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
