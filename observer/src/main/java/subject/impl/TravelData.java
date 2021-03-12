package subject.impl;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import model.News;
import observer.Observer;
import subject.Subject;

@Getter
public class TravelData implements Subject {

  private List<Observer> observers = new ArrayList<>();
  private News news;

  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void deleteObserver(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    observers.forEach(
        observer -> observer.update(news));
  }

  @Override
  public void updateNews(News news) {
    this.news = news;
    notifyObservers();
  }

}
