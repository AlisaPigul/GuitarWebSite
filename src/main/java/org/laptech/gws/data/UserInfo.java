package org.laptech.gws.data;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * @author rlapin
 */
@Component
@Scope(value = "session",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserInfo {
    private boolean logged;
    private String username;

    public boolean isLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
