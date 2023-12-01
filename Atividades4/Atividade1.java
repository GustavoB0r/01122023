package Atividades4;

import java.util.*;

public class Atividade1 {
    
    public static void main(String[] args) {
        
        try{
            double gravidade = 10;
            Scanner Peso = new Scanner(System.in);

            System.out.println("Digite seu peso: ");
            double n1 = Peso.nextDouble();

            System.out.println("A sua massa é de :" + (n1 / gravidade));
            
            Peso.close();
        }

        catch (Exception e) {
            System.out.println("Ocorreu um erro");
        }
    } 
}
