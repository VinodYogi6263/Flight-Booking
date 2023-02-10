package com.ss.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ss.entity.PassengerInformation;
import com.ss.entity.PaymentInformation;

public interface PassengerRepository extends JpaRepository<PassengerInformation, Long> {

}
