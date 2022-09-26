package io.pavan.spring.basics.movierecommendersystem.lesson12cdiframework;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;

@Named
@Qualifier("CBF")
public class ContentBasedFilter implements Filter {

  // getRecommendations takes a movie as input and returns a list of similar
  // movies
  public String[] getRecommendations(String movie) {

    // implement logic of content based filter

    // return movie recommendations
    return new String[] { "Happy Feet", "Ice Age", "Shark Tale" };
  }

  public String toString() {
    return "ContentBasedFilter";
  }
}
