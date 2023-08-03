public class Aluno {
    // Definindo variáveis de instância
    private double registroAcademico;
    private String nome;
    private double notaProva1;
    private double notaProva2;
    private double notaTrabalho;

    // Classe construtora
    public Aluno(String nome,double registroAcademico,  double notaProva1, double notaProva2, double notaTrabalho) {
        this.registroAcademico = registroAcademico;
        this.nome = nome;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrabalho = notaTrabalho;
    }

    // Método para calcular a média do aluno
    public double media() {
        return ((this.notaProva1 * 3.5) + (this.notaProva2 * 3.5) + (this.notaTrabalho * 3)) / 10;
    }

    // Método para determinar a situação do aluno
    public String situacao() {
        return this.media() >= 7 ? "APROVADO" : "EXAME";
    }

    // Sobrescrevendo o método toString
    @Override
    public String toString() {
        return "R.A.: " + this.registroAcademico + " | Nome: " + this.nome;
    }

    // Método para imprimir o resultado
    public void imprimeResultado() {
        System.out.println("RESULTADO:");
        System.out.println(this.toString());
        System.out.printf("Média: %.2f\n", this.media());
        System.out.println("Situação: " + this.situacao());
    }
}
