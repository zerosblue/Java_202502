package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionExam07 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try(fis = new FileInputStream("file.txt"))
			fis = new FileInputStream("file.txt");
		}catch(IOException e) {
				
				e.printStackTrace();
			}
		};
		
		System.out.println("프로그램 종료");
		
	}

}
