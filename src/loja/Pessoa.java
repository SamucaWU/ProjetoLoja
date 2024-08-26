package loja;

import java.util.Scanner;

public class Pessoa {
    // Atributos dessa classe
    String nome;
    int idade;
    char sexo;
    String change;

    //Declaração da biblioteca Scanner
    Scanner sc = new Scanner(System.in);
    // método para nome
    protected void usuario () {
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.format("Seja bem-vindo %s\n", nome);
    }
    //  método para idade
    protected void idade() {
        System.out.println("\nDigite sua idade:");
        idade = sc.nextInt();
        System.out.format("\nSua idade: %d", idade);
    }

    protected void seuSexo() {
        System.out.println("\nQual seu gênero?");
        System.out.println("(m) Masculino");
        System.out.println("(f)Feminino");
        System.out.println("(u)Prefiro não dizer\n");

        sexo = sc.next().charAt(0);
        switch (sexo) {
            case 'm':
            case 'M':
                System.out.println("m - Sexo masculino");
                change = Character.toString(sexo);
                change = "Masculino";
                break;
            case 'f':
            case 'F':
                System.out.println("f - Sexo feminino");
                change = Character.toString(sexo);
                change = "Feminino";
                break;
            case'u':
            case'U':
                System.out.println("u - prefere não dizer");
                change = Character.toString(sexo);
                change = "Prefere não dizer";
                break;
        
            default:
            System.out.println("Sexo não definido");
            change = Character.toString(sexo);
                change = "não definido";
                break;
        }
    }

        public void statusCliente() {
            System.out.format("\nNome do cliente: %s", nome);
            System.out.format("\nIdade: %d", idade);
            System.out.format("\nSexo: %s", change);
            sc.close();
            

        
    }
}
