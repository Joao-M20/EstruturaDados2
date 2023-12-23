import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Fila fila = new Fila();
        Scanner in = new Scanner(System.in);

        String nome = "";
        String nomePreferencial = "";

        boolean loop = true;

        while(loop) {

            System.out.println("Ola, Bem Vindo ao Laboratorio de Coleta de Sangue. Selecione uma opção");
            System.out.println("1 - Pegar Senha \n2 - Ver a fila \n3 - Ver o tamanho da fila \n4 - Ver se a fila esta vazia" +
                    " \n5 - Ver quem é o primeiro da fila \n6 - Chamar Paciente para atendimento \n7 - Sair do sistema");
            int escolha = in.nextInt();

            switch (escolha) {

                case 1:
                    System.out.println("Esolha uma opção: \n1 - Senha Comum \n2 - Senha Preferencial ");
                    int escolhaSenha = in.nextInt();

                    switch (escolhaSenha){
                        case 1:
                            System.out.println("Insira seu nome: ");
                            nome = in.next();
                            fila.adicionarPaciente(new Paciente(nome, false));
                            System.out.println("Salvo!");
                        break;

                        case 2:
                            System.out.println("Insira seu nome: ");
                            nomePreferencial = in.next();
                            fila.adicionarPaciente(new Paciente(nomePreferencial, true));
                        break;


                    }
                break;

                case 2:
                    fila.visualizarFila();
                    break;

                case 3:
                    System.out.println("O tamanho da fila é " + fila.tamanhoFila());
                    break;

                case 4:
                    fila.filaVazia();
                    break;

                case 5:
                    fila.primeiroFila();
                    break;

                case 6:
                    while (fila.tamanhoFila() > 0) {
                        fila.atenderPaciente();
                    }
                    break;

                case 7:
                    loop = false;
                break;
            }
        }
    }
}