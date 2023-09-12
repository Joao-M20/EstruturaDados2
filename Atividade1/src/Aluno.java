public class Aluno {
    private String nome;
    private double prova;
    private double trabalho;
    private double projeto;


    public Aluno(String nome, double prova, double trabalho, double projeto) {
        this.nome = nome;
        this.prova = prova;
        this.trabalho = trabalho;
        this.projeto = projeto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getProva() {
        return prova;
    }

    public void setProva(double prova) {
        this.prova = prova;
    }

    public double getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(double trabalho) {
        this.trabalho = trabalho;
    }

    public double getProjeto() {
        return projeto;
    }

    public void setProjeto(double projeto) {
        this.projeto = projeto;
    }
}
