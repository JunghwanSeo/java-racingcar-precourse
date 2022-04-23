package domain;

import java.util.ArrayList;
import java.util.List;

public class Match {
    private int roundMax = 0;
    private String distance;
    private final List<String> ranker = new ArrayList<>();
    private final List<Driver> drivers = new ArrayList<>();

    public int getRoundMax() {
        return roundMax;
    }

    public void setRoundMax(int roundMax) {
        this.roundMax = roundMax;
    }

    public String getDistance() {
        return distance;
    }

    private void setDistance() {
        this.distance = "";
    }

    public List<String> getRanker() {
        return ranker;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public static Match init() {
        Match match = new Match();
        match.setDistance();

        return match;
    }

    public void driverRegistration(Driver driver){
        this.drivers.add(driver);
    }

    public void newRecord(String name, String distance){
        this.distance = distance;
        this.ranker.clear();
        this.ranker.add(name);
    }

    public void tie(String name){
        this.ranker.add(name);
    }
}
