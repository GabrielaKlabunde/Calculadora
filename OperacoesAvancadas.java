package operacao;

public class OperacoesAvancadas {

    public double potencia(double base, double expoente) {
        double resultado = 1;

        for (int i = 0; i < expoente; i++) {
            resultado = resultado * base;
        }
        return resultado;
    }
}

