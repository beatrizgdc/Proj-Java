/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author beatrizgdc
 */
import java.util.Scanner; // importa a classe Scanner para entrada de dados
import javax.swing.JOptionPane; // importa a classe JOptionPane para saída de dados em janelas de diálogo

public class NewClass {
         
    public static void main(String[] args) {
        int idade; // declaração da variável idade
        String aux; // declaração da variável auxiliar para armazenar a entrada do usuário

        Scanner leitor = new Scanner(System.in); // cria um objeto da classe Scanner para leitura de dados do teclado

        JOptionPane.showMessageDialog(null, "Este é o programa fila"); // exibe uma mensagem de boas-vindas em uma janela de diálogo

        // entrada de dados
        aux = JOptionPane.showInputDialog("Entre com a sua idade"); // exibe uma mensagem em uma janela de diálogo solicitando a idade do usuário e armazena o valor em aux
        idade = Integer.parseInt(aux); // converte o valor de aux de String para int e armazena em idade

        // decisão
        if (idade >= 60) { // se a idade for maior ou igual a 60
            if (idade < 80) { // se a idade for menor que 80
                JOptionPane.showMessageDialog(null, "fila prioritária."); // exibe uma mensagem em uma janela de diálogo indicando que o usuário está na fila prioritária
            } else {
                JOptionPane.showMessageDialog(null, "fila 80+"); // se a idade for maior ou igual a 80, exibe uma mensagem indicando que o usuário está na fila "80+"
            }
        } else {
            JOptionPane.showMessageDialog(null, "fila comum."); // se a idade for menor que 60, exibe uma mensagem indicando que o usuário está na fila comum
        }
    } // fim do método main
} // fim da classe

    
    

