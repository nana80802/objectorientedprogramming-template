package oop.pset4.controller.travelstage;

import oop.pset4.model.Luggage;

import java.time.Duration;

public class TransportCart implements TravelStage {

    @Override
    public Luggage process(Luggage luggage) {
        // TO DO add 25 minutes to the processing time

        Duration waitingDuration = luggage.getWaitingDuration();

        Duration addDuration = addDuration(waitingDuration);

        luggage.setWaitingDuration(addDuration);

        return luggage;
    }

    private Duration addDuration(Duration waitingDuration) {
        return waitingDuration.plusMinutes(25);
    }
}
