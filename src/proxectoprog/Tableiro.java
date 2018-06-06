/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxectoprog;

import javax.swing.JOptionPane;
import com.fran.metodos.Entradaspred;

public class Tableiro {

    static private String tamaño;
    private static int tamañotab, acertoH, acertoM, acertofin, aux1 = 15, aux2 = 15;
    static private String[][] taH;
    static private int puntuacion = 0;
    private static String[][] taM, tiroH;
    static int direccion, bcolocados = 0;

    /**
     * Constructor parametrico da clase taboleiro.
     *
     * @param tamaño Valor a engadir.
     */
    public Tableiro(String tamaño) {
        setTamaño(tamaño);
    }

    /**
     * Getter da variable que conta os acertos do xogador.
     *
     * @return
     */
    public static int getAcertoH() {
        return acertoH;
    }

    public static String[][] getTiroH() {
        return tiroH;
    }

    /**
     * Getter do array TableiroHumano.
     *
     * @return Retorna dito tableiro.
     */
    public String[][] getTaH() {
        return taH;
    }

    /**
     * Getter de Tamaño que é o string que garda o nome.
     *
     * @return Devolve dito string.
     */
    public String getTamaño() {
        return tamaño;
    }

    /**
     * Setter de Tamaño.
     *
     * @param tamaño Valor que se desexa engadir, o cal sestará restrinxido no
     * futuro,
     */
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
        modoxogo();
    }

    /**
     * Getter de TamañoTab, que é un int que garda o tamaño de ancho e alto da
     * matriz.
     *
     * @return Devolve dito valor.
     */
    public int getTamañotab() {
        return tamañotab;
    }

    /**
     * Setter de TamañoTab, que é un int que garda o tamaño de ancho e alto da
     * matriz.
     *
     * @param tamañotab Valor numérico a inserir.
     */
    public void setTamañotab(int tamañotab) {
        this.tamañotab = tamañotab;
    }

    /**
     * Getter da variable de AcertoFin.
     *
     * @return Retorna a variable limite de impactos maximos a os que se xoga.
     */
    public int getAcertofin() {
        return acertofin;
    }

    /**
     * Setter de acertofin.
     *
     * @param acertofin Valor de acertos máximos ata o que se xogará
     */
    public void setAcertofin(int acertofin) {
        this.acertofin = acertofin;
    }

    /**
     * Método que, segundo o valor en Tamaño, parametriza o Tamaño das taboas e
     * o numero de impactos a os que se xoga. Para maior simplificación, neste
     * caso está limitado a o menor tamaño.
     */
    private void modoxogo() {

        setTamañotab(6);
        setAcertofin(2);
        crearTab();
        montarTab();
    }

    /**
     * Método que inicializa as tres taboas que utilizamos(tiroHumano,
     * TaboaHumano e TaboaMáquina), segundo o tamaño anteriormente designado, e
     * dando o valor "espacio" a cada posición.
     */
    public void crearTab() {

        taH = new String[tamañotab][tamañotab];
        for (int i = 0; i < tamañotab; i++) {

            for (int j = 0; j < tamañotab; j++) {
                taH[i][j] = " ";
            }
        }
        taM = new String[tamañotab][tamañotab];
        for (int i = 0; i < tamañotab; i++) {

            for (int j = 0; j < tamañotab; j++) {
                taM[i][j] = " ";
            }
        }
        tiroH = new String[tamañotab][tamañotab];
        for (int i = 0; i < tamañotab; i++) {

            for (int j = 0; j < tamañotab; j++) {
                tiroH[i][j] = " ";
            }
        }
    }

    /**
     * Método utilizado para visualizar a taboa da maquina, evisualizar os seus
     * barcos.
     */
    public void visualizartabM() {

        System.out.println("Tableiro da máquina");
        System.out.println("| |a|b|c|d|e|f|");
        for (int i = 0; i < tamañotab; i++) {
            System.out.print("|" + (i + 1) + "|");
            for (int j = 0; j < tamañotab; j++) {
                System.out.print(taM[i][j] + "|");
            }
            System.out.println();
        }
    }

    /**
     * Método que permite consultar, se unha posición en particular dunha taboa
     * en particular , se esta ou non vacia, retornando o booleano
     * correspondente.
     *
     * @param tab Taboa a consultar.
     * @param a Posicion de fila.
     * @param b Posicion de columna.
     * @return Boolean que retorna true se esta ocupado, e viceversa.
     */
    static public boolean ocupado(String[][] tab, int a, int b) {
        if (tab[a][b].equals(" ")) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Metodo que define, en función do tamaño, os barcos a colocar.
     */
    public void montarTab() {
        colocardestm();
        colocarsubm();
        colocarportm();
    }

    /**
     * Metodo que coloca automaticamente un destructor no taboleiro da maquina.
     */
    public void colocardestm() {
        if ((Math.random()) >= 0.5) {
            while ((aux1 + 1) >= tamañotab || (aux2) >= tamañotab || ocupado(taM, aux1, aux2) || ocupado(taM, aux1 + 1, aux2)) {
                aux1 = (int) (Math.random() * 4 + 1);
                aux2 = (int) (Math.random() * 4 + 1);
            }
            taM[aux1][aux2] = "d";
            taM[aux1 + 1][aux2] = "d";
        } else {
            while ((aux1) >= tamañotab || (aux2 + 1) >= tamañotab || ocupado(taM, aux1, aux2) || ocupado(taM, aux1, aux2 + 1)) {
                aux1 = (int) (Math.random() * 4 + 1);
                aux2 = (int) (Math.random() * 4 + 1);
            }
            taM[aux1][aux2] = "d";
            taM[aux1][aux2 + 1] = "d";
        }
        System.out.println("Barco colocado.");
        aux1 = 15;
        aux2 = 15;
    }

    /**
     * Metodo que coloca automaticamente un submarino na taboa da maquina.
     */
    public void colocarsubm() {
        if ((Math.random()) >= 0.5) {
            while ((aux1 + 2) >= tamañotab || (aux2) >= tamañotab || ocupado(taM, aux1, aux2) || ocupado(taM, aux1 + 1, aux2) || ocupado(taM, aux1 + 2, aux2)) {
                aux1 = (int) (Math.random() * 4 + 1);
                aux2 = (int) (Math.random() * 4 + 1);
            }
            taM[aux1][aux2] = "s";
            taM[aux1 + 1][aux2] = "s";
            taM[aux1 + 2][aux2] = "s";
        } else {
            while ((aux1) >= tamañotab || (aux2 + 2) >= tamañotab || ocupado(taM, aux1, aux2) || ocupado(taM, aux1, aux2 + 1) || ocupado(taM, aux1, aux2 + 2)) {
                aux1 = (int) (Math.random() * 4 + 1);
                aux2 = (int) (Math.random() * 4 + 1);
            }
            taM[aux1][aux2] = "s";
            taM[aux1][aux2 + 1] = "s";
            taM[aux1][aux2 + 2] = "s";
        }
        System.out.println("Barco colocado.");
        aux1 = 15;
        aux2 = 15;

    }

    /**
     * Método que coloca un cruceiro automaticamente na taboa da maquina.
     */
    public void colocarcruzm() {
        if ((Math.random()) >= 0.5) {
            while ((aux1 + 3) >= tamañotab || (aux2) >= tamañotab || ocupado(taM, aux1, aux2) || ocupado(taM, aux1 + 1, aux2) || ocupado(taM, aux1 + 2, aux2) || ocupado(taM, aux1 + 3, aux2)) {
                aux1 = (int) (Math.random() * 4 + 1);
                aux2 = (int) (Math.random() * 4 + 1);
            }
            taM[aux1][aux2] = "c";
            taM[aux1 + 1][aux2] = "c";
            taM[aux1 + 2][aux2] = "c";
            taM[aux1 + 3][aux2] = "c";
        } else {
            while ((aux1) >= tamañotab || (aux2 + 3) >= tamañotab || ocupado(taM, aux1, aux2) || ocupado(taM, aux1, aux2 + 1) || ocupado(taM, aux1, aux2 + 2) || ocupado(taM, aux1, aux2 + 3)) {
                aux1 = (int) (Math.random() * 4 + 1);
                aux2 = (int) (Math.random() * 4 + 1);
            }
            taM[aux1][aux2] = "c";
            taM[aux1][aux2 + 1] = "c";
            taM[aux1][aux2 + 2] = "c";
            taM[aux1][aux2 + 3] = "c";
        }
        System.out.println("Barco colocado.");
        aux1 = 15;
        aux2 = 15;
    }

    /**
     * Método que coloca automáticamente un portaavions na taboa da maquina.
     */
    public void colocarportm() {
        if ((Math.random()) >= 0.5) {
            while ((aux1 + 4) >= tamañotab || (aux2) >= tamañotab || ocupado(taM, aux1, aux2) || ocupado(taM, aux1 + 1, aux2) || ocupado(taM, aux1 + 2, aux2) || ocupado(taM, aux1 + 3, aux2) || ocupado(taM, aux1 + 4, aux2)) {
                aux1 = (int) (Math.random() * 4 + 1);
                aux2 = (int) (Math.random() * 4 + 1);
            }
            taM[aux1][aux2] = "p";
            taM[aux1 + 1][aux2] = "p";
            taM[aux1 + 2][aux2] = "p";
            taM[aux1 + 3][aux2] = "p";
            taM[aux1 + 4][aux2] = "p";
        } else {
            while ((aux1) >= tamañotab || (aux2 + 4) >= tamañotab || ocupado(taM, aux1, aux2) || ocupado(taM, aux1, aux2 + 1) || ocupado(taM, aux1, aux2 + 2) || ocupado(taM, aux1, aux2 + 3) || ocupado(taM, aux1, aux2 + 4)) {
                aux1 = (int) (Math.random() * 4 + 1);
                aux2 = (int) (Math.random() * 4 + 1);
            }
            taM[aux1][aux2] = "p";
            taM[aux1][aux2 + 1] = "p";
            taM[aux1][aux2 + 2] = "p";
            taM[aux1][aux2 + 3] = "p";
            taM[aux1][aux2 + 4] = "p";
        }
        System.out.println("Barco colocado.");
        aux1 = 15;
        aux2 = 15;
    }

    /**
     * Metodo que coloca un destructor, nas coordenadas dadas polo xogador, no
     * seu tableiro.
     */
    public static void colocardesth(int coordenadaX, int coordenadaY, int direccion) {

        if (direccion == 1) {
            while (ocupado(taH, coordenadaX, coordenadaY) || ocupado(taH, coordenadaX + 1, coordenadaY)) {
                JOptionPane.showMessageDialog(null, "Coordenadas ocupadas, introduza outras.");
            }
            taH[coordenadaX][coordenadaY] = "d";
            taH[coordenadaX + 1][coordenadaY] = "d";
        } else {
            while (ocupado(taH, coordenadaX, coordenadaY) || ocupado(taH, coordenadaX, coordenadaY + 1)) {

            }
            taH[coordenadaX][coordenadaY] = "d";
            taH[coordenadaX][coordenadaY + 1] = "d";
        }
        System.out.println("Barco colocado.");
    }

    /**
     * Metodo que coloca un submarino, nas coordenadas dadas polo xogador, no
     * seu tableiro.
     */
    public static void colocarsubh(int coordenadaX, int coordenadaY, int direccion) {

        if (direccion == 1) {
            if ((coordenadaX + 2) >= tamañotab || (coordenadaY) >= tamañotab || ocupado(taH, coordenadaX, coordenadaY) || ocupado(taH, coordenadaX + 1, coordenadaY) || ocupado(taH, coordenadaX + 2, coordenadaY)) {
                JOptionPane.showMessageDialog(null, "Coordenadas erroneas, introduza outras.");
            } else {
                taH[coordenadaX][coordenadaY] = "s";
                taH[coordenadaX + 1][coordenadaY] = "s";
                taH[coordenadaX + 2][coordenadaY] = "s";
            }
        } else {
            if ((coordenadaX) >= tamañotab || (coordenadaY + 2) >= tamañotab || ocupado(taH, coordenadaX, coordenadaY) || ocupado(taH, coordenadaX, coordenadaY + 1) || ocupado(taH, coordenadaX, coordenadaY + 2)) {
                JOptionPane.showMessageDialog(null, "Coordenadas erroneas, introduza outras.");
            } else {
                taH[coordenadaX][coordenadaY] = "s";
                taH[coordenadaX][coordenadaY + 1] = "s";
                taH[coordenadaX][coordenadaY + 2] = "s";
            }
        }
        System.out.println("Barco colocado.");
    }

    /**
     * Metodo que coloca un cruceiro, nas coordenadas dadas polo xogador, no seu
     * tableiro.
     */
    public static void colocarcruzh(int coordenadaX, int coordenadaY, int direccion) {

        if (direccion == 1) {
            if ((coordenadaX + 3) >= tamañotab || (coordenadaY) >= tamañotab || ocupado(taH, coordenadaX, coordenadaY) || ocupado(taH, coordenadaX + 1, coordenadaY) || ocupado(taH, coordenadaX + 2, coordenadaY) || ocupado(taH, coordenadaX + 3, coordenadaY)) {
                JOptionPane.showMessageDialog(null, "Coordenadas erroneas, introduza outras.");
            } else {
                taH[coordenadaX][coordenadaY] = "c";
                taH[coordenadaX + 1][coordenadaY] = "c";
                taH[coordenadaX + 2][coordenadaY] = "c";
                taH[coordenadaX + 3][coordenadaY] = "c";
            }
        } else {
            if ((coordenadaX) >= tamañotab || (coordenadaY + 3) >= tamañotab || ocupado(taH, coordenadaX, coordenadaY) || ocupado(taH, coordenadaX, coordenadaY + 1) || ocupado(taH, coordenadaX, coordenadaY + 2) || ocupado(taH, coordenadaX, coordenadaY + 3)) {
                JOptionPane.showMessageDialog(null, "Coordenadas erroneas, introduza outras.");
            } else {
                taH[coordenadaX][coordenadaY] = "c";
                taH[coordenadaX][coordenadaY + 1] = "c";
                taH[coordenadaX][coordenadaY + 2] = "c";
                taH[coordenadaX][coordenadaY + 3] = "c";
            }
            System.out.println("Barco colocado.");
        }
    }

    /**
     * Metodo que coloca un portaavions, nas coordenadas dadas polo xogador, no
     * seu tableiro.
     */
    public static void colocarporth(int coordenadaX, int coordenadaY, int direccion) {
        if (direccion == 1) {
            if ((coordenadaX + 4) >= tamañotab || (coordenadaY) >= tamañotab || ocupado(taH, coordenadaX, coordenadaY) || ocupado(taH, coordenadaX + 1, coordenadaY) || ocupado(taH, coordenadaX + 2, coordenadaY) || ocupado(taH, coordenadaX + 3, coordenadaY) || ocupado(taH, coordenadaX + 4, coordenadaY)) {
                JOptionPane.showMessageDialog(null, "Coordenadas erroneas, introduza outras.");
            } else {
                taH[coordenadaX][coordenadaY] = "p";
                taH[coordenadaX + 1][coordenadaY] = "p";
                taH[coordenadaX + 2][coordenadaY] = "p";
                taH[coordenadaX + 3][coordenadaY] = "p";
                taH[coordenadaX + 4][coordenadaY] = "p";
            }
        } else {
            if ((coordenadaX) >= tamañotab || (coordenadaY + 4) >= tamañotab || ocupado(taH, coordenadaX, coordenadaY) || ocupado(taH, coordenadaX, coordenadaY + 1) || ocupado(taH, coordenadaX, coordenadaY + 2) || ocupado(taH, coordenadaX, coordenadaY + 3) || ocupado(taH, coordenadaX, coordenadaY + 4)) {
                JOptionPane.showMessageDialog(null, "Coordenadas erroneas, introduza outras.");
            } else {
                taH[coordenadaX][coordenadaY] = "p";
                taH[coordenadaX][coordenadaY + 1] = "p";
                taH[coordenadaX][coordenadaY + 2] = "p";
                taH[coordenadaX][coordenadaY + 3] = "p";
                taH[coordenadaX][coordenadaY + 4] = "p";
            }
        }
        System.out.println("Barco colocado.");
    }

    /**
     * Metodo que comproba se se alcanzou a puntuación que premite finalizar a
     * partida.
     *
     * @return Booleano que permite coñecer se se alcanzou o estatus de
     * GameOver.
     */
    public boolean eGameOver() {
        return !(acertoH < acertofin && acertoM < acertofin);
    }

    /**
     * Metodo empregado para poñer a 0 os contadores ó reiniciar a partida.
     */
    public void resetearAcertos() {
        acertoH = 0;
        acertoM = 0;
    }

    /**
     * Metodo validador das coordenadas introducidas pola maquina
     *
     * @param coordenadas Array de coordenadas a comprobar.
     * @return Booleano que nos indica a validez de ditas coordenadas.
     */
    public boolean eCoordenadasMaquinaValida(int[] coordenadas) {
        return !(coordenadas[0] >= tamañotab || coordenadas[1] >= tamañotab);
    }

    /**
     * Metodo que se encarga de comprobar os efectos dos disparos da maquina.
     *
     * @param avisosxogar JOptionPane que introducimos para o seu futuro
     * desplegue.
     * @param coordenadasX
     * @param coordenadasY
     * @return Booleano que indica se o disparo foi acertado ou non.
     */
    public boolean comprobarCoordenadasMaquina(JOptionPane avisosxogar, int coordenadasX, int coordenadasY) {
        if (taH[coordenadasX][coordenadasY].equals("d") || taH[coordenadasX][coordenadasY].equals("s") || taH[coordenadasX][coordenadasY].equals("c") || taH[coordenadasX][aux2].equals("p")) {
            taH[coordenadasX][coordenadasY] = "X";
            avisosxogar.showMessageDialog(null, "Fogo enemigo entrante... Impacto!!!");
            acertoM++;
        } else {
            taH[coordenadasX][coordenadasY] = "A";
            avisosxogar.showMessageDialog(null, "Fogo enemigo entrante... Auga!!!");
        }
        return true;
    }

    /**
     * Método que permite convertir as letras que indican a direccion a os
     * números que permiten definila.
     *
     * @param s String a consultar.
     * @return Int xa convertido
     */
    /**
     * Método que permite disparar e comprobar o resultado do disparo a o
     * xogador.
     *
     * @param elevacion
     * @param direccion
     */
    public boolean comprobarDisparoHumano(int elevacion, int direccion) {
        if (taM[elevacion][direccion].equals("d") || taM[elevacion][direccion].equals("s") || taM[elevacion][direccion].equals("c") || taM[elevacion][direccion].equals("p")) {
            tiroH[elevacion][direccion] = "X";
            JOptionPane.showMessageDialog(null, "Impacto");
            acertoH++;
            return true;
        } else {
            tiroH[elevacion][direccion] = "A";
            JOptionPane.showMessageDialog(null, "Auga");
            return false;
        }
    }

    /**
     * Método que permite introducir as coordenadas para o disparo do xogador.
     *
     * @param avisosXogar JoptionPane requerido.
     * @return Retorna as coordenadas en forma de vector.
     */
    /**
     * Método que permite obter as coordenadas de disparo da máquina.
     *
     * @return Coordenadas de disparo en forma de vector.
     */
    public int[] obterCordenadasMaquina() {
        aux1 = (int) (Math.random() * tamañotab);
        aux2 = (int) (Math.random() * tamañotab);
        int[] resultado = {aux1, aux2};
        return resultado;
    }
}
