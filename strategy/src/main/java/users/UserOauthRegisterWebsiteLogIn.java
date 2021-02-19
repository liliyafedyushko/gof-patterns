package users;

import strategies.login.LogInWithWebsite;
import strategies.register.OAuthRegistrationStrategy;

public class UserOauthRegisterWebsiteLogIn extends User{

  public UserOauthRegisterWebsiteLogIn() {
    setRegisterStrategy(new OAuthRegistrationStrategy());
    setLogInStrategy(new LogInWithWebsite());
  }
}
