package io.pavan.spring.basics.movierecommendersystem.autowiringbyname;

public interface Filter {
  public String[] getRecommendations(String movie);

}
