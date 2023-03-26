package chapter05;

import java.util.Scanner;

public class StudentScore {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("몇명의 성적을 뽑을까요?>> ");
		int member = scanner.nextInt();
		
		String[] names = new String[member];
		int[] kors = new int[member];
		int[] engs = new int[member];
		int[] mats = new int[member];
		int[] sums = new int[member];
		double[] avgs = new double[member];
		
		for (int i = 0; i < member; i++) {
			System.out.println("<"+(i+1)+"번>");
			
			System.out.println("이름을 입력하세요>>");
			names[i] = scanner.next();
			
			System.out.println("국어점수를 입력하세요>>");
			kors[i] = scanner.nextInt();
		
			System.out.println("영어점수를 입력하세요>>");
			engs[i] = scanner.nextInt();
						
			System.out.println("수학점수를 입력하세요>>");
			mats[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < member; i++) {
			sums[i] = totalCal(kors[i], engs[i], mats[i]);
			avgs[i] = avgCal(sums[i]);
		}
		
		printCal(member, names, sums, avgs);

		scanner.close();
	}
	
	static int totalCal(int k, int e, int m) {	
		return k+e+m;
	}
	
	static double avgCal(int s) {
		return s/3;
	}
	
	static void printCal(int m, String[] name, int[] sum, double[] avg) {
		System.out.println("\n번호\t이름\t총점\t평균");
		System.out.println("=============================");		
		for (int i = 0; i < m; i++) {
			System.out.println((i+1)+"\t"+name[i]+"\t"+sum[i]+"\t"+avg[i]);
		}
	}
}
