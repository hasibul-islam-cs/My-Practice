package com.ReadInputFromFile;

import java.util.Scanner;
import java.io.File;
import java.io.PrintStream;
import java.io.FileNotFoundException;

public class ReadWriteIOIntoTxtFile {
	public static void main(String[] args){
		Scanner sc = null;
		PrintStream ps = null;
		try {
			sc = new Scanner (new File("input.txt"));
			ps = new PrintStream("output.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
		int a, b, c;
		for (int i=0; i<3; i++){
			a = sc.nextInt();
			b = sc.nextInt();
			c = a+b;				
			ps.println(c);
		}
	}
}

