package test;

import java.util.ArrayList;
import java.util.HashMap;

public class test {
	
	
	public static void main(String[] args) {
		String s = "bbbb";
		
		int [] answer = solution(s);
		for(int i = 0 ; i < answer.length ; i ++) {
			System.out.print(answer[i] + " ");
		}
		System.out.println();
		String s1 = "banana";
		int[] answer2 = solution(s1);
		for(int i = 0 ; i < answer2.length ; i ++) {
			System.out.print(answer2[i]+ " ");
		}
	}
	public static int[] solution(String s) {
		int[] answer = new int[s.length()];
		//해쉬맵에 0번째 b add 
		HashMap<String, Integer> hs = new HashMap<String, Integer>(); 
		for(int i = 0 ; i < s.length() ; i++) {
			String x = s.charAt(i) + "";
			if(hs.containsKey(x)) {
				answer[i] = i - hs.get(x); 
				hs.put(x, i);
			}else {
				answer[i] = -1;
				hs.put(x, i);
			}
		}
		
		return answer;
	}
	
}
