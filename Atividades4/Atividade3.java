package Atividades4;

import java.util.*;

public class Atividade3 {

    public static void main(String[] args) {
        
        Scanner n1 = new Scanner(System.in);
        Scanner n2 = new Scanner(System.in);
        
        try {

            System.out.println("Digite sua idade");
            short idade = n1.nextShort();

            System.out.println("Digite o ano atual");
            short ano = n2.nextShort();

            System.out.println("Você nasceu no ano de: " + (ano - idade));

        } catch (Exception e) {
            System.out.println("Ocorreu um erro");
        }
        
        n1.close();
        n2.close();
    }
}
