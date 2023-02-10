package com.ss.utils;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ss.exception.InsufficientAmountException;
@Service
public class PaymentUtils {

	private static Map<String, Double> paymentMap = new HashMap();

	{
		paymentMap.put("7272", 1000.00);
		paymentMap.put("7273", 10000.00);
		paymentMap.put("7274", 2000.00);
		paymentMap.put("7275", 3000.00);
		paymentMap.put("7276", 4000.00);
		paymentMap.put("7277", 5000.00);
		paymentMap.put("7278", 6000.00);
		paymentMap.put("7279", 15000.00);
	}

	public static boolean validateCreditLimit(String accoundno, Double paidAmount) {
		if (paidAmount > paymentMap.get(accoundno))
			throw new InsufficientAmountException("Insufficinet Amount Found.......");

		else
			return true;

	}

}
