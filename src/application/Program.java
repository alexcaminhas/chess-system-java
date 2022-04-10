package application;

import java.util.Scanner;

import boardgame.Position;

public class Program {
	public static void main(String[] args) {
		
		Position position = new Position();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor da linha: ");
		position.setRowInteger(sc.nextInt());
		System.out.print("Digite o valor da coluna: ");
		position.setColumn(sc.nextInt());
		
		System.out.println(position);
		
		sc.close();
		
	}
	
}
