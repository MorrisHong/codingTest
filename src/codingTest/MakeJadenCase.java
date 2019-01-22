package codingTest;

public class MakeJadenCase {
//	문제 설명
//	JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.
//
//	제한 조건
//	s는 길이 1 이상인 문자열입니다.
//	s는 알파벳과 공백문자(" ")로 이루어져 있습니다.
//	첫 문자가 영문이 아닐때에는 이어지는 영문은 소문자로 씁니다. ( 첫번째 입출력 예 참고 )
	public static String solution(String s) {
		String[] ss = s.split(" ");
		String answer = "";
		for (int i = 0; i < ss.length; i++) {
			char[] temp = new char[ss[i].length()];
			temp = ss[i].toCharArray();
			
			for(int j = 0; j < temp.length; j++) {
				if(Character.isUpperCase(temp[j])) {
					temp[j] = Character.toLowerCase(temp[j]);
				}
				temp[0] = Character.toUpperCase(temp[0]);
			}
			
			answer += " " + String.valueOf(temp);
		}
		System.out.println(answer);
		answer = answer.substring(0, answer.length());
		
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution("3people unFollowed me"));
	}

}
