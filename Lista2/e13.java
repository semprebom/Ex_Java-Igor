package Lista2;

import java.util.Scanner;

public class e13  {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        int lado;
        float medida;
        System.out.println("Quantos lados tem o polígono?");
        lado = ler.nextInt();
        System.out.println("Qual a medida de seu lado?");
        medida = ler.nextFloat();
        if (lado == 3) {
        	System.out.println("Trata-se de um triângulo.");
        	System.out.println("Área = "+medida+" cm2");
        } else if (lado == 4) {
        	System.out.println("Trata-se de um quadrado");
        	System.out.println("Área = "+medida+" cm2");
        } else if (lado == 5) {
        	System.out.println("Trata-se de um pentágono.");
        }
	}
}
