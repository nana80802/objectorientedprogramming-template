package oop.pset4.controller.travelstage;

import oop.pset4.model.Luggage;

import java.time.Duration;
import java.time.LocalDateTime;

public class StorageArea implements TravelStage {

    @Override
    public Luggage process(Luggage luggage) {
        // TO DO add as much duration to the processing time as the departure time minus 30 minutes
        // if 30 minutes is not possible, the luggage won't be stored at all, which means that
        // no waiting time will be added at all

cd
        LocalDateTime departureTime = luggage.getDepartureTime();
        LocalDateTime dropOffTime = luggage.getDropOffTime();

        LocalDateTime boardingTime = departureTime.minusMinutes(30);

        if (isBoardingTimeAfterDropOfTime(boardingTime, dropOffTime)){
            Duration waitingDuration = luggage.getWaitingDuration();

            Duration duration = storageDuration(boardingTime,dropOffTime);

            Duration newWaitingTime= addToWaitingDuration(waitingDuration,duration);
            luggage.setWaitingDuration(newWaitingTime);
        }
        return luggage;
    }

    private Duration addToWaitingDuration(Duration waitingDuration, Duration duration) {
        return waitingDuration.plus(duration);
    }


    private Duration storageDuration(LocalDateTime boardingTime, LocalDateTime dropOffTime) {
        return Duration.between(dropOffTime,boardingTime);
    }


    private boolean isBoardingTimeAfterDropOfTime(LocalDateTime boardingTime, LocalDateTime dropOffTime) {
        return boardingTime.isAfter(dropOffTime);
    }
}
