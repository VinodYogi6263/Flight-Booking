package com.ss.request;

import javax.transaction.Transactional;

import com.ss.entity.PassengerInformation;
import com.ss.entity.PaymentInformation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingRequest {

	private PassengerInformation passengerInformation;
	private PaymentInformation paymentInformation;
}
