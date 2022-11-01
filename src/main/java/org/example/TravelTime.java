package org.example;

public class TravelTime {
    public static void main(String[] args) {
        int distanceFromHomeToOfficeInKm = 15;
        double averageTaxiSpeedInKmPerHour = 40;
        double qaTravelTimeFromHomeToOffice = distanceFromHomeToOfficeInKm / averageTaxiSpeedInKmPerHour;
        double decelerationOfTransportRate = 0.7;
        double qaEveningTravelTime = qaTravelTimeFromHomeToOffice * decelerationOfTransportRate;
    }
}
