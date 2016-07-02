package in.sdqali.spring.jwt.demo.service;

import in.sdqali.spring.jwt.demo.auth.LoginCredentials;
import in.sdqali.spring.jwt.demo.domain.MinimalProfile;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class LoginService {
    public Optional<MinimalProfile> login(LoginCredentials credentials) {
        return Optional.empty();
    }
}
