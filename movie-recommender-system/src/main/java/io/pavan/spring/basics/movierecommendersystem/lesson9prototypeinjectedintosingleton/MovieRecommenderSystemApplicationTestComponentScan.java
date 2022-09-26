package io.pavan.spring.basics.movierecommendersystem.lesson9prototypeinjectedintosingleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
// Case 1 - Without Component Scan -
// ContentBasedFilter bean found = true
// CollaborativeFilter bean found = false

// Case 2 - @ComponentScan(basePackages =
// "io.datajek.spring.basics.movierecommendersystem.lesson10")
// ContentBasedFilter bean found = false
// CollaborativeFilter bean found = true

// @ComponentScan(basePackages =
// "io.pavan.spring.basics.movierecommendersystem.componentscan")

// Case 3 - ComponentScan(basePackages = {
// "io.pavan.spring.basics.movierecommendersystem.componentscan",
// "io.datajek.spring.basics.movierecommendersystem.lesson9prototypeinjectedintosingleton"
// })
// ContentBasedFilter bean found = true
// CollaborativeFilter bean found = true
// @ComponentScan(basePackages = {
// "io.pavan.spring.basics.movierecommendersystem.componentscan",
// "io.datajek.spring.basics.movierecommendersystem.lesson9prototypeinjectedintosingleton"
// })

// Case 4 - Filter Types

@ComponentScan(basePackages = "io.pavan.spring.basics.movierecommendersystem.componentscan")
@ComponentScan(includeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = "io.datajek.spring.basics.movierecommendersystem.lesson9prototypeinjectedintosingleton.*"))

public class MovieRecommenderSystemApplicationTestComponentScan {

	public static void main(String[] args) {

		ApplicationContext appContext = SpringApplication.run(
				MovieRecommenderSystemApplication.class, args);

		// For Testing Component Scan
		System.out.println("ContentBasedFilter bean found = " +
				appContext.containsBean("contentBasedFilter"));
		System.out.println("CollaborativeFilter bean found = " +
				appContext.containsBean("collaborativeFilter"));

		// ApplicationContext manages the beans and dependencies
		// ApplicationContext appContext =
		// SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		// Retrieve and print singleton bean from application context
		// ContentBasedFilter filter = appContext.getBean(ContentBasedFilter.class);
		// System.out.println("\nContentBasedFilter bean with singleton scope");
		// System.out.println(filter);

		// // Retrieve and print prototype bean from the singleton bean twice
		// Movie movie1 = filter.getMovie();
		// Movie movie2 = filter.getMovie();
		// Movie movie3 = filter.getMovie();

		// System.out.println("\nMovie bean with prototype scope");
		// System.out.println(movie1);
		// System.out.println(movie2);
		// System.out.println(movie3);

		// // Print number of instances of each bean
		// System.out.println("\nContentBasedFilter instances created: " +
		// ContentBasedFilter.getInstances());
		// System.out.println("Movie instances created: " + Movie.getInstances());
	}
}
