package com.ss.service;

import org.springframework.stereotype.Service;

import com.ss.request.BookingRequest;
import com.ss.response.BookingResponse;

@Service
public interface BookingService {
	public BookingResponse bookticket(BookingRequest bookingRequest);
}
