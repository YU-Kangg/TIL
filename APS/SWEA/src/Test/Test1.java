package Test;

public class Test1 {
	public static void main(String[] args) {
		String[] arr = { "cat", "dog", "egg", "bat", "car", "cat", "dog", "eel", "fox" };

		int result = 1; // 최장 증가 구간 길이
		int count = 1;
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i].compareTo(arr[i - 1]) > 0) {
				count++;
				if (result < count) {
					result = count;
				}
			} else {
				count = 1;
			}
		}
		System.out.println("가장 긴 사전순 증가 구간 길이: " + result);
	}
}
