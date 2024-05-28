import java.util.Scanner;

public class Contador  extends ParametrosInvalidosException{
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.printf("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.printf("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try{
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e){

        }
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm > parametroDois){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro:");
        }
        int contagem = parametroDois - parametroUm;

        for (int contador = 1; contador <= contagem; contador++){
            System.out.println("Imprimindo o número "+contador);
        }
    }
}
