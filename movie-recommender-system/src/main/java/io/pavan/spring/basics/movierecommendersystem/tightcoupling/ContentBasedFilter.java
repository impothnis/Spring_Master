package io.pavan.spring.basics.movierecommendersystem.tightcoupling;

public class ContentBasedFilter {
  public String[] getRecommendations(String movie) {
    // logic of content based filter
    return new String[] { "Happy Feet", "Ice Age", "Shark Tale" };
  }
}
