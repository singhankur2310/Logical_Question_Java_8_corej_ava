package com.ankur.Day10.p4;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Base64.Encoder;

public class password_service_encrpted_demo {
		public static void main(String[] args) throws NoSuchAlgorithmException {
			//Encryption format password to convert to unreadable format
			String pwd = "ankur@123";
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			byte[] digest = md.digest(pwd.getBytes());
			String encrypted = new String(digest);
			System.out.println( "Encrypted :: "+encrypted);
			
			//Encryption to covert encoder
			Encoder encoder = Base64.getEncoder();
			byte[] encode = encoder.encode(digest);
			System.out.println("Encrpted + Encode :: "+new String(encode));
			
		}
}
