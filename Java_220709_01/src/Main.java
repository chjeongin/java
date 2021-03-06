
// 문제 : 배열의 단점을 보완한 ArrayList 라는 클래스를 만들어주세요. 아래와 같이 출력되도록 해주세요. add 함수에서 배열의 크기가 자동으로 늘어나도록 해주세요.

class Main {
	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(400);
		
		int value = ar.get(0);
		System.out.println(value);
		// 출력 : 100
		
		value = ar.get(1);
		System.out.println(value);
		// 출력 : 200 
		
		value = ar.get(2);
		System.out.println(value);
		// 출력 : 300
		
		value = ar.get(3);
		System.out.println(value);
		// 출력 : 400
	}
}

class ArrayList {
	int[] datas;
	int lastIndex = -1;
	
	ArrayList() {
		datas = new int[3]; // 이 부분은 수정할 수 없습니다.
	}
	
	void add(int data) {
//		System.out.println("lastIndex1 : " + lastIndex);
		lastIndex++;
//		System.out.println("lastIndex2 : " + lastIndex);
		if(lastIndex + 1 >= datas.length) {
//			System.out.println("lastIndex3 : " + lastIndex);
//			System.out.println("datas.length: " +  datas.length);
			int[] newArr = new int[datas.length*2];
			for(int i = 1; i < datas.length*2; i++) {
				newArr[i] = datas[i];
			}
			datas = newArr; //[100,200,300,0,0,0]

		}
//		System.out.println("lastIndex4 : " + lastIndex);
		datas[lastIndex] = data;
	}
	
	int get(int index) {
		return datas[index];
	}
}

