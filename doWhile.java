/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package beatrizgarcia_ag08_dsi;

/**
 *
 * @author daniel
 */

   import java.util.Scanner;

public class BeatrizGarcia_Ag08_DSI {
    
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //declaração de variaveis
        int idade, contador, a, b, c, d, e;
        double media;
        String opiniao;
        a=0;
        b=0;
        c=0;
        d=0;
        e=0;
       contador = 0;
       media = 0;
         
        
        Scanner leitor = new Scanner(System.in);
        
        
        //repetição
        do{ 
           System.out.println("Entre com sua idade.");
           idade = leitor.nextInt();
           
           
           System.out.println("Informe a sua opinião sobre o filme :ótimo ,bom , regular , ruim , pessimo");
           opiniao = new Scanner(System.in).nextLine();
           
           while (!opiniao.equals("otimo") && !opiniao.equals("bom") && !opiniao.equals("regular") && !opiniao.equals("ruim") && !opiniao.equals("pessimo")){
              System.out.println("Opção inválida, tente novamente.");
              opiniao = new Scanner(System.in).nextLine();
           }
            
           if (opiniao.equals("otimo")) {
               a ++;
    } else if (opiniao.equals("bom")) { 
               b++;
    } else if (opiniao.equals("regular")) { 
               c++;
    } else if (opiniao.equals("ruim")) { 
               d++;
               media = media + idade;
    } else if (opiniao.equals("pessimo")) { 
               e++;
    } 
        
            contador ++;
        }while (contador<40);
        
        media = media / 40;
        e = (e*100)/40;
        
        System.out.println("O numero de respostas ótimo é " + a);
        System.out.println("A média da idade das pessoas que responderam ruim é " + media);
        System.out.println("A porcentagem das pessoas que responderam péssimo é " + e);
        
    }
    
}
