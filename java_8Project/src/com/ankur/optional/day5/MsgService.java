package com.ankur.optional.day5;

import java.util.Optional;
import java.util.Scanner;

public class MsgService {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Id");
		int userId = sc.nextInt();
		
		User user = new User();
		/*String username = user.getUsernameById(userId);
		String msg = username.toUpperCase()+", Hello";
		System.out.println(msg);*/
		
		Optional<String> username = user.getUsername(userId);
		if(username.isPresent()) {
			System.out.println(username.get().toUpperCase());
		}else {
			System.out.println("Data is not found");
		}
	}

}
