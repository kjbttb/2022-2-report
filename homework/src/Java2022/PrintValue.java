package Java2022;

public class PrintValue implements PrintRPS {      // // �ּ� 3 : �������̽� ���� Ŭ���� ����

	public RPS print(int value) {
		RPS rps = null;     // �ּ� 6 : ����Ÿ�� ��üȭ
			
		switch(value) {
			case 0 :
				rps = RPS.SCISSOR; 
				break;
			case 1 :
				rps = RPS.ROCK;
				break;
			case 2 :
				rps = RPS.PAPER;
				break;
		}	
		return rps;
	}
}
