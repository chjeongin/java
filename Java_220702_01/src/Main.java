
 class Main {

	public static void main(String[] args) {
		사람인력관리소 a사람인력관리소 = new 사람인력관리소();
		
		a사람인력관리소. add사람("홍길순", 33);
		// 나이가 33살인 1번째 사람(홍길순)이 추가되었습니다.
		a사람인력관리소.add사람("홍길동", 20);
		// 나이가 20살인 2번째 사람(홍길동)이 추가되었습니다.
		a사람인력관리소.add사람("임꺽정", 30);
		// 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.
		
		사람 a사람1 = a사람인력관리소.get사람(1);
		a사람1.자기소개();
		// 저는 1번, 홍길순, 33살 입니다.
		
		사람 a사람2 = a사람인력관리소.get사람(2);
		a사람2.자기소개();
		// 저는 2번, 홍길동, 20살 입니다.
		
		사람 a사람3 = a사람인력관리소.get사람(3);
		a사람3.자기소개();
		// 저는 3번, 임꺽정, 30살 입니다.
	}
}

class 사람인력관리소{
	사람 a처음사람;
	사람 a두번째사람;
	사람 a세번째사람;
	int 마지막사람_번호;

	void add사람(String name, int age){
		사람 a사람 = new 사람();
		a사람.num = this.마지막사람_번호+1;
		a사람.name = name;
		a사람.age = age;
		System.out.println("나이가 "+a사람.age + "살인 "+a사람.num+"번째 사람("+a사람.name+")이 추가되었습니다.");
		
		if(a사람.num == 1) {
			a처음사람 = a사람;
		}else if(a사람.num == 2) {
			a두번째사람 = a사람;
		}else if(a사람.num == 3) {
			a세번째사람 = a사람;
		}
		this.마지막사람_번호 = a사람.num;


    
  }
	사람 get사람(int num) {
		사람 a사람 = null;
		if(num == 1) {
			a사람 = a처음사람;
		}else if( num == 2) {
			a사람 = a두번째사람;
		}else if(num == 3) {
			a사람= a세번째사람;
		}
		return a사람;
	}
}
  
class 사람{
	int num;
	String name;
	int age;


	void 자기소개() {
		System.out.printf("저는 %d번, %s, %d살 입니다.\n", num, name, age);
	}
}
  
  

