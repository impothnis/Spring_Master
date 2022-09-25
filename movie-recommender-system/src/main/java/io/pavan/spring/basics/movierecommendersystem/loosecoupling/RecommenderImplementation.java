package io.pavan.spring.basics.movierecommendersystem.loosecoupling;

public class RecommenderImplementation { // use filter interface to select filter
  private Filter filter;

  public RecommenderImplementation(Filter filter) {
    super();
    this.filter = filter;
  }

  // use a filter to find recommendations
  public String[] recommendMovies(String movie) {

    // print the name of interface implementation being used
    System.out.println("Name of the filter in use: " + filter.toString() + "\n");

    String[] results = filter.getRecommendations("Finding Dory");

    return results;
  }
}
