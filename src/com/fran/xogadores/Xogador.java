/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fran.xogadores;

/**
 *
 * @author femio23
 */
public class Xogador {
private String ID;
   private int Points;

    public Xogador() {
    }

    public Xogador(String ID, int Points) {
        this.ID = ID;
        this.Points = Points;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getPoints() {
        return Points;
    }

    public void setPoints(int Points) {
        this.Points = Points;
    }

    @Override
    public String toString() {
        return "Xogador{" + "ID=" + ID + ", Points=" + Points + '}';
    }
   
}
