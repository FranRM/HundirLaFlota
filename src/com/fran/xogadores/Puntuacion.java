
package com.fran.xogadores;

import java.util.ArrayList;
import java.util.Collections;


public class Puntuacion {
    
    public static final int MAX_SCORES = 3000;
    private ArrayList<Xogadores> scoresList = new ArrayList();

    public ArrayList<Xogadores> getScoresList() {
        return scoresList;
    }
       public void setScoresList(ArrayList<Xogadores> scoresList) {
        this.scoresList = scoresList;
    }

    public void addScore(Xogadores score) {
        scoresList.add(score);
        Collections.sort(scoresList);
        if(scoresList.size() > MAX_SCORES) {
            scoresList.remove(scoresList.size() - 1);
        }
    }

    public int getPosition(Xogadores score) {
        return scoresList.indexOf(score);
    }
    
    @Override
    public String toString() {
        String result = "";
        for(int i=0; i<scoresList.size(); i++) {
            Xogadores score = scoresList.get(i);
            result += (i+1) + "º: " + score.getId()+ ": " + score.getScore() + "\n";
        }
        return result;
    }
}
