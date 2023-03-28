package exceptions.reservationproject.application.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import exceptions.reservationproject.application.model.exceptions.DomainException;

public class Reservation {

	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;

	private static SimpleDateFormat simpleDateFormate = new SimpleDateFormat("dd/MM/yyyy");

	public Reservation(Integer roomNumber, Date checkIn, Date checkOut){
		if (!checkOut.after(checkIn)) {
			throw new DomainException("A data de check-in nao pode ser maior que a data de check-out");
		}
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public long duration() {
		long diffMilliseconds = checkOut.getTime() - checkIn.getTime();
		long diff = TimeUnit.DAYS.convert(diffMilliseconds, TimeUnit.MILLISECONDS);
		return diff;
	}

	public void updateDates(Date checkin, Date checkout){
		Date hoje = new Date();
		if (checkIn.before(hoje) || checkOut.before(hoje)) {
			throw new DomainException("As datas nao podem ser anteriores a data atual");
		}
		if (!checkOut.after(checkIn)) {
			throw new DomainException("A data de check-in nao pode ser maior que a data de check-out");
		}
		this.checkIn = checkin;
		this.checkOut = checkout;
	}

	@Override
	public String toString() {
		return "Room " + roomNumber + ", check-in: " + simpleDateFormate.format(checkIn) + ", "
				+ simpleDateFormate.format(checkOut) + ", " + duration() + " nights";
	}
}
