package com.jpmorgan;

import java.io.BufferedReader;
import java.io.FileReader;

import com.jpmorgan.processor.Sales;

public class SalesMessageProcessor {
	public static void main(String[] args) {
	
		Sales sale = new Sales();

	
		try {
			String line;
			BufferedReader inputFile = new BufferedReader(new FileReader("testInput/testinput.txt"));
			while ((line = inputFile.readLine()) != null) {
			
				sale.processNotification(line);

				// log report
				// report only generates after every 10th iteration and stops on 50th
				sale.log.report();
			}
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}
}
