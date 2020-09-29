package ru.vsu.cs;

import java.util.Scanner;

public class Main {

    private static PointInTime enterPointInTime(String name) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter the %s point in time: ", name);
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int seconds = scanner.nextInt();
        return new PointInTime(hours, minutes, seconds);
    }

    private static int calcTimeDifferenceInSeconds(PointInTime firstPointInTime, PointInTime secondPointInTime) {
        TimeConstants timeConstants = new TimeConstants();

        int hoursDifferenceInSeconds = (secondPointInTime.hours - firstPointInTime.hours + timeConstants.hoursPerDay)
                * timeConstants.secondsPerHour;

        int minutesDifferenceInSeconds = (secondPointInTime.minutes - firstPointInTime.minutes)
                * timeConstants.secondsPerMinute;

        int secondsDifference = secondPointInTime.seconds - firstPointInTime.seconds;

        return (hoursDifferenceInSeconds + minutesDifferenceInSeconds + secondsDifference)
                % timeConstants.secondsPerDay;
    }

    public static void main(String[] args) {

        PointInTime firstPointInTime = enterPointInTime("first");

        PointInTime secondPointInTime = enterPointInTime("second");

        int secondsFromTheFirstPointToTheSecond = calcTimeDifferenceInSeconds(firstPointInTime, secondPointInTime);

        System.out.print("Seconds from moment 1 to moment 2: " + secondsFromTheFirstPointToTheSecond);
    }

}
