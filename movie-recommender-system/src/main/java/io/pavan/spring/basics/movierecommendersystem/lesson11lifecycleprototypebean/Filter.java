package io.pavan.spring.basics.movierecommendersystem.lesson11lifecycleprototypebean;

public interface Filter {
  public String[] getRecommendations(String movie);
}
