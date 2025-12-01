package com.ankur.it.day5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
		public static void main(String[] args) throws Exception {
			Date d = new Date();
			System.out.println(d);
			
			// dd/MM/yyyy
			//Converting Date to String
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
			String format1 = sdf1.format(d);
			System.out.println(format1);
			//MM/dd/yyyy
			SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy");
			String format2 = sdf2.format(d);
			System.out.println(format2);
			
			// Convert String To Date
			SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
			Date parseDate = sdf3.parse("2025-1-16");
			System.out.println(parseDate);
		}
}
