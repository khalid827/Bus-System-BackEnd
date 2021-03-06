package com.example.velocity.easybus.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="booking")
public class Booking {
	
	@Id
	private String id;
	
	private String passengerName;
	private int numberOfseats;
	private double price;
	private double totalCost;
	private long phoneNumber;
	private String nameOnCard;
	private int creditDebitCard;
	private int expMonth;
	private int expYear;
	private int cvv;
	private Date dateOfBooking;
	
	private String email;
	private String departureLocation;
	private String arrivalLocation;
	
	private String departureTime;
	private String arrivalTime;
	private String busId;
	
	
	public Booking() {
		
	}



	public Booking(String passengerName, int numberOfseats, double price, double totalCost, long phoneNumber,
			String nameOnCard, int creditDebitCard, int expMonth, int expYear, int cvv, String email,
			String departureLocation, String arrivalLocation, String departureTime, String arrivalTime, String busId, Date dateOfBooking) {
		super();
		this.passengerName = passengerName;
		this.numberOfseats = numberOfseats;
		this.price = price;
		this.totalCost = totalCost;
		this.phoneNumber = phoneNumber;
		this.nameOnCard = nameOnCard;
		this.creditDebitCard = creditDebitCard;
		this.expMonth = expMonth;
		this.expYear = expYear;
		this.cvv = cvv;
		this.email = email;
		this.departureLocation = departureLocation;
		this.arrivalLocation = arrivalLocation;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.busId = busId;
		this.dateOfBooking=dateOfBooking;
	}







	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public int getNumberOfseats() {
		return numberOfseats;
	}

	public void setNumberOfseats(int numberOfseats) {
		this.numberOfseats = numberOfseats;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double d) {
		this.totalCost = this.getNumberOfseats()*this.getPrice();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	public String getDepartureLocation() {
		return departureLocation;
	}



	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}



	public String getArrivalLocation() {
		return arrivalLocation;
	}



	public void setArrivalLocation(String arrivalLocation) {
		this.arrivalLocation = arrivalLocation;
	}



	public String getDepartureTime() {
		return departureTime;
	}



	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}



	public String getArrivalTime() {
		return arrivalTime;
	}



	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}



	public long getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public String getNameOnCard() {
		return nameOnCard;
	}



	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}



	public int getCreditDebitCard() {
		return creditDebitCard;
	}



	public void setCreditDebitCard(int creditDebitCard) {
		this.creditDebitCard = creditDebitCard;
	}



	public int getExpMonth() {
		return expMonth;
	}



	public void setExpMonth(int expMonth) {
		this.expMonth = expMonth;
	}



	public int getExpYear() {
		return expYear;
	}



	public void setExpYear(int expYear) {
		this.expYear = expYear;
	}



	public int getCvv() {
		return cvv;
	}



	public void setCvv(int cvv) {
		this.cvv = cvv;
	}



	public String getBusId() {
		return busId;
	}



	public void setBusId(String busId) {
		this.busId = busId;
	}



	public Date getDateOfBooking() {
		return dateOfBooking;
	}



	public void setDateOfBooking(Date dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}

	
	
	
	
	
}
