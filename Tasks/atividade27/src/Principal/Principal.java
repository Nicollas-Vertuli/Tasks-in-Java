/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;

import Model.Aluno;
import Model.Funcionario;
import javax.swing.JOptionPane;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Aluno objetoAluno1 = new Aluno("Nicollas", 18, 1.5, 80, "nicolau1345#gmmail");

        JOptionPane.showMessageDialog(null, "nome:" + objetoAluno1.getNome() + "\nidade:" + objetoAluno1.getIdade() + "\npeso:" + objetoAluno1.getPeso() + "\naltura;" + objetoAluno1.getAltura());

        Funcionario objetoFuncionario1 = new Funcionario("irineu", 26, "Educação Física");

        JOptionPane.showMessageDialog(null, "nome: " + objetoFuncionario1.getNome() + "\nidade: " + objetoFuncionario1.getIdade());
    


    }
    
}
