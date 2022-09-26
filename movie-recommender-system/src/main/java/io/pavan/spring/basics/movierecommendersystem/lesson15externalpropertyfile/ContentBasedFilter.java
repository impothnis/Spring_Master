package io.pavan.spring.basics.movierecommendersystem.lesson15externalpropertyfile;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("CBF")
public class ContentBasedFilter implements Filter {

  // getRecommendations takes a movie as input and returns a list of similar
  // movies
  public String[] getRecommendations(String movie) {

    // implement logic of content based filter

    // return movie recommendations
    return new String[] { "Happy Feet", "Ice Age", "Shark Tale" };
  }
}
