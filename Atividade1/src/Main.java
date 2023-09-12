/*
    Você foi encarregado de criar uma aplicação para ajudar um professor a gerenciar as notas dos estudantes em sua
    turma. O professor deseja uma maneira fácil de inserir, visualizar, buscar e remover alunos.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Vetor vetorAlunos = new Vetor();
        boolean loop = true;

        while(loop){
            System.out.println("OLÁ ESCOLHA UMA DAS OPÇÕES: \n1-Inserir Notas \n2-Visualizar Notas \n3-Mostrar Tamanho" +
                    "\n4-Buscar Aluno \n5-Remover Aluno \n6-Sair");
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Quantas notas quer inserir?");
                    int qtd = sc.nextInt();
                    String nome = "";
                    double prova = 0, trabalho = 0, projeto = 0;

                    for (int i = 0; i < qtd; i++) {
                        System.out.println("INSIRA O NOME DO ALUNO: ");
                        nome = sc.next();

                        System.out.println("Insira a nota da prova: ");
                        prova = sc.nextDouble();

                        System.out.println("Insira a nota do trabalho: ");
                        trabalho = sc.nextDouble();

                        System.out.println("Insira a nota do projeto: ");
                        projeto = sc.nextDouble();

                        Aluno a = new Aluno(nome, prova, trabalho, projeto);
                        vetorAlunos.adicionarAluno(a);
                    }
                    break;

                case 2:
                    vetorAlunos.listarAlunos();
                    break;

                case 3:
                    System.out.println("O tamanho do vetor é " + vetorAlunos.tamanho());
                    break;
                case 4:
                    System.out.println("Digite o nome do aluno que quer buscar: ");
                    String buscaAluno = sc.next();
                    vetorAlunos.buscarAluno(buscaAluno);

                    break;

                case 5:
                    System.out.println("Digite o nome do aluno que deseja remover: ");
                    String removeAluno = sc.next();
                    vetorAlunos.removerAluno(removeAluno);

                    break;

                case 6:
                    loop = false;
                    break;

            }
        }

        System.out.println("Programa encerrado.");

    }
}
