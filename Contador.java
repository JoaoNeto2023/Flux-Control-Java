import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

public class Contador {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametro1 = ler.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametro2 = ler.nextInt();

        try {
            // chamando o método contendo a lógica de contagem
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            // imprimir a mensagem: O primeiro parâmetro deve ser menor que o segundo
            System.out.println(e.getMessage());
        }
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        // validar se parametroUm é MENOR que parametroDois e lançar a exceção
        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException("O primeiro parâmetro deve ser menor que o segundo");
        }

        int contagem = parametro2 - parametro1;
        // realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= Math.abs(contagem); i++) {
            System.out.println("Imprimindo o número " + (parametro1 + i));
        }
    }
}
