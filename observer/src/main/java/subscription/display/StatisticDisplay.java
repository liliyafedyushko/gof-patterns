package subscription.display;

import java.text.DecimalFormat;
import model.News;
import observer.Observer;
import subscription.DisplayElement;

public class StatisticDisplay implements Observer, DisplayElement {

  private News news;

  private static final DecimalFormat df = new DecimalFormat("0.00");

  @Override
  public void update(News news) {
    this.news = news;
    display();
  }

  @Override
  public void display() {
    System.out.println("This is statistic for travelers: percentage of open countries - " + gatherStatistic() + "%");
  }


  private String gatherStatistic() {
    final double allCountriesQuantity = 195;
    return df.format(((double) news.getOpenCountries().size() / allCountriesQuantity) * 100);
  }
}
