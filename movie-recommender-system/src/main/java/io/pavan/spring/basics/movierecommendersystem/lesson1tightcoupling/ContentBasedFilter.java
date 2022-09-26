package io.pavan.spring.basics.movierecommendersystem.lesson1tightcoupling;

public class ContentBasedFilter {
  public String[] getRecommendations(String movie) {
    // logic of content based filter
    return new String[] { "Happy Feet", "Ice Age", "Shark Tale" };
  }
}
