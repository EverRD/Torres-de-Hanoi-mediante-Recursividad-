/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torres.de.hanoi;

/**
 *
 * @author GATEWAY
 */
public class TorresDeHanoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TorresDeHanoi objHanoi = new  TorresDeHanoi();
           objHanoi.torresHanoi(3, 1, 2, 3);
    }
    public void torresHanoi(int discos, int torre1, int torre2, int torre3){
       //caso base
       if(discos==1){
           System.out.println("Mover disco de torre "+ torre1 + "a Torre " + torre3);
          
          }else{
           torresHanoi(discos-1, torre1, torre3, torre2);
           System.out.println("Mover disco de torre "+ torre1 + "a Torre " + torre3);
           torresHanoi(discos-1, torre2, torre1, torre3);
       }
    }
}
