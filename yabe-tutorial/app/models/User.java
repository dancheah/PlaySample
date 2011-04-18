package models;

import play.data.validation.Email;
import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.Entity;

/**
 * Created by IntelliJ IDEA.
 * User: dc
 * Date: 4/15/11
 * Time: 10:47 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class User extends Model {
    @Email
    @Required
    public String email;

    @Required
    public String password;
    public String fullname;
    public boolean isAdmin;

    public User(String email, String password, String fullname) {
        this.email = email;
        this.password = password;
        this.fullname = fullname;
    }

    public static User connect(String email, String password) {
        return find("byEmailAndPassword", email, password).first();
    }

    public String toString() {
        return email;
    }
}
