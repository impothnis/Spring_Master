package io.pavan.spring.basics.movierecommendersystem.singletonandprototype;

public interface Filter {
  public String[] getRecommendations(String movie);

}
