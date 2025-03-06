/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio2exer2;

import java.util.Scanner;

/**
 *
 * @author 7
 */
public class Desafio2Exer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        System.out.println("Informe o nome:");
        pessoa.setNome(ler.next());
        System.out.println("Informe a idade:");
        pessoa.setIdade(ler.nextInt());
        System.out.println("Informe a altura:");
        pessoa.setAltura(ler.nextDouble());
        pessoa.mostrarDados();
        pessoa.verificarIdade();
        pessoa.faltamAnos();
    }
    
}
