/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxectoprog;
import javax.swing.JOptionPane;
import com.fran.metodos.Entradaspred;
/**
 *
 * @author femio23
 */

public class Tableiro {
    private String tamaño;
    private static int tamañotab,acertoH,acertoM,acertofin,aux1=15,aux2=15;
    private String [][] taH;
    private int puntuacion=0;
    private static String[][] taM,tiroH;
    int direccion;
/**
 * Constructor parametrico da clase taboleiro.
 * @param tamaño Valor a engadir.
 */
    public Tableiro(String tamaño) {
        setTamaño(tamaño);
    }
    /**
     * Getter do array TableiroHumano.
     * @return Retorna dito tableiro.
     */
    public String[][] getTaH() {
        return taH;
    }
    /**
     * Getter de Tamaño que é o string que garda o nome.
     * @return Devolve dito string.
     */
    public String getTamaño() {
        return tamaño;
    }
    /**
     * Setter de Tamaño.
     * @param tamaño Valor que se desexa engadir, o cal sestará restrinxido no futuro,
     */
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
        modoxogo();
    }
    /**
     * Getter de TamañoTab, que é un int que garda o tamaño de ancho e alto da matriz.
     * @return Devolve dito valor.
     */
    public int getTamañotab() {
        return tamañotab;
    }
    /**
     * Setter de TamañoTab, que é un int que garda o tamaño de ancho e alto da matriz.
     * @param tamañotab Valor numérico a inserir.
     */
    public void setTamañotab(int tamañotab) {
        this.tamañotab = tamañotab;
    }
    /**
     * Getter da variable de AcertoFin.
     * @return Retorna a variable limite de impactos maximos a os que se xoga.
     */
    public int getAcertofin() {
        return acertofin;
    }
    /**
     * Setter de acertofin.
     * @param acertofin Valor de acertos máximos ata o que se xogará
     */
    public void setAcertofin(int acertofin) {
        this.acertofin = acertofin;
    }
    /**
     * Getter da taboa tiro humano.
     * @return  Taboa en cuestion.
     */
    public String[][] getTiroH(){
        return tiroH;
    }
    /**
     * Getter de acertosHumano.
     * @return Int en cuestion.
     */            
    
    //codigo novo
    
    
    public int getAcertoH(){
        return acertoH;
    }
    /**
     * Método que, segundo o valor en Tamaño, parametriza o Tamaño das taboas e o numero de impactos a os que se xoga. 
     */
    private void modoxogo(){
       
         setTamañotab(6);
         setAcertofin(2);
        crearTab();
        montarTab();
    }
    /**
     * Método que inicializa as tres taboas que utilizamos(tiroHumano, TaboaHumano e TaboaMáquina), segundo o tamaño anteriormente designado, e dando o valor "espacio" a cada posición.
     */
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
    /**
     * Método utilizado para visualizar a taboa da maquina, evisualizar os seus barcos.
     */
    public void visualizartabM(){
        
                System.out.println("Tableiro da máquina");
                System.out.println("| |a|b|c|d|e|f|");
                for(int i=0;i<tamañotab;i++){
                    System.out.print("|"+(i+1)+"|");
                    for(int j=0;j<tamañotab;j++){
                        System.out.print(taM[i][j]+"|");
                    }
                    System.out.println();
                }
    }
    /**
     * Método que permite consultar, se unha posición en particular dunha taboa en particular , se esta ou non vacia, retornando o booleano correspondente.
     * @param tab Taboa a consultar.
     * @param a Posicion de fila.
     * @param b Posicion de columna.
     * @return Boolean que retorna true se esta ocupado, e viceversa.
     */
    public boolean ocupado(String[][] tab,int a, int b){
        if(tab[a][b].equals(" ")){
            return false;
        }else{
        return true;
        }
    }
    /**
     * Metodo que define, en función do tamaño, os barcos a colocar.
     */
    public void montarTab(){
        
                colocardesth();
                colocarsubh();
                colocardestm();
                colocarsubm();
                colocarportm();
    }
    /**
     * Metodo que coloca automaticamente un destructor no taboleiro da maquina.
     */
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
    /**
     * Metodo que coloca automaticamente un submarino na taboa da maquina.
     */
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
    /**
     * Método que coloca un cruceiro automaticamente  na taboa da maquina.
     */
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
    /**
     * Método que coloca automáticamente un portaavions na taboa da maquina.
     */
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
    /**
     * Metodo que coloca un destructor, nas coordenadas dadas polo xogador, no seu tableiro.
     */
    public void colocardesth(){
        while(direccion!=1&&direccion!=2){
            JOptionPane.showMessageDialog(null,"Vai a colocar un destructor(2 casillas).");
            try{
                direccion=convertirDireccion(Entradaspred.pedirString("Colocar en horizontal ou en vertical?\nH/V"));
            }catch(NullPointerException npe1){
                 JOptionPane.showMessageDialog(null,"Erro, colocase en horizontal por defecto.");
                 direccion=1;
            }
                if(direccion==2){
                            while((aux1+1)>=tamañotab||(aux2)>=tamañotab||ocupado(taH,aux1,aux2)||ocupado(taH,aux1+1,aux2)){
                                aux1=(-1)+Integer.parseInt(Entradaspred.pedirString("Numero de fila."));
                                String auxili=Entradaspred.pedirString("Letra de columna.");
                                    aux2=convertirLetraANumero(auxili);
                            }
                                taH[aux1][aux2]="d";
                                taH[aux1+1][aux2]="d";
                            }else{
                                while((aux1)>=tamañotab||(aux2+1)>=tamañotab||ocupado(taH,aux1,aux2)||ocupado(taH,aux1,aux2+1)){
                                    aux1=(-1)+Integer.parseInt(Entradaspred.pedirString("Numero de fila."));
                                    String auxili=Entradaspred.pedirString("Letra de columna.");
                                    aux2=convertirLetraANumero(auxili);
                                }
                                taH[aux1][aux2]="d";
                                taH[aux1][aux2+1]="d";
                            }System.out.println("Barco colocado.");
                            aux1=15;
                            aux2=15;
                        }
                direccion=3;
    }
    /**
     * Metodo que coloca un submarino, nas coordenadas dadas polo xogador, no seu tableiro.
     */
    public void colocarsubh(){
        while(direccion!=1&&direccion!=2){
            JOptionPane.showMessageDialog(null,"Vai a colocar un submarino(3 casillas).");
        try{
                direccion=convertirDireccion(Entradaspred.pedirString("Colocar en horizontal ou en vertical?\nH/V"));
            }catch(NullPointerException npe1){
                 JOptionPane.showMessageDialog(null,"Erro, colocase en horizontal por defecto.");
                 direccion=1;
            }
        if(direccion==2){
                    while((aux1+2)>=tamañotab||(aux2)>=tamañotab||ocupado(taH,aux1,aux2)||ocupado(taH,aux1+1,aux2)||ocupado(taH,aux1+2,aux2)){
                        aux1=(-1)+Integer.parseInt(Entradaspred.pedirString("Numero de fila."));
                        String auxili=Entradaspred.pedirString("Letra de columna.");
                            aux2=convertirLetraANumero(auxili);
                    }
                    taH[aux1][aux2]="s";
                    taH[aux1+1][aux2]="s";
                    taH[aux1+2][aux2]="s";
                }else{
                    while((aux1)>=tamañotab||(aux2+2)>=tamañotab||ocupado(taH,aux1,aux2)||ocupado(taH,aux1,aux2+1)||ocupado(taH,aux1,aux2+2)){
                        aux1=(-1)+Integer.parseInt(Entradaspred.pedirString("Numero de fila."));
                        String auxili=Entradaspred.pedirString("Letra de columna.");
                            aux2=convertirLetraANumero(auxili);
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
    /**
     * Metodo que coloca un cruceiro, nas coordenadas dadas polo xogador, no seu tableiro.
     */
    public void colocarcruzh(){
        while(direccion!=1&&direccion!=2){
            JOptionPane.showMessageDialog(null,"Vai a colocar un cruceiro(4 casillas).");
            try{
                direccion=convertirDireccion(Entradaspred.pedirString("Colocar en horizontal ou en vertical?\nH/V"));
            }catch(NullPointerException npe1){
                 JOptionPane.showMessageDialog(null,"Erro, colocase en horizontal por defecto.");
                 direccion=1;
            }
        if(direccion==2){
                    while((aux1+3)>=tamañotab||(aux2)>=tamañotab||ocupado(taH,aux1,aux2)||ocupado(taH,aux1+1,aux2)||ocupado(taH,aux1+2,aux2)||ocupado(taH,aux1+3,aux2)){
                        aux1=(-1)+Integer.parseInt(Entradaspred.pedirString("Numero de fila."));
                        String auxili=Entradaspred.pedirString("Letra de columna.");
                        aux2=convertirLetraANumero(auxili);
                    }
                    taH[aux1][aux2]="c";
                    taH[aux1+1][aux2]="c";
                    taH[aux1+2][aux2]="c";
                    taH[aux1+3][aux2]="c";
                }else{
                    while((aux1)>=tamañotab||(aux2+3)>=tamañotab||ocupado(taH,aux1,aux2)||ocupado(taH,aux1,aux2+1)||ocupado(taH,aux1,aux2+2)||ocupado(taH,aux1,aux2+3)){
                        aux1=(-1)+Integer.parseInt(Entradaspred.pedirString("Numero de fila."));
                        String auxili=Entradaspred.pedirString("Letra de columna.");
                            aux2=convertirLetraANumero(auxili);
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
    /**
     * Metodo que coloca un portaavions, nas coordenadas dadas polo xogador, no seu tableiro.
     */
    public void colocarporth(){
        while(direccion!=1&&direccion!=2){
            JOptionPane.showMessageDialog(null,"Vai a colocar un portavions(5 casillas).");
        try{
                direccion=convertirDireccion(Entradaspred.pedirString("Colocar en horizontal ou en vertical?\nH/V"));
            }catch(NullPointerException npe1){
                 JOptionPane.showMessageDialog(null,"Erro, colocase en horizontal por defecto.");
                 direccion=1;
            }
        if(direccion==2){
                    while((aux1+4)>=tamañotab||(aux2)>=tamañotab||ocupado(taH,aux1,aux2)||ocupado(taH,aux1+1,aux2)||ocupado(taH,aux1+2,aux2)||ocupado(taH,aux1+3,aux2)||ocupado(taH,aux1+4,aux2)){
                        aux1=(-1)+Integer.parseInt(Entradaspred.pedirString("Numero de fila."));
                        String auxili=Entradaspred.pedirString("Letra de columna.");
                            aux2=convertirLetraANumero(auxili);
                    }
                    taH[aux1][aux2]="p";
                    taH[aux1+1][aux2]="p";
                    taH[aux1+2][aux2]="p";
                    taH[aux1+3][aux2]="p";
                    taH[aux1+4][aux2]="p";
                }else{
                    while((aux1)>=tamañotab||(aux2+4)>=tamañotab||ocupado(taH,aux1,aux2)||ocupado(taH,aux1,aux2+1)||ocupado(taH,aux1,aux2+2)||ocupado(taH,aux1,aux2+3)||ocupado(taH,aux1,aux2+4)){
                        aux1=(-1)+Integer.parseInt(Entradaspred.pedirString("Numero de fila."));
                        String auxili=Entradaspred.pedirString("Letra de columna.");
                            aux2=convertirLetraANumero(auxili);
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
    /**
     * Metodo que realiza as funcións necesaria para xogar, tras ter colocados os barcos.
     * @param avisosxogar JOptionPane particular.
     * @return Booleano que permite repetir as cogadas ata que todolos impactos necesarios sexan realizados.
     */
    public Boolean xogar(JOptionPane avisosxogar){
        while(acertoH<acertofin&&acertoM<acertofin){
            String l="x";
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
                avisosxogar.showMessageDialog(null,"Fogo enemigo entrante... Impacto!!!");
                acertoM++;
            }else{
                taH[aux1][aux2]="A";
                avisosxogar.showMessageDialog(null,"Fogo enemigo entrante... Auga!!!");
            }
            return true;
        }
        return false;
    }
    /**
     * Método que permite convertir as letras que identifican a columna a numeros, para poder consultar na taboa correspondente.
     * @param caracter Caracter a consultar, entre "a" e "m".
     * @return Enteiro xa traducido.
     */
    private int convertirLetraANumero(String caracter) {
        int numero;
        switch(caracter){
            case "A":
                numero=0;
                break;
            case "B":
                numero=1;
                break;
            case "C":
                numero=2;
                break;
            case "D":
                numero=3;
                break;
            case "E":
                numero=4;
                break;
            case "F":
                numero=5;
                break;
            case "G":
                numero=6;
                break;
            case "H":
                numero=7;
                break;
            case "I":
                numero=8;
                break;
            case "J":
                numero=9;
                break;
            case "K":
                numero=10;
                break;
            case "L":
                numero=11;
                break;
            case "M":
                numero=12;
                break;
            default:
                numero=15;
                break;
        }
        return numero;
    }
    /**
     * Método que permite convertir as letras que indican a direccion a os números que permiten definila.
     * @param s String a consultar.
     * @return Int xa convertido
     */
    public int convertirDireccion(String s){
        if(s.equals("H")){
            return 1;
        }
        else{
            if(s.equals("V")){
                return 2;
            }
        }
        return 3;
    }
    /**
     * Método que permite disparar e  comprobar o resultado do disparo a o xogador.
     * @param elevacion
     * @param direccion 
     */
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
    /**
     * Método que permite introducir as coordenadas para o disparo do xogador.
     * @param avisosXogar JoptionPane requerido.
     * @return Retorna as coordenadas en forma de vector.
     */
    private int[] insertarCordenadasHumano (JOptionPane avisosXogar){
        int n=Integer.parseInt(Entradaspred.pedirString("Coordenadas de disparo.\nIndique a elevacion (numeros)."));
        String l=Entradaspred.pedirString("Coordenadas de disparo\nIndique a direccion (letras maiusculas).");
        int le = convertirLetraANumero(l);
        int [] resultado = {n, le};
        return resultado;
    }
    /**
     * Método que permite obter as coordenadas de disparo da máquina.
     * @return Coordenadas de disparo en forma de vector.
     */
    private int[] insertarCordenadasMaquina (){
        aux1=(int)(Math.random()*tamañotab);
        aux2=(int)(Math.random()*tamañotab);
        int [] resultado = {aux1, aux2};
        return resultado;
    }
    /**
     * Metodo que comproba a validez das coordenadas do disparo do xogador.
     * @param avisosXogar JOptionPane requerido.
     * @param cordenadas Vector coas coordenadas do disparo do xogador.
     * @return 
     */
    private Boolean comprobarCordenadasHumano (JOptionPane avisosXogar, int [] cordenadas) {
        if((cordenadas[0]-1)<0||cordenadas[0]>getTamañotab()){
            avisosXogar.showMessageDialog(null,"Erro na elevación, introduza outras coordenadas(\""+cordenadas[0]+"\","+cordenadas[1]+")");
            return false;
        } else if(cordenadas[1]<0||cordenadas[1]>getTamañotab()){
            avisosXogar.showMessageDialog(null,"Erro na dirección, introduza outras coordenadas("+cordenadas[0]+",\""+cordenadas[1]+"\")");
            return false;
        }
        return true;
    }
}