import javax.swing.*;

public class Teste {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);
        String op;
        do {
            do {
                op = JOptionPane.showInputDialog(null,
                        "Digite uma das opções\n\n 1-Para Cadastrar\n 2-Para Consultar\n 3-Para remover"
                                + "\n 0-Para Sair",
                        "Menu", JOptionPane.INFORMATION_MESSAGE);
                // Verifica se a entrada está vazia e solicita novamente
                if (op == null || op.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "O Campo opção não pode está vazio.");
                }
            } while (op == null || op.trim().isEmpty());
            try {
                int opcao = Integer.parseInt(op);
                // Verifica se a opção está dentro do intervalo
                if (opcao >= 0 && opcao <= 3) {
                    if (opcao == 1) {
                        try {
                            vetor.adiciona();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else if (opcao == 2) {
                        try {
                            vetor.materiasCadastradas();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else if (opcao == 3) {
                        try {
                            vetor.remover();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else if (opcao == 0) {
                        JOptionPane.showMessageDialog(null, "Saindo do Sistema",
                                "Saindo....", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                    //tranformando a string em número para realizar a validação
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, digite uma opção válida.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, digite uma opção válida.");
            }
            String resp = JOptionPane.showInputDialog(null, "Deseja continuar? "
                            +
                            "S-Para Sim ou N-para Não", "Atenção",
                    JOptionPane.INFORMATION_MESSAGE);
            if (resp == null || !resp.equalsIgnoreCase("s")) {
                JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema",
                        "Saindo....", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        } while (true);
    }
}


