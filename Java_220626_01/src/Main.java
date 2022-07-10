
public class Main {
	public static void main(String[] args) {

		칼 a무기1 = new 칼();
    	활 a무기2 = new 활();
    	총 a무기3 = new 총();
//    	모든 무기작동
    	a무기1.작동();
    	a무기2.작동();
    	a무기3.작동();
    	무기[] 무기들 = new 무기[3];
    	무기들[0] = a무기1; // 칼 리모콘을 무기 리모콘으로 변경하는게 안전
    	무기들[1] = a무기2;
    	무기들[2] = a무기3;
    	for (int i = 0; i<무기들.length; i++) {
    		무기 a무기 = 무기들[i];
    		a무기.작동();
    	
    	}
    }
}
// new 칼().수리();
interface 무기{  // new 무기();
	void 작동();
//	void 수리() {
//		System.out.println("수리하다.");
//	}
	
}
interface 주방도구{
	void 작동();
}
//인터페이스는 추상클래스와 달리 100% 추상클래스임.
//왜냐하면, 인터페이스 안에는 추상메서드만 들어올 수 있기 때문임. 따라서 abstract 키워드 생략도 가능.
// 다중구현이라는 말은 다중상속으로 이해될 수 있음.
class 칼 implements 무기, 주방도구{
	public void 작동() {
		System.out.println("칼작동");
	}
}
class 활 implements 무기{
	public void 작동() {
		System.out.println("활작동");
	}
}
class 총 implements 무기{
	public void 작동() {
		System.out.println("총작동");
	}
}

