package io.pavan.spring.basics.movierecommendersystem.lesson12cdiframework;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;

//Alternative to @component
@Named
public class RecommenderImplementation {
  // Alternative @autowired
  @Inject
  @Qualifier("CBF")
  private Filter filter;

  public String toString() {
    return "RecommenderImplementation";
  }

  public String getFilter() {
    return filter.toString();
  }

  // use a filter to find recommendations
  public String[] recommendMovies(String movie) {

    // print the name of interface implementation being used
    System.out.println("Name of the filter in use: " + filter.toString() + "\n");

    String[] results = filter.getRecommendations("Finding Dory");

    return results;
  }
}
