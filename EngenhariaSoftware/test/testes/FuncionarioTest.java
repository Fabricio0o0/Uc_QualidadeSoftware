package testes;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import Unisul.Funcionario;
import Unisul.FuncionarioCLT;
import Unisul.FuncionarioPJ;

public class FuncionarioTest {

    @Test
    public void testCalculoCustoFuncionarioCLT() {
        // Crie um funcionário CLT com um salário de R$ 10.000,00
        FuncionarioCLT funcionarioCLT = new FuncionarioCLT("João", 10000.00);

        // Defina os valores esperados com base nos exemplos fornecidos
        double valeTransporte = 138.00;
        double auxilioAlimentacao = 0.80 * funcionarioCLT.getSalario(); // 80% do salário
        double fracaoDecimoTerceiro = 0.083 * funcionarioCLT.getSalario(); // 8,3% do salário
        double fracaoFerias = 0.1111 * funcionarioCLT.getSalario(); // 11,11% do salário
        double fgts = 0.08 * funcionarioCLT.getSalario(); // 8% do salário
        double fracaoFGTSDecimoTerceiroFerias = 0.014 * funcionarioCLT.getSalario(); // 1,4% do salário
        double inss = 0.20 * funcionarioCLT.getSalario(); // 20% do salário
        double fracaoINSSDecimoTerceiroFerias = 0.04 * funcionarioCLT.getSalario(); // 4% do salário

        // Calcule o custo total
        double custoTotal = funcionarioCLT.calculeCusto();

        // Verifique se o custo total calculado corresponde ao valor esperado
        assertEquals(valeTransporte + auxilioAlimentacao + fracaoDecimoTerceiro +
                     fracaoFerias + fgts + fracaoFGTSDecimoTerceiroFerias + inss +
                     fracaoINSSDecimoTerceiroFerias, custoTotal, 0.01); // Use 0.01 de margem para comparação devido a possíveis arredondamentos
    }
}