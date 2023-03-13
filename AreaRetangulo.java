/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arearetangulo;

/**
 *
 * @author daniel
 */
import java.util.Scanner;

public class AreaRetangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaração de variáveis
        int altura;
        int largura;
        int area;
        
        Scanner leitor = new Scanner (System.in);
        
        // Inicio
        
        System.out.println ("Programa - área do retângulo");
          System.out.println("Digite a ALTURA do retângulo");
          
          altura = leitor.nextInt();
          
          System.out.println("Digite a LARGURA do retângulo");
          
          largura = leitor.nextInt();
          
          area = largura * altura;
          
          System.out.println("A área do retângulo é" + area);
        
        
        
                
              
        
    }
    
}
