
public class Main {
	public static void main(String[] args) {
		Car car = new Car();
		// Person클래스에서 String과 int를 매개변수로 받는 생성자를 호출합니다.
		car.run();
		// int형 매개변수를 받는 run을 호출합니다.
		car.run(100);
	}

}

class Car {
    void run() {
        System.out.println("차가 달립니다.");        
    }
    // 정수 하나를 매개변수로 받는 메소드, run을 추가해 보세요.
    void run(int v) {
    	System.out.println("차가 시속 "+v+"로 달립니다."); 
    }
    
}
