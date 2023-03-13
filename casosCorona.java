/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package beatrizgarcia_ag4_dsi;

/**
 *
 * @author beatrizgdc
 */
import java.util.Scanner;
public class casosCorona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaração de variáveis
        String regiao1, regiao2, regiao3, regiao4, regiao5;
        float casosRegiao1, casosRegiao2, casosRegiao3, casosRegiao4, casosRegiao5, casosBrasil;
        double porc1, porc2, porc3, porc4, porc5;
        
        Scanner leitor = new Scanner(System.in);
        
          //Inicio
          
          System.out.println("Programa para calcular o percentual de casos de coronavírus nas regiões do Brasil.");
     
              System.out.println("Digite o nome da região1");
          
          regiao1 = leitor.next();
          
          System.out.println("Digite o número de casos da região1");
          
          casosRegiao1 = leitor.nextFloat();
          
             System.out.println("Digite o nome da região2");
          
          regiao2 = leitor.next();
          
          System.out.println("Digite o número de casos da região2");
          
          casosRegiao2 = leitor.nextFloat();
              
                System.out.println("Digite o nome da região3");
          
          regiao3 = leitor.next();
          
          System.out.println("Digite o número de casos da região3");
          
          casosRegiao3 = leitor.nextFloat();
             
                 System.out.println("Digite o nome da região4");
          
          regiao4 = leitor.next();
          
          System.out.println("Digite o número de casos da região4");
          
          casosRegiao4 = leitor.nextFloat();
          
                 System.out.println("Digite o nome da região5");
          
          regiao5 = leitor.next();
          
          System.out.println("Digite o número de casos da região5");
          
          casosRegiao5 = leitor.nextFloat();
         
          casosBrasil = casosRegiao1 + casosRegiao2 + casosRegiao3 + casosRegiao4 + casosRegiao5;
          
          System.out.println("O número total de casos de Covid no Brasil é de " + casosBrasil);
          
          
          porc1 = (casosRegiao1 * 100) / casosBrasil;
          
               System.out.println("O percentual de casos da Região de " + regiao1 + " foi de " + porc1 + "%.");
          
          porc2 = (casosRegiao2 * 100) / casosBrasil;
          
              System.out.println("O percentual de casos da Região de " + regiao2 + " foi de " + porc2 + "%.");
          
          porc3 = (casosRegiao3 * 100) / casosBrasil;
          
             System.out.println("O percentual de casos da Região de " + regiao3 + " foi de " + porc3 + "%.");
             
          porc4 = (casosRegiao4 * 100) / casosBrasil;
          
             System.out.println("O percentual de casos da Região de " + regiao4 + " foi de " + porc4 + "%.");
          
          porc5 = (casosRegiao5 * 100) / casosBrasil;
          
             System.out.println("O percentual de casos da Região de " + regiao5 + " foi de " + porc5 + "%.");
           
          
        
        
                
    }
    
}
