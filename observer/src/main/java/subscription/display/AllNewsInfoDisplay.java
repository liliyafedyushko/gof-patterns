package subscription.display;

import model.News;
import observer.Observer;
import subject.Subject;
import subscription.DisplayElement;

public class AllNewsInfoDisplay implements Observer, DisplayElement {

  private News news;

  @Override
  public void update(News news) {
    this.news = news;
    display();
  }

  @Override
  public void display() {
    System.out.println("The current news: openCountries - " + news.getOpenCountries()
        + " countriesWithIsolation - " + news.getCountriesWithIsolation());
  }
}
