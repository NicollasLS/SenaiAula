import model.Aluno;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Main Simples
//        Aluno primeiroAluno = new Aluno("Pedro", 22, 7.0, 8.5, 9.0);
//        Aluno segundoAluno = new Aluno("Joana", 17, 3.5, 6.0, 7.0);
//
//        primeiroAluno.exibirDados();
//
//        System.out.println("----------");
//
//        segundoAluno.exibirDados();


        //Main Interativa com Scanner

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Sistema de Cadastro de Alunos =====");
        System.out.print("Quantos alunos deseja cadastrar? ");
        int quantidadeAlunos = scanner.nextInt();
        scanner.nextLine(); // consumir quebra de linha

        for (int i = 1; i <= quantidadeAlunos; i++) {
            System.out.println("\n---Aluno " + i + "---");

            System.out.println("Nome: ");
            String nome = scanner.nextLine();

            System.out.println("Idade: ");
            int idade = scanner.nextInt();


            //separador é por virgula
            System.out.println("Primeira nota : ");
            double primeiraNota = scanner.nextDouble();

            //separador é por virgula
            System.out.println("Segunda nota : ");
            double segundaNota = scanner.nextDouble();

            //separador é por virgula
            System.out.println("Terceira nota : ");
            double terceiraNota = scanner.nextDouble();

            scanner.nextLine(); //consumir quebra de linha

            Aluno Aluno = new Aluno(nome, idade, primeiraNota, segundaNota, terceiraNota);
            Aluno.exibirDados();

            System.out.println("\nresultado dos alunos");
            Aluno.exibirDados();
        }

scanner.close();
        System.out.println("\ncadastro finalizado");

        }
    }






