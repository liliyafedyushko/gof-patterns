package strategies.login;

import strategies.LogInStrategy;

public class LogInWithWebsite implements LogInStrategy {

  @Override
  public void logIn() {

    System.out.println("You are logged in with website");
  }
}
