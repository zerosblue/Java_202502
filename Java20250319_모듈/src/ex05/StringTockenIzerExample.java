package ex05;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTockenIzerExample {

	public static void main(String[] args) {
		
		String data1 = "홍길동&이수홍, 박연수|박수홍";
		String[] arr = data1.split("&|,");
		
		for(String token : arr)
			System.out.println(token);
			
			String data2 = "홍길동/이수홍.박연수";
			
			StringTokenizer st = new StringTokenizer(data2,"/");
			while(st.hasMoreElements()) {
				System.out.println(st.nextToken());
			}

	}

}