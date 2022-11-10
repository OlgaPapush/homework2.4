public class Data {
    private String login;
    private String password;
    private String confirbpassword;
    public String registration = "^(?=.*[0-9](?=.*[a-z])(?=.*[A-Z])(?=.*[_]).{1,20}$)";

    public Data(String login, String password, String confirbpassword) {
        this.login = login;
        this.password = password;
        this.confirbpassword = confirbpassword;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirbpassword() {
        return confirbpassword;
    }

    public static boolean checRegistration(Data data) throws WrongLoginException, WrongPasswordException {
        if (data.login.matches(data.registration) && !data.login.isBlank()) {
            System.out.println("Логин введен верно");
        } else {
            throw new WrongLoginException("Логин введен неверно");
        }
        if (data.password != null && data.password.isBlank() && data.login.matches(data.registration) && data.password.equals(data.getConfirbpassword())) {
            System.out.println("Пароль введен верно");
        } else {
            throw new WrongPasswordException("Пароль введен неверно");
        }
        return false;
    }
}





