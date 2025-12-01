package com.ankur.Day10.p4;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService_Base64 {
		public static void main(String[] args) {
			// Encodeing Decoding use Base64 class in java 8
			String pwd = "ankur@1234";
			
			Encoder encoder  = Base64.getEncoder();
			
			// converting String to  byte[] and passing as input for encode( ) method 
			byte[] encode = encoder.encode(pwd.getBytes());
			
			//converting byte[] to string
			String encodePwd = new String(encode);
			System.out.println(encodePwd);
			
			
			//decode the password
			Decoder decoder = Base64.getDecoder();
			byte[] decode = decoder.decode(encodePwd);
			String decodePwd = new String(decode);
			System.out.println(decodePwd);
			
		}
}
