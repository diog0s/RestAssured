package RestAssured.dominio;

public class User {
    private String name;
    private String job;
    private String email;

    public User(){

    }

    public User(String name, String job, String email){
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
