package oop.pset4.controller.travelstage;

import oop.pset4.model.Luggage;

import java.time.Duration;
import java.time.LocalDateTime;

public class Flight implements TravelStage {

    @Override
    public Luggage process(Luggage luggage) {
        // TO DO add travel duration to the processing time
        // Update arrival time

        Duration flightDuration = luggage.getFlightDuration();
        Duration waitingDuration = luggage.getWaitingDuration();

        Duration newWithingTime = addTravelDurationToProcessingTime(waitingDuration,flightDuration);

        luggage.setWaitingDuration(newWithingTime);
        //-------------
        LocalDateTime departureTime = luggage.getDepartureTime();
        LocalDateTime updatedArrivalTime = updateTrrivalTime(departureTime,flightDuration);
        luggage.setArrivalTime(updatedArrivalTime);

        return luggage;
    }

    private LocalDateTime updateTrrivalTime(LocalDateTime departureTime, Duration flightDuration) {
        return departureTime.plus(flightDuration);
    }

    private Duration addTravelDurationToProcessingTime(Duration waitingDuration, Duration flightDuration) {
        return waitingDuration.plus(flightDuration);
    }
}
