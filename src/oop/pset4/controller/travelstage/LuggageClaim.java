package oop.pset4.controller.travelstage;

import oop.pset4.model.Luggage;

import java.time.Duration;

public class LuggageClaim implements TravelStage {

    @Override
    public Luggage process(Luggage luggage) {
        // TO DO add 15 minutes to the processing time

        Duration waitingDuration = luggage.getWaitingDuration();
        Duration newDuration = addTimeTo(waitingDuration);
        luggage.setWaitingDuration(newDuration);


        return luggage;
    }

    private Duration addTimeTo(Duration waitingDuration) {
        return waitingDuration.plusMinutes(15);
    }
}
