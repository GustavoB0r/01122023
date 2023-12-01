package Atividades4;

import java.util.*;

public class Atividade4 {
    public static void main(String[] args) {

            Scanner ValorDeposito = new Scanner(System.in);

        try {
            System.out.println("Digite o valor da quantia a ser depositada");
            long Deposito = ValorDeposito.nextLong();

            System.out.println("O valor de R$ " + Deposito + " foi depositado com sucesso");

        } catch (InputMismatchException e) {
            System.out.println("Ocorreu um erro");
        }

        ValorDeposito.close();
    }
}
