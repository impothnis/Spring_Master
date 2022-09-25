package io.pavan.spring.basics.movierecommendersystem.autowiringbyqualifier;

public interface Filter {
  public String[] getRecommendations(String movie);

}
