package day05_0621;
// 7. 컴퓨터와 진행하는 가위바위보 게임을 작성하시오.
import java.util.Scanner;	// 스캐너 클래스 가져오기
import java.util.Random;	// 랜덤 클래스 가져오기

public class Test_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	// 스캐너 객체 생성 (변수에 입력받기 위한 기능)
		Random rnd_num = new Random();			// 랜덤 객체 생성 (주어진 범위내 수를 무작위로 뽑는 기능)
		
		// 승패 메기기
		int playerWin = 0;	// 플레이어가 이길 경우 쌓이는 승수
		int comWin = 0;		// 컴퓨터가 이길 경우 쌓이는 패수
		
		// 가위바위보 게임 구현을 위한 반복문
		for (;;) {
			// 플레이어의 선택
			System.out.println("가위(0), 바위(1), 보(2) 입력 : ");	// 플레이어의 해당 숫자 입력
			int user = scan.nextInt(3);	// 가위(0), 바위(1), 보(2) 중 입력한 수를 저장하여 출력
			String userInput;	// 가위, 바위, 보를 출력하기 위한 문자열 변수 (플레이어가 입력한 수)
			
			// 컴퓨터의 선택
			int com = rnd_num.nextInt(3);	// 컴퓨터의 무작위 숫자 입력, 인덱스 범위 = 3 (0부터 2까지 선택)
			String comInput;	// 가위, 바위, 보를 출력하기 위한 문자열 변수 (컴퓨터가 무작위로 입력한 수)
			
			
			// 가위, 바위, 보 (플레이어 vs 컴퓨터의 승부를 구현하는 조건문)
			if (user == 0 && com == 1) {	// 플레이어 : 가위 <-> 컴퓨터 : 바위
				userInput = "가위";
				comInput = "바위";
				System.out.println("Player : "+userInput);
				System.out.println("컴퓨터 : "+comInput);
				System.out.println("컴퓨터 Win");
				comWin++;	// 플레이어의 패수
				System.out.println("Player ==> "+playerWin+"승 "+comWin+"패");	// 플레이어의 승패 현황을 출력
			} else if (user == 1 && com == 0) {		// 플레이어 : 바위 <-> 컴퓨터 : 가위
				userInput = "바위";
				comInput = "가위";
				System.out.println("Player : "+userInput);
				System.out.println("컴퓨터 : "+comInput);
				System.out.println("Player Win");
				playerWin++;	// 플레이어의 승수
				System.out.println("Player ==> "+playerWin+"승 "+comWin+"패");
			} else if (user == 1 && com == 2) {		// 플레이어 : 바위 <-> 컴퓨터 : 보
				userInput = "바위";
				comInput = "보";
				System.out.println("Player : "+userInput);
				System.out.println("컴퓨터 : "+comInput);
				System.out.println("컴퓨터 Win");
				comWin++;
				System.out.println("Player ==> "+playerWin+"승 "+comWin+"패");
			} else if (user == 2 && com == 1) {		// 플레이어 : 보 <-> 컴퓨터 : 바위
				userInput = "보";
				comInput = "바위";
				System.out.println("Player : "+userInput);
				System.out.println("컴퓨터 : "+comInput);
				System.out.println("Player Win");
				playerWin++;
				System.out.println("Player ==> "+playerWin+"승 "+comWin+"패");
			} else if (user == 2 && com == 0) {		// 플레이어 : 보 <-> 컴퓨터 : 가위
				userInput = "보";
				comInput = "가위";
				System.out.println("Player : "+userInput);
				System.out.println("컴퓨터 : "+comInput);
				System.out.println("컴퓨터 Win");
				comWin++;
				System.out.println("Player ==> "+playerWin+"승 "+comWin+"패");
			} else if (user == 0 && com == 2) {		// 플레이어 : 가위 <-> 컴퓨터 : 보
				userInput = "가위";
				comInput = "보";
				System.out.println("Player : "+userInput);
				System.out.println("컴퓨터 : "+comInput);
				System.out.println("Player Win");
				playerWin++;
				System.out.println("Player ==> "+playerWin+"승 "+comWin+"패");
			}
			
			// 가위, 바위, 보 (무승부 조건문)
			if (user == 0 && com == 0) {
				userInput = "가위";
				comInput = "가위";
				System.out.println("Player : "+userInput);
				System.out.println("Player : "+comInput);
				System.out.println("비겼습니다.");
			} else if (user == 1 && com == 1) {
				userInput = "바위";
				comInput = "바위";
				System.out.println("Player : "+userInput);
				System.out.println("Player : "+comInput);
				System.out.println("비겼습니다.");
			} else if (user == 2 && com == 2) {
				userInput = "보";
				comInput = "보";
				System.out.println("Player : "+userInput);
				System.out.println("Player : "+comInput);
				System.out.println("비겼습니다.");
			}
			
			// 재대결 여부 입력
			if (user == com || user > com || user < com) {
				System.out.println("재대결(1), 종료(2) : ");
				int reGame = scan.nextInt();
				if (reGame == 1) {
					continue;
				} else if (reGame == 2) {
					System.out.println("종료되었습니다.");
					break;
				}
			}
		}
		scan.close();
	}
}
