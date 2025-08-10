package Test;

public class test4 {
	
	public static void hanoi(int 개수, int 초기, int 목표, int 중간) {
		if (개수 == 1) {
			System.out.println(초기 + " → " + 목표);
		}
		else {
			hanoi(개수 - 1, 초기, 중간, 목표); // N-1개를 보조 기둥으로 이동
			System.out.println(초기 + " → " + 목표);//큰 원판 하나 이동
			hanoi(개수 - 1, 중간, 목표, 초기); // 중간기둥에서 목표 기둥으로
		}
	}
	
	
	public static void main(String[] args) {
		hanoi(3,1,3,2);
	}
}
