import java.util.Scanner;

public class Maint {
	public static void main(String[] args) {
		System.out.println("== 프로그램 시작 ==");
		Scanner sc = new Scanner(System.in); //ctl+shift + o, System.in ==> 키보드를 입력하는 것. close() 작업이 필요!!
		String command = sc.nextLine();
		command = sc.nextLine();
		System.out.println("입력된 명령어 : " + command);
		sc.close();
		System.out.println("== 프로그램 끝 ==");
	}
}