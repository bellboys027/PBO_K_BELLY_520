public class Admin {
    private String username = "admin";
    private String password = "admin123";

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}