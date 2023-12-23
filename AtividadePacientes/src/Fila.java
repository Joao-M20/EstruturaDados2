
/*
    Criar uma Classe Fila com todos os métodos para manipular os dados:
    * Solicitar senha de atendimento (incluir na Fila) que pode ser normal ou preferencial;
    * Visualizar a Fila;
    * Visualizar o tamanho da Fila;
    * Visualizar se a Fila está vazia;
    * Visualizar que é o primeiro da fila;
    * Chamar paciente para o atendimento (remover da fila);
 */

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    private Queue<Paciente> fila = new LinkedList<>();

    public void adicionarPaciente(Paciente paciente) {
        fila.add(paciente);
    }

    public Paciente atenderPaciente() {
        if (!fila.isEmpty()) {
            // Procura por clientes preferenciais primeiro
            for (Paciente paciente : fila) {
                if (paciente.isPreferencial()) {
                    System.out.println("Atendendo paciente preferencial: " + paciente.getNome());
                    return fila.remove();
                }
            }

            // Se não houver clientes preferenciais, atende o próximo cliente
            Paciente proximoPaciente = fila.poll();
            System.out.println("Atendendo paciente: " + proximoPaciente.getNome());
            return proximoPaciente;
        } else {
            System.out.println("Não há pacientes na fila.");
            return null;
        }
    }

    public int tamanhoFila() {
        return fila.size();
    }

    public void visualizarFila() {

        if (fila.isEmpty()){
            System.out.println("Sem pacientes na fila");
        } else {
            for (Paciente paciente : fila){
                System.out.println("Fila de Atendimento:");
                System.out.println(paciente.getNome());
            }
        }



//        for (Paciente paciente : fila) {
//            if (paciente.isPreferencial()) {
//
//            }
//        }
    }

    public void filaVazia(){
        if (fila.isEmpty()){
            System.out.println("Sim, a fila esta vazia");
        } else {
            System.out.println("Não, a fila esta com " + tamanhoFila() + " paciente(s)");
        }
    }

    public void primeiroFila(){
        if (fila.isEmpty()){
            System.out.println("Não há ninguem na fila");
        } else {
            System.out.println(fila.element());
        }
    }

}
