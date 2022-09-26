package io.pavan.spring.basics.movierecommendersystem.lesson4autowiringprimarybean;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class RecommenderImplementation { // use filter interface to select filter
  @Autowired
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
