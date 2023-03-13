/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz;
import javax.swing.JOptionPane;
/**
 *
 * @author beatrizgdc
 */
public class matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num [][] = new int [10][10];
        int linha, coluna, soma = 0;
        
        //entrada de dados
        
        JOptionPane.showMessageDialog(null, "Inserindo números na matriz");
        
        for (linha=0; linha<10; linha++){
           for(coluna=0; coluna<10; coluna++){
           num [linha] [coluna] = Integer.parseInt(JOptionPane.showInputDialog("Entre com a numero" + (linha+1) +"° ")); 
           }//fim do for coluna
           }//fim do for linha
        
        //calculo da soma
        for (linha=0; linha<10; linha++){
           for(coluna=0; coluna<10; coluna++){
              soma = soma + num [linha] [coluna];
           }//fim do for coluna
        }//fim do for linha
        
        JOptionPane.showMessageDialog(null, "o resultado da soma é" + soma);
    }
    
}
