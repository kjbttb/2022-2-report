/* [�ּ� 1 : ���� ����]

  ��ü���� ���α׷��� �򰡰��� (���� 25��)
  �а� :
  �й� :
  �̸� :

  ���� ���� :

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

		int computer = (int) (Math.random() * 3);            // random()�� 0.0 ~ 1.0 �̸��� double �� �� ��ȯ

		if( user == computer )
			System.out.println("�ΰ�: " + pv.print(user) + " ��ǻ��: " + pv.print(computer) + "    =>   �ΰ��� ��ǻ�Ͱ� �����");
		else if (user == (computer + 1) % 3)                  // 0�� 1���� ���� 1�� 2����, 2�� 0���� ����.
			System.out.println("�ΰ�: " + pv.print(user) + " ��ǻ��: " + pv.print(computer) + "    =>   �ΰ� �¸�");
		else
			System.out.println("�ΰ�: " + pv.print(user) + " ��ǻ��: " + pv.print(computer) + "    =>   ��ǻ�� �¸�");

		sc.close();
	}

}