
// 문제 : 아래 코드가 작동하도록 해주세요.

class Main {
	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(400);
		
		ar.remove(2);
		int value = ar.get(2);
		System.out.println(value);
		// 출력 : 400
		
		ar.remove(0);
		value = ar.get(0);
		System.out.println(value);
		// 출력 : 200
		
		ar.add(78);
		value = ar.get(2);
		System.out.println(value);
		// 출력 : 78
	}
}

class ArrayList {
	int[] datas;
	int lastIndex = -1;
	
	ArrayList() {
		datas = new int[3]; // 이 부분은 수정할 수 없습니다.
	}
	
	void add(int data) {
//		System.out.println(datas.length);
		if ( lastIndex + 1 >= datas.length ) {
			
			int[] newArr = new int[datas.length * 2];
			
			for ( int i = 0; i < datas.length; i++ ) {
				newArr[i] = datas[i];
			}
			
			datas = newArr;
		}
		
		lastIndex++;
		//1 -> 2
		datas[lastIndex] = data;
		//datas -> 200, 400, 78
	}
	
	int get(int index) {
		return datas[index];
	}
	
	int size() {
		return lastIndex + 1;
	}
	
	void remove(int index) {
		for(int i = index; i < lastIndex; i++) {
			datas[i] = datas[i+1];
		}
		//??????
		lastIndex--;
//		System.out.println(lastIndex);
	}
}