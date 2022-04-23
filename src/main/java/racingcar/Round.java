package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import domain.Driver;
import domain.Match;
import util.Input;

public class Round {
    public static void init(Match match) {
        match.setRoundMax(Input.roundLimit());
    }

    public static void play(Match match){
        for(Driver driver : match.getDrivers()){
            if(Randoms.pickNumberInRange(0,9)>=4){
                driver.move();
            }

            if(match.getDistance().length()<driver.getDistance().length()){
                match.newRecord(driver.getName(), driver.getDistance());
            }else if(match.getDistance().length()==driver.getDistance().length() && !match.getRanker().contains(driver.getName())){
                match.tie(driver.getName());
            }

            roundResultDisplay(driver);
        }
    }

    private static void roundResultDisplay(Driver driver){
        System.out.println(driver.getName() + " : " + driver.getDistance());
    }
}
