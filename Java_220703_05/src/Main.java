// ArrayList 개요
// - ArrayList를 사용해서 복수개의 데이터를 담을 때 배열과 달리 미리 데이터의 개수를 정하지 않아도 됩니다.
// - ArrayList는 자연스럽게 크기가 늘어나는 배열이라고 생각해주세요.
// 문제 : 배열의 단점을 보완한 ArrayList 라는 클래스를 만들어주세요. 오류만 안나게 해주세요.

class Main {
	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		int value = ar.get(0);
		System.out.println(value);
		// 출력 : 100
		
		value = ar.get(1);
		System.out.println(value);
		// 출력 : 200
		
		value = ar.get(2);
		System.out.println(value);
		// 출력 : 300
		
		
	}
}


class ArrayList{
	int lastIndex;l
	int[] datas;
	ArrayList(){
		datas = new int[3];
		lastIndex = -1;
	}
	void add(int date) {
		lastIndex++;
		datas[lastIndex] //??;
	}
	void get() {
		
	}
}