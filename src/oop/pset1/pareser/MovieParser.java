package oop.pset1.pareser;


import oop.pset1.model.Movie;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovieParser {

    public List<Movie> getMovies() {
        String filePath = "src/oop/pset1/data/movies.csv";

        try {
            Stream<String> lines = Files.lines(Paths.get(filePath));
            List<Movie> movieList = lines
                    .skip(1)
                    .map(s -> s.split(";"))
                    .filter(s -> s.length == 24)
                    .map(transferToMovie())
                    .collect(Collectors.toList());
            return movieList;

        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    private Function<String[], Movie> transferToMovie() {
        return item -> {
            Movie movie = new Movie();
            movie.setTitle(item[8]);
            movie.setRate(Double.parseDouble(item[22]));
            movie.setGenres(genresMaker(item[3]));

            return movie;
        };


        //return s -> new Movie();
    }

    private List<String> genresMaker(String s) {
        String replaceAll = s.replaceAll("\\[", "")
                .replaceAll("]", "")
                .replaceAll("},", ";")
                .replaceAll("}", "")
                .replaceAll("\\{", "")
                .replaceAll("'", "");

        return Arrays.stream(replaceAll.split(";"))
                .filter(e -> e.length() == 3)
                .map(item -> item.split(":")[2])
                .collect(Collectors.toList());

    }


}
