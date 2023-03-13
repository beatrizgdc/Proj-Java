/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package beatrizgarcia_ag5_dsi;

/**
 *
 * @author beatrizgdc
 */
import java.util.Scanner;

import javax.swing.JOptionPane;

public class BeatrizGarcia_Ag5_DSI_forum {


    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaração de variaveis
        
        int x, y;
        int soma, mult;
        String aux;
        
                Scanner leitor = new Scanner(System.in);

        
        aux = JOptionPane.showInputDialog("Digite o um número inteiro.");

        x = Integer.parseInt(aux);
        
        aux = JOptionPane.showInputDialog("Digite o segundo número inteiro.");
    
        y = Integer.parseInt(aux);
           // Integer.parseInt(x);    
           // Integer.parseInt(y);       
     


          soma = x + y;
          mult = x * y;
                       
    //DECISÃO
    
    
        if (x == y){
              //comandos se a condição for verdadeira
        
                        JOptionPane.showMessageDialog(null, "a soma dos número é" + soma);

    } else {
            //comandos se a condição for falsa
     
                        JOptionPane.showMessageDialog(null, "a multiplicação dos número é" + mult);
             
        }
        
        
        
        
        
    }
    
}
