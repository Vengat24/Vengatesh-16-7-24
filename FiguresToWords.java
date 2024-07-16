package Zoho;

import java.util.HashMap;
import java.util.Map;

public class FiguresToWords {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();	
		map.put(1,"one");
		map.put(2,"two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5,"five");
		map.put(6, "six");
		map.put(7, "seven");
		map.put(8,"eight");
		map.put(9, "nine");
		map.put(10, "ten");
		map.put(11, "eleven");
		map.put(12,"twelve");
		map.put(13,"thirteen");
		map.put(14,"fourteen");
		map.put(15, "fifteen");
		map.put(16, "sixteen");
		map.put(17, "seventeen");
		map.put(18, "eighteen");
		map.put(19, "nineteen");
		map.put(20, "twenty");
		map.put(30,"thirty");
		map.put(40, "fourty");
		map.put(50, "fifty");
		map.put(60, "sixty");
		map.put(70, "seventy");
		map.put(80, "eighty");
		map.put(90, "ninty");
		
		Map<Integer,String> unit = new HashMap<>();
		unit.put(1, "");
		unit.put(2, "");
		unit.put(3, "hundred");
		unit.put(4, "thousand");
		unit.put(5, "thousand");
		unit.put(6, "lakhs");
		unit.put(7, "lakhs");
		unit.put(8, "crore");
		unit.put(9, "crore");
		unit.put(11, "million");
		int num = 123456789;
//		2147483647
		String st = new String();
		int i=0;
		while(num!=0) {
			int ld1 = num%10;
			num/=10;
			i++;
			if(i!=3) {
				int ld2 = num%10;
				num/=10;
				i++;
				if(ld2==1) {
					ld2= ld2*10 + ld1;
					st = (unit.get(i)) + " " + st;
					st = (map.get(ld2)) + " "+ st;
				}else {
					
					ld2 *= 10;
					if(ld1!=0 || ld2!=0)
						st = (unit.get(i)) + " "+ st;
					if(ld1 !=0 )
						st = (map.get(ld1))+" "+ st;
					if(ld2!=0)
						st = (map.get(ld2))+ " "+ st;
				}
			}else {
				if(i>=2) {
					st = ("and") + " "+ st;
				}
				if(ld1>0) {
					st = (unit.get(i))+ " "+ st;
					st = (map.get(ld1)) + " "+ st;
				}				
			}
			
		}
		System.out.println(st);
		
	}

}
