/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio2exer2;

/**
 *
 * @author 7
 */
public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

public void mostrarDados(){
    System.out.println("Nome: "+ getNome());
    System.out.println("Idade: "+ getIdade());
    System.out.println("Altura: "+ getAltura());
}
public void verificarIdade(){
    if(getIdade()>18){
        System.out.println("Você é maior de idade!!!");
    }else{
        System.out.println("Você é menor de idade!!!");
    }
}
public void faltamAnos(){
    int faltam;
    faltam = 100 - getIdade();
    System.out.println("Ainda faltam " +faltam + " anos para completar 100 anos!!!");
}


}


