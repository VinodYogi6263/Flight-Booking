package com.ss.response;

import com.ss.entity.PassengerInformation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingResponse {

	private String status;
	private double totalFare;
	private String pnrNo;
	private PassengerInformation passengerInformation;
}
