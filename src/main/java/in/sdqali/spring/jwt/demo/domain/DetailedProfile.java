package in.sdqali.spring.jwt.demo.domain;

import lombok.Data;

@Data
public class DetailedProfile {

    private final Picture picture;
    private final Name name;
    private final String email;
    private final String username;

    public DetailedProfile(Profile profile) {
        name = profile.getName();
        email = profile.getEmail();
        picture = profile.getPicture();
        username = profile.getLogin().getUsername();
    }
}
