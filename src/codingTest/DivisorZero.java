package codingTest;

import java.util.*;

public class DivisorZero {
//	나누어 떨어지는 숫자 배열
//	문제 설명
//	array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
//	divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
//
//	제한사항
//	arr은 자연수를 담은 배열입니다.
//	정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
//	divisor는 자연수입니다.
//	array는 길이 1 이상인 배열입니다.

	public static int[] solution(int[] arr, int divisor) {

		int count = 0;
		int temp = 0;
		List<Integer> li = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				li.add(arr[i]);
				count++;
			}
		}

		if (count == 0) {
			int[] i = { -1 };
			return i;
		}

		int[] answer = new int[li.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = li.get(i);
		}

		for (int i = 0; i < answer.length; i++) {
			for (int j = i + 1; j < answer.length; j++) {
				if (answer[i] > answer[j]) {
					temp = answer[i];
					answer[i] = answer[j];
					answer[j] = temp;
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		int[] i = { 2, 36, 1, 3 };

		System.out.println(solution(i, 1));
	}

}
