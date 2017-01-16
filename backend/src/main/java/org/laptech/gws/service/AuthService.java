package org.laptech.gws.service;

/**
 * @author rlapin
 */
public interface AuthService {
    String login(String login, String password);

    String register(String login, String password);
}
