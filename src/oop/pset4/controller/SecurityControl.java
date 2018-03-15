package oop.pset4.controller;

import oop.pset4.model.Luggage;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SecurityControl {

    private List<Luggage> rejectedLuggage = new ArrayList<>();

    public boolean isAllowedToTravel(Luggage luggage) {
        // validate that the luggage arrived at least 30 minutes before departure time
        // counting between the drop off time and the departure time
        // remember the luggage that has been rejected in order to facilitate it later on

        LocalDateTime departureTime = luggage.getDepartureTime();
        LocalDateTime dropOffTime = luggage.getDropOffTime();
        departureTime = departureTime.minusMinutes(30);

        if (isBoardingTimeAfterDropOfTime(departureTime, dropOffTime)){
            return true;
        }
        rejectedLuggage.add(luggage);
        return false;
    }

    private boolean isBoardingTimeAfterDropOfTime(LocalDateTime departureTime, LocalDateTime dropOffTime) {
        return departureTime.isAfter(dropOffTime);
    }

    public List<Luggage> getRejectedLuggage() {
        return rejectedLuggage;
    }
}
