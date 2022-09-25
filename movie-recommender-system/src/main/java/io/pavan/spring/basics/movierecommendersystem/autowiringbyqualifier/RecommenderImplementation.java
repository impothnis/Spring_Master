package io.pavan.spring.basics.movierecommendersystem.autowiringbyqualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
  @Autowired
  @Qualifier("CBF")
  private Filter filter;

  // use a filter to find recommendations
  public String[] recommendMovies(String movie) {

    // print the name of interface implementation being used
    System.out.println("Name of the filter in use: " + filter.toString() + "\n");

    String[] results = filter.getRecommendations("Finding Dory");

    return results;
  }
}
