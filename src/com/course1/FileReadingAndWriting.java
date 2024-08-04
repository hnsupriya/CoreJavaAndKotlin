package com.course1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadingAndWriting {
	public static void main(String[] args) {
		File f1 = new File("Users/nandi/OneDrive/Desktop/test1.txt/test1.txt");
				System.out.println(f1.getAbsoluteFile());

				FileInputStream fis;
				try {
					fis = new FileInputStream(f1);

					InputStreamReader isreader = new InputStreamReader(fis);

				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException exp) {
					exp.printStackTrace();
				}

			}

		
		
	}


