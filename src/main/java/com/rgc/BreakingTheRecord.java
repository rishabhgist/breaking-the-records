package com.rgc;

import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecord {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Storing first value in highest and lowest
        int highest = scores.get(0);
        int lowest = scores.get(0);
        // Storing score counts in the min, max variable
        int min = 0;
        int max = 0;
        // list of final score that will be returned with the function
        List<Integer> finalScores = new ArrayList<>();

        // Traversing through the scores list
        for (Integer score : scores) {
            if ((score <= lowest) && (score != lowest)) { // Checking if the score is less the lowest not equals to lowest
                lowest = score;
                min++;
            } else if ((score >= highest) && (score != highest)) { //Checking if the score is greater the highest not equals to highest
                highest = score;
                max++;
            }
        }
        // Storing the result into finalScore list
        finalScores.add(max);
        finalScores.add(min);

        // Returning the finalScore
        return finalScores;
    }
}
