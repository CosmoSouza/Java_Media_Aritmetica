package Inadimplencia;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x, y, media;

        System.out.print("Digite o primeiro número: ");
        x = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        y = sc.nextDouble();

        media = (x + y) / 2.0;

        System.out.println("Média = " + media);

        sc.close();
    }
}
