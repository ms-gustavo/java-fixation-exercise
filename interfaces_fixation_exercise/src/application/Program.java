package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato");
		System.out.print("Numero: ");
		Integer contractNumber = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), formatter);
		System.out.print("Valor do contrato: ");
		Double contractValue = sc.nextDouble();
		Contract contract = new Contract(contractNumber, date, contractValue);
		
		System.out.print("Entre com o número de parcelas: ");
		Integer contractInstallments = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(contract, contractInstallments);
		
		System.out.println("Parcelas: ");
		for(Installment installment: contract.getInstallments()) {
			System.out.println(installment);
		}
		
		
		sc.close();

	}

}
