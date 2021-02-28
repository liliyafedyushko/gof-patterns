package strategies.register;

import strategies.RegisterStrategy;

public class OAuthRegistrationStrategy implements RegisterStrategy {

  @Override
  public void register() {
    //some logic here
    System.out.println("You are signed up with Gmail");
  }
}
