package oop.pset1.view;

public class SummaryDisplayer {
    public void display(Summary summary) {
        print("Movie Database Summury");
        print("---------");
        print("most rated films");
        summary.getTopRateMovies().forEach(System.out::println);
        print("---------");
        print("most hired actors");
        summary.getMostHiredActors().forEach(System.out::println);
        print("---------");
        print("most appearing movie genres");
        summary.getCommonGenres().forEach(System.out::println);
        print("---------");
        print("Actros male-female ratio");
        summary.getMaleFemaleRatio().forEach(System.out::println);



    }

    private void print(String text) {
        System.out.println(text);
    }

    public void display() {
        System.out.println("nothing to show");
    }
}
