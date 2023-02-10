package com.ss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ss.request.BookingRequest;
import com.ss.response.BookingResponse;
import com.ss.service.BookingService;

@RestController
@EnableTransactionManagement
public class BookingController {
	@Autowired
	BookingService bookingService;

	@PostMapping("/booking")
	public BookingResponse save(@RequestBody BookingRequest bookingrequest) {
		return bookingService.bookticket(bookingrequest);

	}
}
