package util;

import camp.nextstep.edu.missionutils.Console;

public class Input {
    public static String[] driversName(){
        String[] driversName = Console.readLine().split(",");

        return driversName;
    }

    public static int roundLimit(){
        return Integer.parseInt(Console.readLine());
    }
}
