package Zoho;

import java.util.Scanner;

public class ChildFather {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		String array[][] = {
				{"Paari","Karikalan"},
				{"Udhiran","Sendhan"},
				{"Tamil","Udhiran"},
				{"Sendhan","Arulmozhi"},
				{"Karikalan","Sendhan"}};
		String find = obj.next();
		int count=0;
		for(int i=0;i<array.length;i++) {
			if(array[i][1].equals(find)) {
				for(int j=0;j<array.length;j++) {
					if(array[j][1].equals(array[i][0])) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

}
