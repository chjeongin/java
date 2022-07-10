
public class Main {
	public static void main(String[] args) {
		String name = "1ddd45";
		try {
			int x = Integer.parseInt(name);
			System.out.println("정상");
		}catch(Exception e) {
			System.out.println("에러발상");
			e.printStackTrace();
			
		}finally {
			System.out.println("Finally test");
		}

	}
}
