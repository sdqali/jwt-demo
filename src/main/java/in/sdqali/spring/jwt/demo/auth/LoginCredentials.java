package in.sdqali.spring.jwt.demo.auth;

import lombok.Data;

@Data
public class LoginCredentials {
    private String username;
    private String password;
}
