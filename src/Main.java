import exeptions.WrongLoginException;
import exeptions.WrongPasswordException;

public class Main {

    public static void main(String[] args) {
        String login = "qwerty21_";
        String password = "asdew123_";
        String confirmPassword = "asdew123_";
        try {
            ValidationService.validateLoginPassword(login, password, confirmPassword);
        } catch (WrongLoginException exp) {
            System.out.println("Некорректно введен логин");
        } catch (WrongPasswordException exp) {
            System.out.println("Некорректно введен (или не подтвержден) пароль");
        } finally {
            System.out.println("Работа метода validateLoginPassword() завершена");
        }
    }
}