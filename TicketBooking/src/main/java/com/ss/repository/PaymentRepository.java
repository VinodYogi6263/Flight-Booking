package com.ss.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ss.entity.PaymentInformation;

public interface PaymentRepository extends JpaRepository<PaymentInformation,Long>{

}
