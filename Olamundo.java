/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author daniel
 */
import javax.swing.JOptionPane;

public class Olamundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] num = new int [10];
        int i, maior, menor;
        maior=Integer.MIN_VALUE;
        menor=Integer.MAX_VALUE;
        
                
        for (i=0; i<10; i++) {
            
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) + " número. "));
          
        }
        
         for (i=0; i<10; i++) {
         
             if (num[i]>maior){
              maior = num [i];
             
             }
             if (num [i]< menor) {
              menor = num [i];   
             
             }
         
         }
        JOptionPane.showMessageDialog(null, "o maior número é " + maior);
        JOptionPane.showMessageDialog(null, "o menor número é" + menor);     
   
    }

}
