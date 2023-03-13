/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package beatrizgarcia_ag06_dsi;

/**
 *
 * @author daniel
 * 
 * 
 */


import javax.swing.JOptionPane;

public class BeatrizGarcia_Ag06_DSI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //declaração de variaveis
        
       int placa;
       
       //inicio
       
       JOptionPane.showMessageDialog(null, "Este programa irá informar o mes do vencimento do IPVA de seu veiculo.");
       
       placa = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número final da placa"));
        
        switch (placa){
            
            case 1 -> JOptionPane.showMessageDialog(null, "Pagamento até 30/04");
            case 2 -> JOptionPane.showMessageDialog(null, "Pagamento até  31/05");
            case 3 -> JOptionPane.showMessageDialog(null, "Pagamento até 30/06");
            case 4 -> JOptionPane.showMessageDialog(null, "Pagamento até 31/07");
            case 5 -> JOptionPane.showMessageDialog(null, "Pagamento até 31/08");
            case 6 -> JOptionPane.showMessageDialog(null, "Pagamento até 30/09");
            case 7 -> JOptionPane.showMessageDialog(null, "Pagamento até 31/10");
            case 9,0 -> JOptionPane.showMessageDialog(null, "Pagamento até 31/12");   
                
            default -> JOptionPane.showMessageDialog(null,"número inválido");
                
                
        }
        
    }
    
}
