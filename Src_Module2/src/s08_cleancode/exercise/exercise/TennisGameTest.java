package s08_cleancode.exercise.exercise;

public class TennisGameTest {
    public static String getScore(String FirstPlayerName, String SecondPlayerName, int firstCore, int secondCore) {
        String score = "";
        int tempScore=0;
        if (firstCore==secondCore)
        {
            switch (firstCore)
            {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;
            }
        }
        else if (firstCore>=4 || secondCore>=4)
        {
            int minusResult = firstCore-secondCore;
            if (minusResult==1) {
                score = "Advantage player1";
            }else if (minusResult ==-1) {;
                score ="Advantage player2";
            }else if (minusResult>=2) {
                score = "Win for player1";
            }else
                score ="Win for player2";
        }
        else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempScore = firstCore;
                } else
                    score += "-";
                tempScore = secondCore;
            }
            switch(tempScore)
            {
                case 0:
                    score+="Love";
                    break;
                case 1:
                    score+="Fifteen";
                    break;
                case 2:
                    score+="Thirty";
                    break;
                case 3:
                    score+="Forty";
                    break;
            }
        }
        return score;
    }
}




