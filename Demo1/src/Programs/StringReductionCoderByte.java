package Programs;

import java.util.Scanner;

public class StringReductionCoderByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		String[] arr = {"bc","cb","ca","ac","ab","ba"};
		String[] arr2 = {"a","a","b","b","c","c"};
		
		String str = input;
		boolean isPresent = false;
		do {
			isPresent=false;
			for(int i=0;i<arr.length;i++) {
				if(str.contains(arr[i])) {
					isPresent=true;
					str = str.replace(arr[i], arr2[i]);
					break;
				}
			}
			
			/*
			for(int i=0;i<arr.length;i++) {
				if(str.contains(arr[i])) {
					isPresent=true;
					break;
				}
			}
			*/
		}while(isPresent);
		
		System.out.println(str);
		

	}

}
