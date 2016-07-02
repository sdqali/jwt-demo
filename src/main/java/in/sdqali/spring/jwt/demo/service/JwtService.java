package in.sdqali.spring.jwt.demo.service;

import in.sdqali.spring.jwt.demo.domain.MinimalProfile;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;

import static java.time.ZoneOffset.UTC;

@Component
public class JwtService {
    private static final String ISSUER = "in.sdqali.jwt";

    public Object tokenFor(MinimalProfile minimalProfile) {
        SecretKey secretKey = MacProvider.generateKey();
        Date expiration = Date.from(LocalDateTime.now().plusHours(2).toInstant(UTC));
        HashMap<String, Object> claims = new HashMap<>();
        claims.put("username", minimalProfile.getUsername());
        return Jwts.builder()
                .setSubject("jwt-demo")
                .setExpiration(expiration)
                .setIssuer(ISSUER)
                .signWith(SignatureAlgorithm.HS512, secretKey)
                .compact();
    }
}
