import javax.swing.*;

public class Vetor {
    private Object[] dados;
    private int tamanho;
    /*Criando o método construtor passando uma capacidade como parâmetro*/
    public Vetor(int capacidade){
        this.dados = new Object[capacidade];
        /*Variável de controle*/
        this.tamanho = 0;
    }
    // criando o método para adicionar dados digitados pelo usuário
    public void adiciona() {
        // O usuário digitará a matéria
        String materia = JOptionPane.showInputDialog(null, "O nome da matéria:",
                "Materia", JOptionPane.INFORMATION_MESSAGE);
        // Verificando se a matéria não está nula ou vazia
        if (materia != null && !materia.isEmpty()) {
            // Verificando se a matéria já existe no sistema
            boolean materiaExiste = false;
            for (int i = 0; i < tamanho; i++) {
                if (dados[i] != null && dados[i].equals(materia)) {
                    materiaExiste = true;
                    break;
                }
            }
            if (!materiaExiste) {
                // Verificando o tamanho real do vetor
                if (this.tamanho < this.dados.length) {
                    this.dados[this.tamanho] = materia;
                    tamanho++;
                    // Caso o vetor não esteja cheio, o dado é gravado com sucesso
                    JOptionPane.showMessageDialog(null, "Matéria adicionada com sucesso!",
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    // Caso o vetor esteja cheio, aumentamos a capacidade e depois adicionamos o dado
                    aumentaCapacidade(); // Chama a função para aumentar acapacidade do vetor
                    this.dados[this.tamanho] = materia;
                    tamanho++;
                    // Dado é gravado com sucesso após aumentar a capacidade
                    JOptionPane.showMessageDialog(null, "Matéria adicionada com sucesso!",
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                // Caso a matéria já exista no vetor, e o cabaço do usuário tenteadicionar novamente
                JOptionPane.showMessageDialog(null, "Matéria já existe no Sistema.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    // Método para aumentar a capacidade do vetor
    private void aumentaCapacidade() {
 /*quando o vetor estiver cheio (ou seja, tamanho igual a dados.length), chamamos o método aumentaCapacidade
 * dobrando a capacidade do vetor*/
        int novaCapacidade = this.dados.length * 2; // Dobrar a capacidade
        Object[] elementosNovos = new Object[novaCapacidade];
        // Copiar os elementos do array antigo para o novo
        for (int i = 0; i < this.dados.length; i++) {
            elementosNovos[i] = this.dados[i];
        }
        this.dados = elementosNovos;
    }
    //Método para listar as matérias cadastradas
    public void materiasCadastradas() {
 /*Se o tamanho do vetor for igual a 0 quer dizer que não te máteria
cadastrada e apresentará um erro*/
        if (tamanho == 0) {
            JOptionPane.showMessageDialog(null, "Nenhuma matéria cadastrada.",
                    "Matérias Concluídas", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        //trabalhando com dados dinamicamente
        StringBuilder lista = new StringBuilder("Matérias Concluídas:\n");
 /*Percorrendo o vetor e buscando todas as matérias cadastradas e
organizando em lista*/
        for (int i = 0; i < tamanho; i++) {
            lista.append((i + 1) + ". " + dados[i] + "\n");
        }
        //exibindo as matérias cadastradas
        JOptionPane.showMessageDialog(null, lista.toString(), "Matérias Concluídas",
                JOptionPane.INFORMATION_MESSAGE);
    }
    //Método para remover uma matéria
    public void remover() {
        // O usuário digitará o nome da matéria a ser removida
        String materiaRemover = JOptionPane.showInputDialog(null,
                "Digite o nome da matéria a ser removida:", "Remover Matéria",
                JOptionPane.INFORMATION_MESSAGE);
        // Verificando se a matéria não está nula ou vazia
        if (materiaRemover != null && !materiaRemover.isEmpty()) {
            boolean materiaAchda = false; // Indicador para verificar se a matéria foiencontrada
            // Percorrendo o vetor para encontrar a matéria a ser removida
            for (int i = 0; i < tamanho; i++) {
                if (dados[i] != null && dados[i].equals(materiaRemover)) {
                    materiaAchda = true;
                    // Movendo os elementos posteriores para preencher o espaço
                    for (int j = i; j < tamanho - 1; j++) {
                        dados[j] = dados[j + 1];
                    }
                    dados[tamanho - 1] = null; // Definindo o último elemento como nulo
                    tamanho--;
                    JOptionPane.showMessageDialog(null, "Matéria removida com sucesso!",
                    "Remover Matéria",
                            JOptionPane.INFORMATION_MESSAGE);
                    break; // Sai do loop após encontrar e remover a matéria
                }
            }
            if (!materiaAchda) {
                JOptionPane.showMessageDialog(null, "Matéria não encontrada no Sistema.",
                        "Remover Matéria", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}

