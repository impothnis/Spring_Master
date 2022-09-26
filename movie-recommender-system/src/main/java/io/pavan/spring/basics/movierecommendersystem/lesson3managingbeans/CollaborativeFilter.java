package io.pavan.spring.basics.movierecommendersystem.lesson3managingbeans;

import org.springframework.stereotype.Component;

@Component
public class CollaborativeFilter implements Filter {
  public String[] getRecommendations(String movie) {
    // logic of content based filter
    return new String[] { "Happy Feet", "Ice Age", "Shark Tale" };
  }

  public String toString() {
    return "CollaborativeFilter";
  }
}
