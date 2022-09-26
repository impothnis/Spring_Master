package io.pavan.spring.basics.movierecommendersystem.lesson1tightcoupling;

public class RecommenderImplementation {
  public String[] recommendMovies(String movie) {
    ContentBasedFilter filter = new ContentBasedFilter();
    String[] results = filter.getRecommendations("Finding Dory");
    // return the results
    return results;
  }
}
