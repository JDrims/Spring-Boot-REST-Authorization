package spring.boot.rest.rest.user;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class User {

    @NotEmpty(message = "Username must not be empty or contain spaces")
    @Size(min=5, max=20)
    private String user;

    @NotEmpty(message = "Password must not be empty or contain spaces")
    @Size(min=6, max=32)
    private String password;

    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return this.user;
    }

    public String getPassword() {
        return this.password;
    }
}