package io.pavan.spring.basics.movierecommendersystem.lesson2loosecoupling;

public interface Filter {
  public String[] getRecommendations(String movie);

}
