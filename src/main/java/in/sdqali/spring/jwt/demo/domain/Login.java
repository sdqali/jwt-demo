package in.sdqali.spring.jwt.demo.domain;

import lombok.*;

@Data
public class Login {
    String username;
    String password;
    String salt;
    String md5;
    String sha1;
    String sha256;
}
