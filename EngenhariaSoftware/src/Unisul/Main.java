package Unisul;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        Funcionario funcionarioCLT = new FuncionarioCLT(nome, salario);
        Funcionario funcionarioPJ = new FuncionarioPJ(nome, salario);

        double custoCLT = funcionarioCLT.calculeCusto();
        double custoPJ = funcionarioPJ.calculeCusto();

        System.out.println("Custo CLT para " + funcionarioCLT.getNome() + ": R$ " + custoCLT);
        System.out.println("Custo PJ para " + funcionarioPJ.getNome() + ": R$ " + custoPJ);
    }
}
