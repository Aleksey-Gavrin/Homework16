import exeptions.WrongLoginException;
import exeptions.WrongPasswordException;

import java.util.Objects;

public class ValidationService {
    public static void validateLoginPassword (String login, String password, String confirmPassword) {
        boolean isLoginValid = (login != null && !login.isBlank() && login.matches("^[a-zA-Z0-9_]+$")
                && login.length() <= 20);
        if (!isLoginValid) {
           throw new WrongLoginException("Invalid login");
        }
        boolean isPasswordValid = (password != null && !password.isBlank() && password.matches("^[a-zA-Z0-9_]+$")
                && password.length() <= 20);
        if (!isPasswordValid) {
            throw new WrongPasswordException("Invalid Password");
        }
        if (!Objects.equals(password, confirmPassword)) {
            throw new WrongPasswordException("Password is not confirmed");
        }

    }
}
