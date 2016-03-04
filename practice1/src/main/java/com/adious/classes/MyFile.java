package com.adious.classes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class MyFile {

	public static void main(String[] args) {

		Path file = Paths.get("src/main/java/resources/source.xml");
		List<String> fileStr;
		
		try {
			fileStr = Files.readAllLines(file);
			fileStr.stream()
					.filter(line->line.contains("lastname"))
						.forEach(line->System.out.println(line));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println(file.toAbsolutePath());
		
		
	}

}
