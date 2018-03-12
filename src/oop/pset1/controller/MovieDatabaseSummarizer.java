package oop.pset1.controller;

import oop.pset1.model.Movie;
import oop.pset1.pareser.MovieParser;
import oop.pset1.view.Summary;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MovieDatabaseSummarizer {
    public Optional<Summary> summarize() {
        List<Movie> movies = new MovieParser().getMovies();

        List<String> topRateMovies = movies.stream()
                .sorted((e1,e2) -> e2.getRate().compareTo(e1.getRate()))
                .limit(5)
                .map(movie -> movie.getTitle() + " (" + movie.getRate() + ")" )
                .collect(Collectors.toList());

//        //List<String> mostHiredActors = movies.stream()
//        List<String> commonGenres = movies.stream()
//                //.map(movie -> movie.getGenres())
//                .map(Movie::getGenres)
//                .flatMap(List::stream)
//                .collect
//


        List<String> maleFemaleRatio;




        Summary summary = new Summary();
        summary.setTopRateMovies(topRateMovies);


        return Optional.of(summary);
    }
}
