package observer;

import model.News;
import subscription.DisplayElement;

public interface Observer extends DisplayElement {

  void update(News news);

  void display();
}
