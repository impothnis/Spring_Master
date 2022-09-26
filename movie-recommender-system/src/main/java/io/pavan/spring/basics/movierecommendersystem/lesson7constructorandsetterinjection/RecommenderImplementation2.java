package io.pavan.spring.basics.movierecommendersystem.lesson7constructorandsetterinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation2 {

  private Filter filter;

  // Autowiring by name
  @Autowired
  @Qualifier("contentBasedFilter")
  public void setContentBasedFilter(Filter contentBasedFilter) {
    this.filter = contentBasedFilter;
    System.out.println("Setter method invoked..");
  }

  // use a filter to find recommendations
  public String[] recommendMovies(String movie) {

    // print the name of interface implementation being used
    System.out.println("\nName of the filter in use: " + filter + "\n");

    String[] results = filter.getRecommendations("Finding Dory");

    return results;
  }
}
