package Zoho;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NearestPrime {

	public static void main(String[] args) {
		int arr[] = {10,12,13,23,35};
		Map<Integer,Integer> map = new HashMap<>();
		int max=0;
		for(int num : arr) {
			if(isPrime(num))
				map.put(num,0);
			else {
				map.put(num,prime(num));
				max=Math.max(max, prime(num));
			}
			
		}
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<=max;i++) {
			for(int key : map.keySet())
			{
				if(i == map.get(key)) {
					list.add(key);
				}
			}
				
		}
		
		System.out.println(list);

		
	}
	static int prime(int num) {
		return Math.min(Math.abs(rprime(num+1)-num), Math.abs(num-lprime(num-1)));
	}
	static int rprime(int num) {
		if(isPrime(num))
			return num;
		return rprime(num-1);
	}
	static int lprime(int num) {
		if(isPrime(num))
			return num;
		return lprime(num+1);
	}
	static boolean isPrime(int num) {
		if(num==2||num==3)
			return true;
		if(num%2==0 || num%3==0)
			return false;
		for(int i=5;i*i<num;i+=6) {
			if(num%i==0 || num%(i+2)==0)
				return false;
		}
		return true;
	}

}
