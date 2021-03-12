package subject;

import model.News;
import observer.Observer;

public interface Subject {

  void registerObserver(Observer observer);

  void deleteObserver(Observer observer);

  void notifyObservers();

  void updateNews(News news);
}
