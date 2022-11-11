package Java2022;

public class PrintValue implements PrintRPS {      // // 주석 3 : 인터페이스 구현 클래스 선언

	public RPS print(int value) {
		RPS rps = null;     // 주석 6 : 열거타입 객체화
			
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
