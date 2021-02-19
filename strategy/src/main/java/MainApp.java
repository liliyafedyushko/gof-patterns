import strategies.login.LogInWithMobileApp;
import strategies.register.TelephoneNumberRegistrationStrategy;
import users.User;
import users.UserOauthRegisterWebsiteLogIn;

public class MainApp {

  public static void main(String[] args) {

    User userWithBehavior = new UserOauthRegisterWebsiteLogIn();
    userWithBehavior.register();
    userWithBehavior.login();
    System.out.println("-----------------------");

    User createdBehaviourOnFlyUser = new User();
    createdBehaviourOnFlyUser.setRegisterStrategy(new TelephoneNumberRegistrationStrategy());
    createdBehaviourOnFlyUser.setLogInStrategy(new LogInWithMobileApp());
    createdBehaviourOnFlyUser.register();
    createdBehaviourOnFlyUser.login();
    System.out.println("-----------------------");

    //change behaviour for userWithBehavior
    userWithBehavior.setLogInStrategy(new LogInWithMobileApp());
    createdBehaviourOnFlyUser.login();
  }
}
