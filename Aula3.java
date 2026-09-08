
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Aula3 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello friends!Welcome");
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome:");
        int idade = Integer.parseInt(
                JOptionPane.showInputDialog(null,"Digite sua idade:"));
        if (idade >= 18){
            JOptionPane.showMessageDialog(null,"Cidadão maior de idade!"
                    + "\n É o certouu " + nome
            );
        } else {
            JOptionPane.showMessageDialog(null,"Cidadão menor de idade!"
                    + "\n Que coisa feia née " + nome
            );
        String rua = JOptionPane.showInputDialog(null, "Endereço de rua:");
        int ano = Integer.parseInt(
                JOptionPane.showInputDialog(null,"Seu ano de nascimento:"));
        }
    }
}
