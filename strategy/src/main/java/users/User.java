package users;

import strategies.LogInStrategy;
import strategies.RegisterStrategy;

public class User {

  private RegisterStrategy registerStrategy;
  private LogInStrategy logInStrategy;

  public void register() {
    registerStrategy.register();
  }

  public void login() {
    logInStrategy.logIn();
  }

  public void setRegisterStrategy(RegisterStrategy registerStrategy) {
    this.registerStrategy = registerStrategy;
  }

  public void setLogInStrategy(LogInStrategy logInStrategy) {
    this.logInStrategy = logInStrategy;
  }
}
