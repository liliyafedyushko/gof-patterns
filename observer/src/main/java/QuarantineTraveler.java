import java.util.List;
import java.util.Map;
import model.News;
import observer.Observer;
import subject.Subject;
import subject.impl.TravelData;
import subscription.display.AllNewsInfoDisplay;
import subscription.display.CertainCountryInfoDisplay;
import subscription.display.StatisticDisplay;

public class QuarantineTraveler {

  public static void main(String[] args) {
    Subject travelData = new TravelData();
    Observer allNewsObserver = new AllNewsInfoDisplay();
    Observer statisticObserver = new StatisticDisplay();
    Observer certainCountryInfoDisplay = new CertainCountryInfoDisplay("Turkey");

    travelData.registerObserver(allNewsObserver);
    travelData.registerObserver(statisticObserver);
    travelData.registerObserver(certainCountryInfoDisplay);
    travelData.updateNews(News.builder()
        .openCountries(List.of("Turkey", "US", "Egypt", "Mexico"))
        .countriesWithIsolation(Map.of("Great Britain", 10))
        .build());

    System.out.println("------------------------------------------------------------------------------------------");
    travelData.deleteObserver(statisticObserver);
    travelData.updateNews(News.builder()
        .openCountries(List.of("US", "Egypt", "Mexico"))
        .countriesWithIsolation(Map.of("Great Britain", 10, "Turkey", 7))
        .build());

  }
}
