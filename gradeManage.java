package working;

// 배열, 제어문, 함수
// 1. 몇명의 성적을 구할 것인가?
// 2. 데이터 입력 -> 번호, 이름, 국어점수, 영어점수, 수학점수 (3과목), 
// 3. 화면 출력 >> 번호 	홍길동	총점		평균	
// 4. 함수는 "총점구하기", "평균구하기", "출력하기", 

import java.util.Scanner;

public class gradeManage {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("몇명의 성적을 뽑을까요?>> ");
		int member = scanner.nextInt();
		
		int[] nums = new int[member];
		String[] names = new String[member];
		int[] kors = new int[member];
		int[] engs = new int[member];
		int[] mats = new int[member];
		int[] sums = new int[member];
		double[] avgs = new double[member];
		
		for (int i = 0; i < member; i++) {
			
			System.out.print("번호를 입력하세요>>");
			nums[i] = scanner.nextInt();
						
			System.out.print("이름을 입력하세요>>");
			names[i] = scanner.next();
			
			System.out.print("국어점수를 입력하세요>>");
			kors[i] = scanner.nextInt();
		
			System.out.print("영어점수를 입력하세요>>");
			engs[i] = scanner.nextInt();
						
			System.out.print("수학점수를 입력하세요>>");
			mats[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < member; i++) {
			sums[i] = totalCal(kors[i], engs[i], mats[i]);
			avgs[i] = avgCal(sums[i]);
		}
		
		printCal(member, nums, names, kors, engs, mats, sums, avgs);

		scanner.close();
	}
	
	static int totalCal(int k, int e, int m) {	
		return k+e+m;
	}
	
	static double avgCal(int s) {
		return s/3;
	}
	
	static void printCal(int m, int[] n, String[] name, int[] kor, int[] eng, int[] mat, int[] sum, double[] avg) {
		System.out.println("\n번호\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=====================================================");		
		for (int i = 0; i < m; i++) {
			System.out.println(n[i]+"\t"+name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+sum[i]+"\t"+avg[i]);
		}
	}
}

