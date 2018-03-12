package oop.pset1;

import oop.pset1.controller.MovieDatabaseSummarizer;
import oop.pset1.view.Summary;
import oop.pset1.view.SummaryDisplayer;

import java.util.Optional;

public class Pset1Main {

    public static void main(String[] args) {
        MovieDatabaseSummarizer summarizer = new MovieDatabaseSummarizer();
        SummaryDisplayer displayer = new SummaryDisplayer();

        Optional<Summary> summary = summarizer.summarize();
        if(summary.isPresent()){
            displayer.display(summary.get());
        } else {
            displayer.display();
        }
    }
}
