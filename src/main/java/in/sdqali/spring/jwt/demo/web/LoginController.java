package in.sdqali.spring.jwt.demo.web;

import in.sdqali.spring.jwt.demo.auth.LoginCredentials;
import in.sdqali.spring.jwt.demo.domain.MinimalProfile;
import in.sdqali.spring.jwt.demo.exceptions.FailedToLoginException;
import in.sdqali.spring.jwt.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping(path = "/login")
public class LoginController {

    private final LoginService loginService;

    @SuppressWarnings("unused")
    public LoginController() {
        this(null);
    }

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @RequestMapping(path = "",
            method = POST,
            produces = APPLICATION_JSON_VALUE)
    public MinimalProfile login(@RequestBody LoginCredentials credentials) {
        return loginService.login(credentials)
                .orElseThrow(() -> new FailedToLoginException(credentials.getUsername()));
    }
}
