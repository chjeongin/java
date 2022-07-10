import java.util.Scanner;

public class Maint {
	public static void main(String[] args) {
		System.out.println("== 프로그램 시작 ==");
		Scanner sc = new Scanner(System.in); //ctrl+shift + o, System.in ==> 키보드를 입력하는 것. close() 작업이 필요!!+
		//String command = sc.nextLine();
		//command = sc.nextLine();
		int lastNum = 0;
		while(true) {
			System.out.printf("명령어를 입력하세요 >> ");
			String command = sc.nextLine(); //nextLine() --> command.equals("단어 단어") 가능, next()-->("단어") 가능
			command = command.trim();
			
			if(command.length()==0) {
				continue;
				
			}
			if(command.equals("exit")) {
				break;
			}else if(command.equals("article list")) {
				System.out.println("게시글이 없습니다.");
			}else if(command.equals("article write")) {
				int id = lastNum +1;
				lastNum = id;
				System.out.printf("제목 : ");
				String title = sc.nextLine();
				System.out.printf("내용 : ");
				String body = sc.nextLine();
				System.out.println("제목 : "+title);
				System.out.println("내용 : "+body);
				
				
				System.out.printf("%d번 게시글이 생성되었습니다.",lastNum);
			}else {
				System.out.printf("%s는 존재하지 않는 명령어입니다.\n", command);
			}
			
		}
//		int num = sc.nextInt();
//		System.out.println("입력된 명령어 : "+num);
		
		sc.close();
		System.out.println("== 프로그램 끝 ==");
	}
}
