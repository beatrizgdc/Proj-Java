/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchCase;

import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class switchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //declaração de variaveis
        
       String signo;
       
       //inicio

       //aprendendo a usar switch/case
       
       
       signo = JOptionPane.showInputDialog("Escreva seu signo");
        
        switch (signo){
            
            case "aries" -> JOptionPane.showMessageDialog(null, "21 março a 20 abril");
            case "touro" -> JOptionPane.showMessageDialog(null, "21 abril a 20 maio");
            case "gemeos" -> JOptionPane.showMessageDialog(null, "21 maio a 20 junho");
            case "cancer" -> JOptionPane.showMessageDialog(null, "21 junho a 22 julho");
            case "leao" -> JOptionPane.showMessageDialog(null, "23 julho a 22 agosto");
            case "virgem" -> JOptionPane.showMessageDialog(null, "23 agosto a 22 setembro");
            case "libra" -> JOptionPane.showMessageDialog(null, "23 setembro a 22 outubro");
            case "escorpiao" -> JOptionPane.showMessageDialog(null, "23 outubro a 21 novembro");   
            case "sagitario" -> JOptionPane.showMessageDialog(null, "22 novembro a 21 dezembro");
            case "capricórnio" -> JOptionPane.showMessageDialog(null, "22 dezembro a 20 janeiro");
            case "aquário" -> JOptionPane.showMessageDialog(null, "21 janeiro a 18 fevereiro");
            case "peixes" -> JOptionPane.showMessageDialog(null, " 19 fevereiro a 20 março");
                
            default -> JOptionPane.showMessageDialog(null," inválido");
                
                
        }
        
        
        
        
        
        
    }
    
}
