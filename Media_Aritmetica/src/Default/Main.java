package Default;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	double x, y, media;
	
	System.out.print("Digite o Primeiro numero: ");
	x = sc.nextDouble();
    System.out.print("Digite o Segundo numero: ");
    y = sc.nextDouble();
    media = (x + y) / 2.0;
    System.out.println("Media = "+ media);
    sc.close();
     }
  }