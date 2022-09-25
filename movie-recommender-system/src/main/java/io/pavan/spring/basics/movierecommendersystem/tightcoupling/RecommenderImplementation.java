package io.pavan.spring.basics.movierecommendersystem.tightcoupling;

public class RecommenderImplementation {
  public String[] recommendMovies(String movie) {
    ContentBasedFilter filter = new ContentBasedFilter();
    String[] results = filter.getRecommendations("Finding Dory");
    // return the results
    return results;
  }
}
