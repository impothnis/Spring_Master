package io.pavan.spring.basics.movierecommendersystem.autowiringprimarybean;

public interface Filter {
  public String[] getRecommendations(String movie);

}
