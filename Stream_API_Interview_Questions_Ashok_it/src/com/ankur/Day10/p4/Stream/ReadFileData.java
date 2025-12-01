package com.ankur.Day10.p4.Stream;

import java.io.*;
import java.nio.file.*;
import java.util.stream.Stream;

public class ReadFileData {
	public static void main(String[] args)throws Exception {
		/*fileReader is read the data char by char lot of time  
		 * read the data from line by line buffered reader lot of time
		 */
		
		
		/*FileReader fr = new FileReader(new File("info.txt"));
		BufferedReader br = new BufferedReader(fr);
		String readLine = br.readLine();
		
		while(readLine != null) {
			System.out.println(readLine);
			readLine = br.readLine();
		}
		br.close();*/
		
		//to over come this problem introduce java 8 Stream I/O
		String fileName = "info.txt";
		try (Stream<String> stream = Files.lines(Paths.get(fileName))){
			stream.forEach(f->System.out.println(f));
			// use logic line start with 'H'
			//stream.filter(f->f.startsWith("H")).forEach(f->System.out.println(f));
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
