package model;

import java.util.List;
import java.util.Map;
import lombok.Data;

public class News {

  private List<String> openCountries;
  private Map<String, Integer> countriesWithIsolation;

  News(List<String> openCountries, Map<String, Integer> countriesWithIsolation) {
    this.openCountries = openCountries;
    this.countriesWithIsolation = countriesWithIsolation;
  }

  public static NewsBuilder builder() {
    return new NewsBuilder();
  }

  public List<String> getOpenCountries() {
    return this.openCountries;
  }

  public Map<String, Integer> getCountriesWithIsolation() {
    return this.countriesWithIsolation;
  }

  public static class NewsBuilder {
    private List<String> openCountries;
    private Map<String, Integer> countriesWithIsolation;

    NewsBuilder() {
    }

    public NewsBuilder openCountries(List<String> openCountries) {
      this.openCountries = openCountries;
      return this;
    }

    public NewsBuilder countriesWithIsolation(Map<String, Integer> countriesWithIsolation) {
      this.countriesWithIsolation = countriesWithIsolation;
      return this;
    }

    public News build() {
      return new News(openCountries, countriesWithIsolation);
    }

    public String toString() {
      return "News.NewsBuilder(openCountries=" + this.openCountries + ", countriesWithIsolation=" + this.countriesWithIsolation + ")";
    }
  }

}
