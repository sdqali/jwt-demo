package in.sdqali.spring.jwt.demo.domain;

import lombok.Data;

import java.net.URL;

@Data
public class Picture {
    private URL large;
    private URL medium;
    private URL thumbnail;
}
