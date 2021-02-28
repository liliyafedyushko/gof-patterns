package users;

import strategies.login.LogInWithMobileApp;
import strategies.register.EmailRegistrationStrategy;

public class UserEmailRegisterMobileAppLogIn extends User {

  public UserEmailRegisterMobileAppLogIn() {
    setRegisterStrategy(new EmailRegistrationStrategy());
    setLogInStrategy(new LogInWithMobileApp());
  }
}
