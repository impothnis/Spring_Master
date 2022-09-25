package io.pavan.spring.basics.movierecommendersystem.loosecoupling;

public interface Filter {
  public String[] getRecommendations(String movie);

}
