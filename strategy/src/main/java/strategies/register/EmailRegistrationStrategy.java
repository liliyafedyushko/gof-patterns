package strategies.register;

import strategies.RegisterStrategy;

public class EmailRegistrationStrategy implements RegisterStrategy {

  @Override
  public void register() {

    System.out.println("You are signed up with email");
  }
}
