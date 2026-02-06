package com.sparta.day3.bandwidth;

public class BandwidthApp {

    public static void main(String[] args) {

        int maxBandwidth = 1000;//1000 Mbps, 1,000,000,000bps
        int concurrentUsers = 200;

        //current application bandwidth requirements
        int appABandwidthReq = 200000;//bps
        int appBBandwidthReq = 100000;//bps

        // New Application requires 350,000 bps
        int newApplicationReq = 350000;


        //Network Capacity
        // Mega = 1x10^6
        int networkCapacity = 1000 * 1000000;
        System.out.println("The network capacity in bps is: " + networkCapacity);

        //Current Usage
        // 200 * both applications
        int currentUsage = (appABandwidthReq + appBBandwidthReq) * 200;
        System.out.println("The current usage in bps is: " + currentUsage);

        //Current Availability
        //network capacity - current usage
        int currentAvailability = networkCapacity - currentUsage;
        System.out.println("The current availability is: " + currentAvailability);

        //New Usage requirements
        // App a, b and c * 200
        int newUsageRequirements = (appABandwidthReq + appBBandwidthReq + newApplicationReq) * 200;
        System.out.println("The new usage requirements are: " + newUsageRequirements);

        //bandwidth available if the new application is installed
        // network capacity - new usage requirements
        int newBandwidthAvailability = networkCapacity - newUsageRequirements;
        System.out.println("The new bandwidth available after the new application is installed is: " + newBandwidthAvailability);
    }
}
