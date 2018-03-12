package oop.pset1.view;

import java.util.List;

public class Summary {
    public List<String> getTopRateMovies() {
        return topRateMovies;
    }

    public void setTopRateMovies(List<String> topRateMovies) {
        this.topRateMovies = topRateMovies;
    }

    public List<String> getMostHiredActors() {
        return mostHiredActors;
    }

    public void setMostHiredActors(List<String> mostHiredActors) {
        this.mostHiredActors = mostHiredActors;
    }

    public List<String> getCommonGenres() {
        return commonGenres;
    }

    public void setCommonGenres(List<String> commonGenres) {
        this.commonGenres = commonGenres;
    }

    public List<String> getMaleFemaleRatio() {
        return maleFemaleRatio;
    }

    public void setMaleFemaleRatio(List<String> maleFemaleRatio) {
        this.maleFemaleRatio = maleFemaleRatio;
    }

    private List<String> topRateMovies;
    private List<String> mostHiredActors;
    private List<String> commonGenres;
    private List<String> maleFemaleRatio;

}
