package in.sdqali.spring.jwt.demo.domain;

import lombok.Data;

import java.net.URL;

@Data
public class MinimalProfile {
    private final String username;
    private final Name name;
    private final URL thumbnail;

    public MinimalProfile(Profile profile) {
        name = profile.getName();
        username = profile.getLogin().getUsername();
        thumbnail = profile.getPicture().getThumbnail();
    }
}
