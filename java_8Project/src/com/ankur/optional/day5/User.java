package com.ankur.optional.day5;

import java.util.Optional;

public class User {
	// Without Optional Object
	public String getUsernameById(Integer id) {
		if(id == 100) {
			return "Ankur";
			
		}else if(id == 101) {
			return "Ravina";
		}else if(id ==102) {
			return "prity";
		}else {
			return null;
		}
	} 
	// With Optional Object
	public Optional<String> getUsername(Integer id){
		String name = null;
		if(id ==100 ) {
			name ="Ankur";
		}else if(id == 101) {
			name ="prity";
		}else if(id == 102) {
			name = "sonam";
		}
			return Optional.ofNullable(name);
	}

}
