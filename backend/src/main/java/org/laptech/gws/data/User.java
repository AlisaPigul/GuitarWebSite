package org.laptech.gws.data;




import javax.persistence.*;
import java.util.Arrays;
import java.util.Date;

/**
 * @author rlapin on 12/13/16.
 */
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private long id;

    private String login;
    private byte[] password;

    private Role role;

    public long getId() {
        return id;
    }
    @Enumerated(EnumType.STRING)
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public byte[] getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (login != null ? !login.equals(user.login) : user.login != null) return false;
        return Arrays.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(password);
        return result;
    }

    public void setPassword(byte[] password) {
        this.password = password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

}
