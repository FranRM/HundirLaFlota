
package com.fran.xogadores;

import java.io.Serializable;


public class Xogadores  implements Comparable<Xogadores>, Serializable{
    private String id;
    private int score;
    public Xogadores() {
    }

    public Xogadores(String id, int score) {
        this.id = id;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    @Override
    public int compareTo(Xogadores p){
    if (this.score < p.getScore()) {
            return 1;
        } else if (this.score > p.getScore()) {
            return -1;
        } else {
            return 0;
        }

    }
}
