package com.ss.service;

import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ss.entity.PassengerInformation;
import com.ss.entity.PaymentInformation;
import com.ss.repository.PassengerRepository;
import com.ss.repository.PaymentRepository;
import com.ss.request.BookingRequest;
import com.ss.response.BookingResponse;
import com.ss.utils.PaymentUtils;

@Service
public class BookingServiceImpl implements BookingService {
	@Autowired
	private PassengerRepository passengerRepository;
	@Autowired
	private PaymentRepository paymentRepository;
	@Autowired
	private PaymentUtils paymentUtils;

	@Transactional
	@Override
	public BookingResponse bookticket(BookingRequest bookingRequest) {

		PassengerInformation passengerInformation = bookingRequest.getPassengerInformation();
		passengerRepository.save(passengerInformation);
		PaymentInformation paymentInformation = bookingRequest.getPaymentInformation();
		boolean validateCreditLimit = PaymentUtils.validateCreditLimit(paymentInformation.getAccountNo(),
				passengerInformation.getFare());

		paymentInformation.setAmount(passengerInformation.getFare());
		paymentRepository.save(paymentInformation);

		return new BookingResponse("success", passengerInformation.getFare(),
				UUID.randomUUID().toString().split("-")[0], passengerInformation);
	}

}
