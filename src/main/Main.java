package main;

import calc.Calculator;

public class Main {

	public static void main(String[] args) {

		System.out.println("로컬저장소 사용");
		System.out.println("원격저장소 사용 가능");
		System.out.println("원격저장소 사용 가능2");
				
		System.out.println("팀장 새코드 시작");
		System.out.println("팀장 새코드 끝");
		
		System.out.println("팀원 코드1");
		System.out.println("팀원 코드2");
		System.out.println("팀원 코드3");
		
		Calculator cal = new Calculator();
		
		int addResult = cal.add(10, 34);
		
		System.out.println(addResult);
		
		int minusResult = cal.minus(3000, 400);
		
		System.out.println(minusResult);
		
		System.out.println("집에서 작업 시작");
		
		System.out.println("집에서 작업 끝");
		
	}

}
