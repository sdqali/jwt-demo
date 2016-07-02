package in.sdqali.spring.jwt.demo.domain;


import lombok.Data;

@Data
public class Profile {
    private Name name;
    private String email;
    private Login login;
    private Picture picture;
}
