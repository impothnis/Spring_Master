package io.pavan.spring.basics.movierecommendersystem.constructorandsetterinjection;

import org.springframework.stereotype.Component;

@Component

public class CollaborativeFilter implements Filter {

  public String[] getRecommendations(String movie) {
    // logic of collaborative filter
    return new String[] { "Finding Nemo", "Ice Age", "Toy Story" };
  }
}
