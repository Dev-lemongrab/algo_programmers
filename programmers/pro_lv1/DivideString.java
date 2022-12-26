package pro_lv1;

public class DivideString {

	public static void main(String[] args) {
		String s = "abracadabra";
		solution(s);
	}
	
	static int solution(String s) {
		int len = s.length();
		int answer = 0;
		int num = 0;
		char x = 0;
		for(int i = 0 ; i < len ; i++) {
			if(num == 0) {
				answer++;
				x = s.charAt(i);
			}
			if(x == s.charAt(i)) {
				num++;
			}else {
				num--;
			}
		}
		return answer;
	}
}
