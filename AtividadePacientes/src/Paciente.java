public class Paciente {
    private String nome;
    private boolean preferencial;

    public Paciente(String nome, boolean preferencial) {
        this.nome = nome;
        this.preferencial = preferencial;
    }

    public String getNome() {
        return nome;
    }

    public boolean isPreferencial() {
        return preferencial;
    }

    @Override
    public String toString() {
        return nome;
    }
}
