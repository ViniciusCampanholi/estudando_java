package exceptions.reservationproject.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import exceptions.reservationproject.application.model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Room number: ");
		int room = sc.nextInt();

		System.out.println("Check-in date (dd/MM/yyyy): ");
		Date checkIn = simpleDateFormat.parse(sc.next());

		System.out.println("Check-out date (dd/MM/yyyy): ");
		Date checkOut = simpleDateFormat.parse(sc.next());

		if (!checkOut.after(checkIn)) {
			System.out.println("A data de check-in nao pode ser maior que a data de check-out!");
		} else {
			Reservation reservation = new Reservation(room, checkIn, checkOut);
			System.out.println("Reservation: " + reservation.toString());

			System.out.println();
			System.out.println("Insira a data para atualizar a reserva: ");

			System.out.println("Check-in date (dd/MM/yyyy): ");
			checkIn = simpleDateFormat.parse(sc.next());

			System.out.println("Check-out date (dd/MM/yyyy): ");
			checkOut = simpleDateFormat.parse(sc.next());

			Date hoje = new Date();
			if (checkIn.before(hoje) || checkOut.before(hoje)) {
				System.out.println("Erro ao fazer a reserva, as datas nao podem ser anteriores a data atual");
			} else if (!checkOut.after(checkIn)) {
				System.out.println("A data de check-in nao pode ser maior que a data de check-out!");
			} else {
				reservation.updateDates(checkIn, checkOut);
				System.out.println("Reservation: " + reservation);
			}
		}
	}

}
