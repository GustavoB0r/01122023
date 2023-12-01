package Atividades4;

import java.util.*;

public class Atividade2 {
    public static void main(String[] args) {

        try {
            Scanner comp = new Scanner(System.in);
            Scanner largura = new Scanner(System.in);

            System.out.println("Digite a largura");
            Double n1 = largura.nextDouble();

            System.out.println("Digite o comprimento");
            Double n2 = comp.nextDouble();

            System.out.println("O total de metros quadrados é: " + (n1 * n2));

            largura.close();
            comp.close();
            
        } catch (Exception e) {
            System.out.println("Ocorreu um erro");
        }
    }
}
