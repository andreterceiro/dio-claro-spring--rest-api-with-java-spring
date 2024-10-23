package dio.my_first_web_api.model;

public class Usuario {
    private Integer id;
    private String login;
    private String password;

    public Usuario(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", login='" + getLogin() + "'" +
            ", password='" + getPassword() + "'" +
            "}";
    }

}
