package login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController {
    private final UserStorage storage = new UserStorage();
    @FXML
    private Label signupStatus;
    @FXML
    private TextField signupUsername, signupPassword, signupRePassword;
    @FXML
    private Label loginStatus;
    @FXML
    private TextField loginUsername;
    @FXML
    private TextField loginPassword;

    public void signUp(ActionEvent event) {
        String username = signupUsername.getText();
        String password = signupPassword.getText();
        String rePassword = signupRePassword.getText();

        if (username.isEmpty()) {
            signupStatus.setText("Please enter username");
            return;
        }
        if (password.isEmpty()) {
            signupStatus.setText("Please enter password");
            return;
        }
        if (rePassword.isEmpty()) {
            signupStatus.setText("Please re-enter password");
        }

        if (!password.equals(rePassword)) {
            signupStatus.setText("Passwords should match");
            return;
        }

        signupStatus.setText("Sign Up Successful");

        User user = new User(username, password);

        storage.addUser(user);
        storage.printUsers();
    }

    public void login(){
        String username = loginUsername.getText();
        String password = loginPassword.getText();

        if (username.isEmpty()) {
            signupStatus.setText("Please enter username");
            return;
        }
        if (password.isEmpty()) {
            signupStatus.setText("Please enter password");
            return;
        }

        if (!storage.getUsers().containsKey(username)) loginStatus.setText("Username not found");

        if(!storage.getUsers().get(username).getPassword().equals(password)) loginStatus.setText("Passwords don't match");
        else loginStatus.setText("LogIn Successful");
    }
}
