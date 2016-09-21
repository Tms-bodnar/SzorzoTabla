/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szorzotabla;

/**
 *
 * @author bodnart
 */
public class SzorzoTabla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] szorzoTabla = new int [11][11];
        for (int i = 1; i < szorzoTabla.length; i++) {
        System.out.print("+");
        int x = 1;
        while(x < szorzoTabla.length){
            System.out.print("---+");
            x++;
        }
        System.out.println("");
        
        for(int j = 1; j < szorzoTabla.length; j++){
            szorzoTabla[i][j] = i*j;
            if(szorzoTabla[i][j] < 10){
                System.out.print("| " + szorzoTabla[i][j] + " ");
            }else if(szorzoTabla[i][j] < 100){
                System.out.print("| " + szorzoTabla[i][j] + "");
            }else {
                System.out.print("|" + szorzoTabla[i][j] + "");
            }            
        }
            System.out.print("|");
            System.out.println("");
    }
        System.out.print("+");
        int x = 1;
        while( x < szorzoTabla.length){
            System.out.print("---+");
            x++;
        }
    }
}
