package strategies.login;

import strategies.LogInStrategy;

public class LogInWithMobileApp implements LogInStrategy {

  @Override
  public void logIn() {

    System.out.println("You are logged in with mobile app");
  }
}
