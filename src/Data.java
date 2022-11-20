import java.util.regex.Pattern;

public class Data {
    private static final String PASSWORD_REGEX =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,16}$";
    // 8-16 символов пароль, минимум одна цифра, минимум одна
    // строчная буква, хотя бы одна прописная буква, хотя бы одна
    // специальный символ без пробелов
    private static final String LOGIN_REGEX =
            "^[A-Za-z]([.A-Za-z0-9-]{1,12})([A-Za-z0-9])$";
    // 3-12 символов логин, минимум одна цифра, минимум одна
    // строчная буква, хотя бы одна прописная буква
    private static final Pattern PASSWORD_PATTERN =
            Pattern.compile(PASSWORD_REGEX);
    private static final Pattern LOGIN_PATTERN =
            Pattern.compile(LOGIN_REGEX);
    public static boolean validate(String login,String password, String confirmPassword){
        try {
            check(login,password,confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    private static void check(String login,String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (!validateLogin(login)){
            throw new WrongLoginException("Логин не подходит");
        } else {
            System.out.println("Логин подходят");
        }
        if (!validatePassword(password)){
            throw new WrongPasswordException("Пароль не подходит");
        }
        if (!password.equals(confirmPassword)){
            throw new WrongPasswordException("Пароль не совпадает");
        } else {
            System.out.println("Пароль подходят");
        }

    }
    private static boolean validatePassword(String password){
        for (int i = 0; i < password.length(); i++){
            if (PASSWORD_PATTERN.matcher(password).matches()) {
                return true;
            }
        }
        return false;
    }
    private static boolean validateLogin(String login){
        for (int i = 0; i < login.length(); i++){
            if (LOGIN_PATTERN.matcher(login).matches()) {
                return true;
            }
        }
        return false;
    }



}
