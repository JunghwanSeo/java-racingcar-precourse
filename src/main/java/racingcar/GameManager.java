package racingcar;

import domain.Match;

public class GameManager {
    public void run(){
        Match match = Match.init();
        DriverRegistration.init(match);
        Round.init(match);

        for(int round=0; match.getRoundMax()>round; round++){
            Round.play(match);
            roundEndDisplay();
        }

        matchResultDisplay(match);
    }

    private void roundEndDisplay(){
        System.out.println("");
    }

    private void matchResultDisplay(Match match){
        System.out.println("최종 우승자: " + String.join(",", match.getRanker()));
    }
}
