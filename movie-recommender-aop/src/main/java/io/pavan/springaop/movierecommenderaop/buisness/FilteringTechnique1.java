package io.pavan.springaop.movierecommenderaop.buisness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.pavan.springaop.movierecommenderaop.data.Movie;

@Service
public class FilteringTechnique1 {

	@Autowired
	private Movie movie;
	
	public String contentBasedFiltering() {
		String movieDetails = movie.getMovieDetails();
		return movieDetails;
	}
}
