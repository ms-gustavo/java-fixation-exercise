package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Room number: ");
			Integer roomNumber = sc.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkInDate = sdf.parse(sc.next());
			System.out.print("Check-out date: ");
			Date checkOutDate = sdf.parse(sc.next());
			
			Reservation reservation = new Reservation(roomNumber, checkInDate, checkOutDate);
			System.out.print(reservation);
			System.out.println();
			
			System.out.println("Enter data to update the reservation:");
			
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date updateCheckInDate = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date updateCheckOutDate = sdf.parse(sc.next());
			reservation.updateDates(updateCheckInDate, updateCheckOutDate);			
		} catch (ParseException e) {
			System.out.print("Invalid date format!");
		} catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		} catch(RuntimeException e) {
			System.out.println("Unexpected error");
		}

		sc.close();
	}

}
