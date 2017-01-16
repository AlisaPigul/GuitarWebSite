package org.laptech.gws.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.laptech.gws.data.User;
import org.laptech.gws.exceptions.ApplicationException;

import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;

/**
 * @author rlapin
 */
public class JWTUtils {
    public static String generateJWT(User user) {
        try {

            return JWT.create().withClaim("login",user.getLogin())
                    .withClaim("role", String.valueOf(user.getRole()))
                    .withIssuer("auth0")
                    .sign(Algorithm.HMAC256("secret"));
        } catch (UnsupportedEncodingException e) {
            throw new ApplicationException();
        }
    }
}
