package exceptions.reservationproject.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import exceptions.reservationproject.application.model.entities.Reservation;
import exceptions.reservationproject.application.model.exceptions.DomainException;

public class Program {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.println("Room number: ");
			int room = sc.nextInt();
	
			System.out.println("Check-in date (dd/MM/yyyy): ");
			Date checkIn = simpleDateFormat.parse(sc.next());
	
			System.out.println("Check-out date (dd/MM/yyyy): ");
			Date checkOut = simpleDateFormat.parse(sc.next());
	
			Reservation reservation = new Reservation(room, checkIn, checkOut);
			System.out.println("Reservation: " + reservation.toString());
	
			System.out.println();
			System.out.println("Insira a data para atualizar a reserva: ");
	
			System.out.println("Check-in date (dd/MM/yyyy): ");
			checkIn = simpleDateFormat.parse(sc.next());
	
			System.out.println("Check-out date (dd/MM/yyyy): ");
			checkOut = simpleDateFormat.parse(sc.next());
	
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
		} catch(ParseException e) {
			System.out.println("Formato de data invalido");
		} catch(DomainException e) {
			System.out.println("Erro: "+ e.getMessage());
		}
	}
}
