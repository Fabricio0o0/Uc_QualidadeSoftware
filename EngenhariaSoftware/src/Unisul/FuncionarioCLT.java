package Unisul;

public class FuncionarioCLT extends Funcionario {

    public FuncionarioCLT(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calculeCusto() {
        double valeTransporte = 138.00;
        double auxilioAlimentacao = 0.80 * getSalario(); // 80% do salário
        double fracaoDecimoTerceiro = 0.083 * getSalario(); // 8,3% do salário
        double fracaoFerias = 0.1111 * getSalario(); // 11,11% do salário
        double fgts = 0.08 * getSalario(); // 8% do salário
        double fracaoFGTSDecimoTerceiroFerias = 0.014 * getSalario(); // 1,4% do salário
        double inss = 0.20 * getSalario(); // 20% do salário
        double fracaoINSSDecimoTerceiroFerias = 0.04 * getSalario(); // 4% do salário

        return getSalario() + valeTransporte + auxilioAlimentacao + fracaoDecimoTerceiro +
               fracaoFerias + fgts + fracaoFGTSDecimoTerceiroFerias + inss +
               fracaoINSSDecimoTerceiroFerias;
    }
}
