/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package beatrizgarcia_ag07_dsi;

/**
 *
 * @author daniel
 */
import javax.swing.JOptionPane;
import java. util.Scanner;

public class BeatrizGarcia_Ag07_DSI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Double  valor;
        String produto;
     
        Scanner leitor = new Scanner(System.in);
        
        //inicio
        
        System.out.println("Aniversário da padaria Joaquim");
         
        
        for (int i=1; i<10; i++){
       
            System.out.println("Escreva o nome do produto");
       produto = leitor.next();
            
            System.out.println("Escreva o valor do produto");
       valor = leitor.nextDouble();
            
          System.out.println("Na promoção o " + produto + " sai por " + valor/2 );
        }
        
    }
    
}
