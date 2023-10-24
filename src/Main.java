import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class Main {
    public static void main(String[] args) {

        System.out.println("Working With Exceptions!");

        try {
            userAuthorization("loginASs_dsl2109", "passwords", "password");
        } catch (WrongLoginException e) {
            System.out.println("Login exception!");
        } catch (WrongPasswordException e) {
            System.out.println("Password exception!");
        } finally {
            System.out.println("Working With Exceptions completed!");
        }
    }

    public static void userAuthorization(String login, String password, String confirmPassword) {
        if (login.length() > 20 || !login.matches("^[a-zA-Z0-9_]+$")) {
            throw new WrongLoginException();
        }
        if (password.length() > 20 || !password.matches("^[a-zA-Z0-9_]+$") || !password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
    }
}