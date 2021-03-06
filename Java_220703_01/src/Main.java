// 문제 : 아래가 실행되도록 해주세요.
// 조건 : 배열을 사용할 수 없습니다.

class Main {
	public static void main(String[] args) {
		사람인력관리소 a사람인력관리소 = new 사람인력관리소();
		
		a사람인력관리소.add사람("홍길순", 33);
		// 나이가 33살인 1번째 사람(홍길순)이 추가되었습니다.
		a사람인력관리소.add사람("홍길동", 20);
		// 나이가 20살인 2번째 사람(홍길동)이 추가되었습니다.
		a사람인력관리소.add사람("임꺽정", 30);
		// 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.
		a사람인력관리소.add사람("춘식이", 3);
		
		사람 a사람1 = a사람인력관리소.get사람(1);
		a사람1.자기소개();
		// 저는 1번, 홍길순, 33살 입니다.
		
		사람 a사람2 = a사람인력관리소.get사람(2);
		a사람2.자기소개();
		// 저는 2번, 홍길동, 20살 입니다.
		
		사람 a사람3 = a사람인력관리소.get사람(3);
		a사람3.자기소개();
		// 저는 3번, 임꺽정, 30살 입니다.
		사람 a사람4 = a사람인력관리소.get사람(4);
		a사람4.자기소개();
	}
}

class 사람인력관리소{
	사람[] 사람들;
	
	사람 a사람0;
	사람 a사람1;
	사람 a사람2;
	int 마지막사람번호;
	사람인력관리소(){
		마지막사람번호 = 0;
		사람들 = new 사람[100];
	}

  void add사람(String name, int age){
	  int n = 마지막사람번호+1;
	  사람 a사람 = new 사람();
	  a사람.name = name;
	  a사람.age = age;
	  a사람.n = n;
	  사람들[n-1] = a사람;
			  
	  
	  
	  System.out.printf("나이가 %d살인 %d번째 사람(%s)이 추가되었습니다.\n",age, n, name);
	  마지막사람번호 = n;
	  
    
  }
	사람 get사람(int n){
		return 사람들[n-1];
	
  }
  
  
  
}

class 사람{
	String name;
	int age;
	int n;

	void 자기소개() {
		System.out.printf("저는 %d번, %s, %d살 입니다.\n",n,name,age);
	}
}