package oop.pset4.controller.travelstage;

import oop.pset4.model.Luggage;

import java.time.Duration;

public class DropOffStand implements TravelStage {

    @Override
    public Luggage process(Luggage luggage) {
        // TO DO add 10 minutes to the processing time

        Duration waitingDuration = luggage.getWaitingDuration();

        Duration newDuration = newWithingDuration(waitingDuration);

        luggage.setWaitingDuration(newDuration);

        return luggage;
    }

    private Duration newWithingDuration(Duration waitingDuration) {
        return waitingDuration.plusMinutes(10);
    }
}
