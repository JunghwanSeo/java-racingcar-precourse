package racingcar;

import domain.Driver;
import domain.Match;
import util.Input;

public class DriverRegistration {
    public static void init(Match match){
        String[] driversName = Input.driversName();

        for(String userName : driversName){
            match.driverRegistration(Driver.init(userName));
        }
    }
}
