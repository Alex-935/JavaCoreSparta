package com.sparta.day3.bandwidth;

public class BandwidthApp {
    static void main() {
        final int MBPS_TO_BPS_CONVERSION = 1_000_000;
        int maxBandwidth = 1000 * MBPS_TO_BPS_CONVERSION;
        int concurrentUsers = 200;
        int appA = 200_000 * concurrentUsers;
        int appB = 100_000 * concurrentUsers;
        int newApp = 350_000 * concurrentUsers;

        int currentUsage = appA + appB;
        int currentAvailability = maxBandwidth - currentUsage;
        int newUsage = currentUsage + newApp;
        double newAvailability = (maxBandwidth - newUsage) / (double)MBPS_TO_BPS_CONVERSION;

        System.out.printf("Network capacity (bps): %d%n", maxBandwidth);
        System.out.printf("Current usage (bps): %d%n", currentUsage);
        System.out.printf("Current availability (bps): %d%n", currentAvailability);
        System.out.printf("New usage requirement (bps): %d%n", newUsage);
        System.out.printf("Remaining bandwidth (Mbps): %f", newAvailability);
    }
}
