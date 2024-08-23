package segundaQuest;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = tec.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = tec.nextInt();

        try {
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O valor do primeiro parametro é maior que o valor do segundo parametro");
        }
        int contagem = parametroDois - parametroUm;
        for(int x = 0; x<contagem; x++){
            System.out.println("imprimindo numero " + x);
        }
    }
}
