package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("dimmi il tuo nome: ");
		String name = in.nextLine();
		
		System.out.println("dimmi il tuo cognome: ");
		String lastName = in.nextLine();
		
		System.out.println("dimmi il tuo colore preferito: ");
		String favouriteColor = in.nextLine();
		
		System.out.println("dimmi che giorno sei nato: ");
		String day = in.nextLine();
		int day2 = Integer.valueOf(day);
		
		System.out.println("dimmi che mese sei nato: ");
		String month = in.nextLine();
		int month2 = Integer.valueOf(month);
		
		System.out.println("dimmi che anno sei nato: ");
		String year = in.nextLine();
		int year2 = Integer.valueOf(year);
		
		int sumAge = Integer.valueOf(day2 + month2 + year2);
		System.out.println("la tua password è:" +name+"-"+lastName+"-"+favouriteColor+"-"+sumAge);
		
		in.close();
	}	
}
