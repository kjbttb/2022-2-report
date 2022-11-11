/* [주석 1 : 과제 설명]

  객체지향 프로그래밍 평가과제 (배점 25점)
  학과 :
  학번 :
  이름 :

  과제 주제 :

*/

package Java2022;

import java.util.Scanner;

public class Homework2nd {

	final int SCISSOR = 0;
	final int ROCK = 1;
	final int PAPER = 2;

	public static void main(String[] args) {
		
		PrintValue pv = new PrintValue();       
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("SCISSOR(0), ROCK(1), PAPER(2): ");
		int user = sc.nextInt();

		int computer = (int) (Math.random() * 3);            // random()는 0.0 ~ 1.0 미만의 double 형 값 반환

		if( user == computer )
			System.out.println("인간: " + pv.print(user) + " 컴퓨터: " + pv.print(computer) + "    =>   인간과 컴퓨터가 비겼음");
		else if (user == (computer + 1) % 3)                  // 0은 1한테 지고 1은 2한테, 2는 0한테 진다.
			System.out.println("인간: " + pv.print(user) + " 컴퓨터: " + pv.print(computer) + "    =>   인간 승리");
		else
			System.out.println("인간: " + pv.print(user) + " 컴퓨터: " + pv.print(computer) + "    =>   컴퓨터 승리");

		sc.close();
	}

}