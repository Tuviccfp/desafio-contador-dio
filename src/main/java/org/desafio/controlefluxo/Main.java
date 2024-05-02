package org.desafio.controlefluxo;

import org.desafio.controlefluxo.exception.ParamsInvalid;

import java.util.Scanner;


public class Main {
    public static void contar(int param1, int param2) throws ParamsInvalid {
        if (param1 > param2) {
            throw new ParamsInvalid("O parâmetro 2 deve ser maior que o primeiro");
        }
        int count = Math.abs(param2 - param1);
        for (int x = 0; x < count; x++) {
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int param1 = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int param2 = terminal.nextInt();

        try {
            contar(param1, param2);
        } catch (ParamsInvalid e) {
            System.out.println(e.getMessage());
        }
        terminal.close();
    }
}