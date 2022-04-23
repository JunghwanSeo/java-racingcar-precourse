package domain;

public class Driver {
    private String name;
    private String distance;

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getDistance() {
        return distance;
    }

    private void setDistance(String distance) {
        this.distance = distance;
    }

    public static Driver init(String name){
        Driver driver = new Driver();
        driver.setName(name);
        driver.setDistance("");

        return driver;
    }

    public void move(){
        this.distance += "-";
    }
}
