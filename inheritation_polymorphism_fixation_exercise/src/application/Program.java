package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		List<TaxPayer> taxPayerList = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			Character taxPayerType = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			switch (taxPayerType) {
			case 'i':
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				taxPayerList.add(new Individual(name, anualIncome, healthExpenditures));
				break;
			case 'c':
				System.out.print("Number of employees: ");
				Integer numberOfEmployees = sc.nextInt();
				taxPayerList.add(new Company(name, anualIncome, numberOfEmployees));
				break;
			default:
				System.out.println("Caractere invalido, encerrando programa");
				return;
			}
		}
		
		Double totalTaxes = 0.0;
		for(TaxPayer taxPayer : taxPayerList) {
			System.out.println(taxPayer);
			totalTaxes += taxPayer.tax();
		}
		System.out.println();
		System.out.print("TOTAL TAXES: $ " + totalTaxes);
		sc.close();
	}

}
