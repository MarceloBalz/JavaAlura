package br.com.alura.listacolecoes.tarefas;

//1 - Crie uma classe Pessoa com atributos como nome, idade, e um método toString que represente esses atributos.
public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Pessoa(String n, int i){
        this.nome = n;
        this.idade = i;
    }

    @Override
    public String toString() {
        return ("Nome: " + this.getNome() + " - Idade: " + this.getIdade());
    }
}
