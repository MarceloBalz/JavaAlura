package br.com.alura.listacolecoes.tarefas;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args){

        Pessoa pessoa1 = new Pessoa("Marcelo", 42);
        Pessoa pessoa2 = new Pessoa("Bruno", 69);
        Pessoa pessoa3 = new Pessoa("Maria", 67);
        Pessoa pessoa4 = new Pessoa("Elisangela", 47);
        Pessoa pessoa5 = new Pessoa("Bernardo", 10);
        Pessoa pessoa6 = new Pessoa("Helena", 18);

        //2 - No método main da classe Principal, crie um ArrayList de Pessoa chamado listaDePessoas.
        ArrayList<Pessoa> listaDePessoas = new ArrayList<Pessoa>();

        //3 - Adicione pelo menos três pessoas à lista utilizando o método add.
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa6);
        listaDePessoas.add(pessoa4);
        listaDePessoas.add(pessoa5);
        listaDePessoas.add(pessoa6);

        //4 - Imprima o tamanho da lista utilizando o método size
        System.out.println("Tamanho da lista: " + listaDePessoas.size());

        //5 - Imprima a primeira pessoa da lista utilizando o método get.
        System.out.println("Primeira Pessoa da lista: " + listaDePessoas.get(0).toString());

        //6 - Imprima a lista completa
        /*for(int cont = 0; cont < listaDePessoas.size(); cont++){
            System.out.println("Pessoa " + (cont + 1) + " - " + listaDePessoas.get(cont).toString());
        }*/

        System.out.println("Lista de Pessoas: ");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }

    }
}
