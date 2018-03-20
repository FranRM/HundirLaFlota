/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxectoprog;
import javax.swing.JOptionPane;


/**
 *
 * @author femio23
 */
public class Tableiro {
    Barco b1=new Barco();
    private String tamaño;
    public static int tamañotab,acertoH,acertoM,acertofin,aux1=15,aux2=15;
    private String [][] taH;
    private int puntuacion=0;
    public static String[][] taM,tiroH;
    int direccion;
    public Tableiro(String tamaño) {
        setTamaño(tamaño);
    }

    public String[][] getTaH() {
        return taH;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
        modoxogo();
    }

    public int getTamañotab() {
        return tamañotab;
    }

    public void setTamañotab(int tamañotab) {
        this.tamañotab = tamañotab;
        
    }
    public int getAcertofin() {
        return acertofin;
    }

    public void setAcertofin(int acertofin) {
        this.acertofin = acertofin;
    }
    
    @Override
    public String toString() {
        return "Xogadores{" + "tama\u00f1o=" + tamaño+ '}';
    }
    private void modoxogo(){
        switch(tamaño){
            case "Pequeno":
            setTamañotab(6);
            setAcertofin(2);
            break;
            case "Medio":
            setTamañotab(10);
            setAcertofin(3);
            break;
            case "Grande":
            setTamañotab(13);
            break;
            default:;
        }
        crearTab();
        montarTab();
    }
    public void crearTab(){
        
        taH=new String[tamañotab][tamañotab];
        for(int i=0;i<tamañotab;i++){
            
            for(int j=0;j<tamañotab;j++){
                taH[i][j]=" ";
            }
        }
        taM=new String[tamañotab][tamañotab];
        for(int i=0;i<tamañotab;i++){
            
            for(int j=0;j<tamañotab;j++){
                taM[i][j]=" ";
            }
        }
        tiroH=new String[tamañotab][tamañotab];
        for(int i=0;i<tamañotab;i++){
            
            for(int j=0;j<tamañotab;j++){
                tiroH[i][j]=" ";
            }
        }
    }
    public void visualizartabH(){
        switch(tamaño){
            case"pequeno":
                System.out.println("Tableiro do xogador");
                System.out.println("| |a|b|c|d|e|f|");
                for(int i=0;i<tamañotab;i++){
                    System.out.print("|"+(i+1)+"|");
                    for(int j=0;j<tamañotab;j++){
                        System.out.print(taH[i][j]+"|");
                    }
                    System.out.println();
                }
            break;
            case"medio":
                System.out.println("Tableiro do xogador");
                System.out.println("| |a|b|c|d|e|f|g|h|i|j|");
                for(int i=0;i<tamañotab;i++){
                    System.out.print("|"+(i+1)+"|");
                    for(int j=0;j<tamañotab;j++){
                        System.out.print(taH[i][j]+"|");
                    }
                    System.out.println();
                }
            break;
            case"grande":
                System.out.println("Tableiro do xogador");
                System.out.println("| |a|b|c|d|e|f|g|h|i|j|k|l|m|");
                for(int i=0;i<tamañotab;i++){
                    System.out.print("|"+(i+1)+"|");
                    for(int j=0;j<tamañotab;j++){
                        System.out.print(taH[i][j]+"|");
                    }
                    System.out.println();
                }
                break;
        }
    }
    public void visualizartabM(){
        switch(tamaño){
            case"pequeno":
                System.out.println("Tableiro da máquina");
                System.out.println("| |a|b|c|d|e|f|");
                for(int i=0;i<tamañotab;i++){
                    System.out.print("|"+(i+1)+"|");
                    for(int j=0;j<tamañotab;j++){
                        System.out.print(taM[i][j]+"|");
                    }
                    System.out.println();
                }
            break;
            case"medio":
                System.out.println("Tableiro da máquina");
                System.out.println("| |a|b|c|d|e|f|g|h|i|j|");
                for(int i=0;i<tamañotab;i++){
                    System.out.print("|"+(i+1)+"|");
                    for(int j=0;j<tamañotab;j++){
                        System.out.print(taM[i][j]+"|");
                    }
                    System.out.println();
                }
            break;
            case"grande":
                System.out.println("Tableiro da máquina");
                System.out.println("| |a|b|c|d|e|f|g|h|i|j|k|l|m|");
                for(int i=0;i<tamañotab;i++){
                    System.out.print("|"+(i+1)+"|");
                    for(int j=0;j<tamañotab;j++){
                        System.out.print(taM[i][j]+"|");
                    }
                    System.out.println();
                }
                break;
        }
    }
    public void visualizartiroH(){
        switch(tamaño){
            case"pequeno":
                System.out.println("Tableiro da máquina");
                System.out.println("| |a|b|c|d|e|f|");
                for(int i=0;i<tamañotab;i++){
                    System.out.print("|"+(i+1)+"|");
                    for(int j=0;j<tamañotab;j++){
                        System.out.print(tiroH[i][j]+"|");
                    }
                    System.out.println();
                }
            break;
            case"medio":
                System.out.println("Tableiro da máquina");
                System.out.println("| |a|b|c|d|e|f|g|h|i|j|");
                for(int i=0;i<tamañotab;i++){
                    System.out.print("|"+(i+1)+"|");
                    for(int j=0;j<tamañotab;j++){
                        System.out.print(tiroH[i][j]+"|");
                    }
                    System.out.println();
                }
            break;
            case"grande":
                System.out.println("Tableiro da máquina");
                System.out.println("| |a|b|c|d|e|f|g|h|i|j|k|l|m|");
                for(int i=0;i<tamañotab;i++){
                    System.out.print("|"+(i+1)+"|");
                    for(int j=0;j<tamañotab;j++){
                        System.out.print(tiroH[i][j]+"|");
                    }
                    System.out.println();
                }
                break;
        }
    }
    public boolean ocupado(String[][] tab,int a, int b){
        if(tab[a][b].equals(" ")){
            return false;
        }else{
        return true;
        }
    }
    public void montarTab(){
        
        switch(tamaño){
            case"pequeno":
                colocardesth();
                colocarsubh();
                colocardestm();
                colocarsubm();
                

            break;
            case"medio":
                colocardesth();
                colocardesth();
                colocarsubm();
                colocarsubm();
                colocarcruzm();
                colocarportm();
                
                
            break;
            case"grande":
                colocardestm();
                colocardestm();
                colocarsubm();
                colocarsubm();
                colocarcruzm();
                colocarcruzm();
                colocarportm();
            break;
        }
    }
    public void colocardestm(){
        if((Math.random())>=0.5){
                        while((aux1+1)>=tamañotab||(aux2)>=tamañotab||ocupado(taM,aux1,aux2)||ocupado(taM,aux1+1,aux2)){
                            aux1=(int)(Math.random()*4+1);
                            aux2=(int)(Math.random()*4+1);
                        }
                        taM[aux1][aux2]="d";
                        taM[aux1+1][aux2]="d";
                    }else{
                        while((aux1)>=tamañotab||(aux2+1)>=tamañotab||ocupado(taM,aux1,aux2)||ocupado(taM,aux1,aux2+1)){
                            aux1=(int)(Math.random()*4+1);
                            aux2=(int)(Math.random()*4+1);
                        }
                        taM[aux1][aux2]="d";
                        taM[aux1][aux2+1]="d";
                    }System.out.println("Barco colocado.");
                    aux1=15;
                    aux2=15;
    }
    public void colocarsubm(){
        if((Math.random())>=0.5){
                    while((aux1+2)>=tamañotab||(aux2)>=tamañotab||ocupado(taM,aux1,aux2)||ocupado(taM,aux1+1,aux2)||ocupado(taM,aux1+2,aux2)){
                        aux1=(int)(Math.random()*4+1);
                        aux2=(int)(Math.random()*4+1);
                    }
                    taM[aux1][aux2]="s";
                    taM[aux1+1][aux2]="s";
                    taM[aux1+2][aux2]="s";
                }else{
                    while((aux1)>=tamañotab||(aux2+2)>=tamañotab||ocupado(taM,aux1,aux2)||ocupado(taM,aux1,aux2+1)||ocupado(taM,aux1,aux2+2)){
                        aux1=(int)(Math.random()*4+1);
                        aux2=(int)(Math.random()*4+1);
                    }
                    taM[aux1][aux2]="s";
                    taM[aux1][aux2+1]="s";
                    taM[aux1][aux2+2]="s";
                }System.out.println("Barco colocado.");
                aux1=15;
                aux2=15;
                
    }
    public void colocarcruzm(){
        if((Math.random())>=0.5){
                    while((aux1+3)>=tamañotab||(aux2)>=tamañotab||ocupado(taM,aux1,aux2)||ocupado(taM,aux1+1,aux2)||ocupado(taM,aux1+2,aux2)||ocupado(taM,aux1+3,aux2)){
                        aux1=(int)(Math.random()*4+1);
                        aux2=(int)(Math.random()*4+1);
                    }
                    taM[aux1][aux2]="c";
                    taM[aux1+1][aux2]="c";
                    taM[aux1+2][aux2]="c";
                    taM[aux1+3][aux2]="c";
                }else{
                    while((aux1)>=tamañotab||(aux2+3)>=tamañotab||ocupado(taM,aux1,aux2)||ocupado(taM,aux1,aux2+1)||ocupado(taM,aux1,aux2+2)||ocupado(taM,aux1,aux2+3)){
                        aux1=(int)(Math.random()*4+1);
                        aux2=(int)(Math.random()*4+1);
                    }
                    taM[aux1][aux2]="c";
                    taM[aux1][aux2+1]="c";
                    taM[aux1][aux2+2]="c";
                    taM[aux1][aux2+3]="c";
                }System.out.println("Barco colocado.");
                aux1=15;
                aux2=15;
    }
    public void colocarportm(){
        if((Math.random())>=0.5){
                    while((aux1+4)>=tamañotab||(aux2)>=tamañotab||ocupado(taM,aux1,aux2)||ocupado(taM,aux1+1,aux2)||ocupado(taM,aux1+2,aux2)||ocupado(taM,aux1+3,aux2)||ocupado(taM,aux1+4,aux2)){
                        aux1=(int)(Math.random()*4+1);
                        aux2=(int)(Math.random()*4+1);
                    }
                    taM[aux1][aux2]="p";
                    taM[aux1+1][aux2]="p";
                    taM[aux1+2][aux2]="p";
                    taM[aux1+3][aux2]="p";
                    taM[aux1+4][aux2]="p";
                }else{
                    while((aux1)>=tamañotab||(aux2+4)>=tamañotab||ocupado(taM,aux1,aux2)||ocupado(taM,aux1,aux2+1)||ocupado(taM,aux1,aux2+2)||ocupado(taM,aux1,aux2+3)||ocupado(taM,aux1,aux2+4)){
                        aux1=(int)(Math.random()*4+1);
                        aux2=(int)(Math.random()*4+1);
                    }
                    taM[aux1][aux2]="p";
                    taM[aux1][aux2+1]="p";
                    taM[aux1][aux2+2]="p";
                    taM[aux1][aux2+3]="p";
                    taM[aux1][aux2+4]="p";
                }System.out.println("Barco colocado.");
                aux1=15;
                aux2=15;
    }
    public void colocardesth(){
        while(direccion!=1&&direccion!=2){
            JOptionPane.showMessageDialog(null,"Vai a colocar un destructor.");
        direccion=Integer.parseInt(JOptionPane.showInputDialog("horizontal(1) ou vertical(2)?"));
        if(direccion==2){
                        while((aux1+1)>=tamañotab||(aux2)>=tamañotab||ocupado(taH,aux1,aux2)||ocupado(taH,aux1+1,aux2)){
                            aux1=Integer.parseInt(JOptionPane.showInputDialog("Numero de fila?"));
                            aux2=Integer.parseInt(JOptionPane.showInputDialog("Numero de columna?"));
                        }
                        taH[aux1][aux2]="d";
                        taH[aux1+1][aux2]="d";
                    }else{
                        while((aux1)>=tamañotab||(aux2+1)>=tamañotab||ocupado(taH,aux1,aux2)||ocupado(taH,aux1,aux2+1)){
                            aux1=Integer.parseInt(JOptionPane.showInputDialog("Numero de fila?"));
                            aux2=Integer.parseInt(JOptionPane.showInputDialog("Numero de columna?"));
                        }
                        taH[aux1][aux2]="d";
                        taH[aux1][aux2+1]="d";
                    }System.out.println("Barco colocado.");
                    aux1=15;
                    aux2=15;
                }
        direccion=3;
    }
    public void colocarsubh(){
        while(direccion!=1&&direccion!=2){
            JOptionPane.showMessageDialog(null,"Vai a colocar un submarino.");
        direccion=Integer.parseInt(JOptionPane.showInputDialog("horizontal(1) ou vertical(2)?"));
        if(direccion==2){
                    while((aux1+2)>=tamañotab||(aux2)>=tamañotab||ocupado(taH,aux1,aux2)||ocupado(taH,aux1+1,aux2)||ocupado(taH,aux1+2,aux2)){
                        aux1=Integer.parseInt(JOptionPane.showInputDialog("Numero de fila?"));
                        aux2=Integer.parseInt(JOptionPane.showInputDialog("Numero de columna?"));
                    }
                    taH[aux1][aux2]="s";
                    taH[aux1+1][aux2]="s";
                    taH[aux1+2][aux2]="s";
                }else{
                    while((aux1)>=tamañotab||(aux2+2)>=tamañotab||ocupado(taH,aux1,aux2)||ocupado(taH,aux1,aux2+1)||ocupado(taH,aux1,aux2+2)){
                        aux1=Integer.parseInt(JOptionPane.showInputDialog("Numero de fila?"));
                        aux2=Integer.parseInt(JOptionPane.showInputDialog("Numero de columna?"));
                    }
                    taH[aux1][aux2]="s";
                    taH[aux1][aux2+1]="s";
                    taH[aux1][aux2+2]="s";
                }System.out.println("Barco colocado.");
                aux1=15;
                    aux2=15;
        
        }
        direccion=3;  
    }
    public void colocarcruzh(){
        while(direccion!=1&&direccion!=2){
            JOptionPane.showMessageDialog(null,"Vai a colocar un cruceiro.");
            direccion=Integer.parseInt(JOptionPane.showInputDialog("Dirección:\nJHorizontal(1) ou vertical(2)?"));
        if(direccion==2){
                    while((aux1+3)>=tamañotab||(aux2)>=tamañotab||ocupado(taH,aux1,aux2)||ocupado(taH,aux1+1,aux2)||ocupado(taH,aux1+2,aux2)||ocupado(taH,aux1+3,aux2)){
                        aux1=Integer.parseInt(JOptionPane.showInputDialog("Numero de fila?"));
                        aux2=Integer.parseInt(JOptionPane.showInputDialog("Numero de columna?"));
                    }
                    taH[aux1][aux2]="c";
                    taH[aux1+1][aux2]="c";
                    taH[aux1+2][aux2]="c";
                    taH[aux1+3][aux2]="c";
                }else{
                    while((aux1)>=tamañotab||(aux2+3)>=tamañotab||ocupado(taH,aux1,aux2)||ocupado(taH,aux1,aux2+1)||ocupado(taH,aux1,aux2+2)||ocupado(taH,aux1,aux2+3)){
                        aux1=Integer.parseInt(JOptionPane.showInputDialog("Numero de fila?"));
                        aux2=Integer.parseInt(JOptionPane.showInputDialog("Numero de columna?"));
                    }
                    taH[aux1][aux2]="c";
                    taH[aux1][aux2+1]="c";
                    taH[aux1][aux2+2]="c";
                    taH[aux1][aux2+3]="c";
                }System.out.println("Barco colocado.");
                aux1=15;
                    aux2=15;
               
        }
        direccion=3;  
    }
    public void colocarporth(){
        while(direccion!=1&&direccion!=2){
            JOptionPane.showMessageDialog(null,"Vai a colocar un portavions.");
        direccion=Integer.parseInt(JOptionPane.showInputDialog("horizontal(1) ou vertical(2)?"));
        if(direccion==2){
                    while((aux1+4)>=tamañotab||(aux2)>=tamañotab||ocupado(taH,aux1,aux2)||ocupado(taH,aux1+1,aux2)||ocupado(taH,aux1+2,aux2)||ocupado(taH,aux1+3,aux2)||ocupado(taH,aux1+4,aux2)){
                        aux1=Integer.parseInt(JOptionPane.showInputDialog("Numero de fila?"));
                        aux2=Integer.parseInt(JOptionPane.showInputDialog("Numero de columna?"));
                    }
                    taH[aux1][aux2]="p";
                    taH[aux1+1][aux2]="p";
                    taH[aux1+2][aux2]="p";
                    taH[aux1+3][aux2]="p";
                    taH[aux1+4][aux2]="p";
                }else{
                    while((aux1)>=tamañotab||(aux2+4)>=tamañotab||ocupado(taH,aux1,aux2)||ocupado(taH,aux1,aux2+1)||ocupado(taH,aux1,aux2+2)||ocupado(taH,aux1,aux2+3)||ocupado(taH,aux1,aux2+4)){
                        aux1=Integer.parseInt(JOptionPane.showInputDialog("Numero de fila?"));
                        aux2=Integer.parseInt(JOptionPane.showInputDialog("Numero de columna?"));
                    }
                    taH[aux1][aux2]="p";
                    taH[aux1][aux2+1]="p";
                    taH[aux1][aux2+2]="p";
                    taH[aux1][aux2+3]="p";
                    taH[aux1][aux2+4]="p";
                }System.out.println("Barco colocado.");
                aux1=15;
                aux2=15;
        }
        direccion=3;  
    }

    public Boolean xogar(JOptionPane avisosxogar){
        
        while(acertoH<acertofin||acertoM<acertofin){
            String l="x";
            acertoH=0;
            acertoM=0;
            System.out.println(" acertoH "+acertoH+" acertoM "+acertoM+" acertofin "+acertofin);
            int [] cordenadas = insertarCordenadasHumano(avisosxogar);
            while (!comprobarCordenadasHumano(avisosxogar,cordenadas)){
                cordenadas = insertarCordenadasHumano(avisosxogar);
            }
            comprobarDisparoHumano(cordenadas[0], cordenadas[1]);
            
                aux1=15;
                aux2=15;
            while( aux1>=tamañotab || aux2>=tamañotab){
                int[] cordenadasMaquina = insertarCordenadasMaquina();
                while(taH[aux1][aux2].equals("A")||taH[aux1][aux2].equals("X")){
                    cordenadasMaquina= insertarCordenadasMaquina();
                    aux1=cordenadasMaquina[0];
                    aux2=cordenadasMaquina[1];
                }
             }
             if(taH[aux1][aux2].equals("d")||taH[aux1][aux2].equals("s")||taH[aux1][aux2].equals("c")||taH[aux1][aux2].equals("p")){
                taH[aux1][aux2]="X";
                avisosxogar.showMessageDialog(null,"Fuego enemigo entrante... Impacto!!!");
                acertoM++;
            }else{
                taH[aux1][aux2]="A";
                avisosxogar.showMessageDialog(null,"Fuego enemigo entrante... Agua!!!");
            }

            visualizartiroH();
            visualizartabH();
            return true;
        }
        return false;
    }

    private int convertirLetraANumero(String caracter) {
        int numero;
        switch(caracter){
            case "a":
                numero=0;
                break;
            case "b":
                numero=1;
                break;
            case "c":
                numero=2;
                break;
            case "d":
                numero=3;
                break;
            case "e":
                numero=4;
                break;
            case "f":
                numero=5;
                break;
            case "g":
                numero=6;
                break;
            case "h":
                numero=7;
                break;
            case "i":
                numero=8;
                break;
            case "j":
                numero=9;
                break;
            case "k":
                numero=10;
                break;
            case "l":
                numero=11;
                break;
            case "m":
                numero=12;
                break;
            default:
                numero=15;
                break;
        }
        return numero;
    }

    private void comprobarDisparoHumano(int elevacion, int direccion) {
        if(taM[elevacion-1][direccion].equals("d")|| taM[elevacion-1][direccion].equals("s")|| taM[elevacion-1][direccion].equals("c")|| taM[elevacion-1][direccion].equals("p")){
            tiroH[elevacion-1][direccion]="X";
            JOptionPane.showMessageDialog(null,"Impacto");
            acertoH++;
        }else{
            tiroH[elevacion-1][direccion]="A";
            JOptionPane.showMessageDialog(null,"Auga");
        }
    }

    private int[] insertarCordenadasHumano (JOptionPane avisosXogar){
        int n=Integer.parseInt(avisosXogar.showInputDialog("Coordenadas de disparo.\nIndique a elevacion (numeros)."));
        String l=avisosXogar.showInputDialog("Coordenadas de disparo\nIndique a direccion (letras minusculas).");
        int le = convertirLetraANumero(l);
        int [] resultado = {n, le};
        return resultado;
    }

    private int[] insertarCordenadasMaquina (){
        aux1=(int)(Math.random()*tamañotab);
        aux2=(int)(Math.random()*tamañotab);
        int [] resultado = {aux1, aux2};
        return resultado;
    }

    private Boolean comprobarCordenadasHumano (JOptionPane avisosXogar, int [] cordenadas) {
        if((cordenadas[0]-1)<0||cordenadas[0]>getTamañotab()){
            avisosXogar.showMessageDialog(null,"Error en la elevación, introduzca otras coordenadas(\""+cordenadas[0]+"\","+cordenadas[1]+")");
            return false;
        } else if(cordenadas[1]<0||cordenadas[1]>getTamañotab()){
            avisosXogar.showMessageDialog(null,"Error en la dirección, introduzca otras coordenadas("+cordenadas[0]+",\""+cordenadas[1]+"\")");
            return false;
        }
        return true;
    }

    
}
