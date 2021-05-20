package subscription.display;

import java.util.Map;
import model.News;
import observer.Observer;
import subject.Subject;
import subscription.DisplayElement;

public class CertainCountryInfoDisplay implements Observer, DisplayElement {

  private String country;
  private News news;

  public CertainCountryInfoDisplay(String country) {
    this.country = country;
  }

  @Override
  public void update(News news) {
    this.news = news;
    display();
  }

  @Override
  public void display() {
    System.out.println(findInfoForCountry(country));
  }

  private String findInfoForCountry(String countryName) {
    if (news.getOpenCountries().contains(countryName)) {
      return countryName + " is open!!!";
    }
    Map<String, Integer> countriesWithIsolation = news.getCountriesWithIsolation();
    if (countriesWithIsolation.containsKey(countryName)) {
      return "You should spend on isolation " + countriesWithIsolation.get(countryName) +
          " days to travel in " + countryName;
    }
    else
      return countryName + "is closed. Be safe";
  }
}
