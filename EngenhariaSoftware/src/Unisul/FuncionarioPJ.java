package Unisul;

public class FuncionarioPJ extends Funcionario {
    public FuncionarioPJ(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calculeCusto() {
        return getSalario() * 1.1;  // Salário mais 10%
    }
}
