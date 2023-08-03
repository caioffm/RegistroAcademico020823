import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        String ra = leRegistroAcademico(scanner, "Digite o R.A. do aluno: ");
        double notaProva1 = leNota(scanner, "Digite a primeira nota de prova do aluno: ");
        double notaProva2 = leNota(scanner, "Digite a segunda nota de prova do aluno: ");
        double notaTrabalho = leNota(scanner, "Digite a nota do trabalho do aluno: ");

        Aluno aluno = new Aluno(nome, ra, notaProva1, notaProva2, notaTrabalho);
        aluno.imprimeResultado();

        scanner.close();
    }

    private static double leNota(Scanner scanner, String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida, por favor insira um número.");
                scanner.next(); // descarta a entrada inválida
            }
        }
    }

    private static String leRegistroAcademico(Scanner scanner, String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return String.valueOf(scanner.nextInt());
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida, por favor insira um número.");
                scanner.next(); // descarta a entrada inválida
            }
        }
    }
}
