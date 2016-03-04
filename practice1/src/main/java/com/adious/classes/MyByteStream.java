package com.adious.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyByteStream {

	public static void main(String[] args) {
		
		
		byte[] b = new byte[128];
		
		try(
				FileInputStream fis = new FileInputStream("C:\\Users\\adeelm\\Dev\\JavaExercises\\practice1\\src\\main\\java\\resources\\source.xml");
				FileOutputStream fos = new FileOutputStream("C:\\Users\\adeelm\\Dev\\JavaExercises\\practice1\\src\\main\\java\\resources\\source.txt");
			){
							
			
			System.out.println("Available byte : "+fis.available());
			
			int count=0;
			int read=0;
			
			while( (read = fis.read(b)) != -1)
			{
				fos.write(b);
				count += read;
			}
			
			System.out.println("Wrote byte :"+ count);
			
			
			
			
		}catch(FileNotFoundException f){
			System.out.println(f.getMessage());
		}
		catch(IOException ex){
			System.out.println(ex.getMessage());
		}
		
		

	}

}
