package io.pavan.spring.basics.movierecommendersystem.constructorandsetterinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

  @Autowired
  @Qualifier("CF")
  private Filter filter;

  public RecommenderImplementation(Filter filter) {
    super();
    this.filter = filter;
    System.out.println("Constructor invoked...");
  }

  // use a filter to find recommendations
  public String[] recommendMovies(String movie) {

    // print the name of interface implementation being used
    System.out.println("Name of the filter in use: " + filter.toString() + "\n");

    String[] results = filter.getRecommendations("Finding Dory");

    return results;
  }
}
