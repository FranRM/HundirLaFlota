/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fran.xogadores;

/**
 *
 * @author Fran & Luis
 */
public class Xogador {

    /*
    *Atributos de xogador, que son id y puntos de la persona que juega
     */
    private String id;
    private int points;

    /*
    *Toda la clase goza los getters y setters necesarios para poder acceder desde fuera.
     */
    public Xogador() {
    }

    public Xogador(String id, int points) {
        this.id = id;
        this.points = points;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Xogador{" + "ID=" + id + ", Points=" + points + '}';
    }

}
