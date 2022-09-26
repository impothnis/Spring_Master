package io.pavan.spring.basics.movierecommendersystem.proxy;

public interface Filter {
  public String[] getRecommendations(String movie);

}
