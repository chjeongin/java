
// 문제 : 아래 코드가 작동하도록 해주세요.

class Main {
	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add(100, 0);
		ar.add(200, 1);
		ar.add(300, 2);
		ar.add(400, 3);
		ar.add(500, 4);
		ar.add(600, 2);
		ar.add(700, 0);

		for (int i = 0; i < ar.size(); i++) {
			int value = ar.get(i);

			System.out.println(i + " : " + value);
		}

		// 출력
		// 0 : 700
		// 1 : 100
		// 2 : 200
		// 3 : 600
		// 4 : 300
		// 5 : 400
		// 6 : 500
	}
}

class ArrayList {
	int[] datas;
	int lastIndex = -1;

	ArrayList() {
		datas = new int[3]; // 이 부분은 수정할 수 없습니다.
	}
	void extendDatasSize() {
		if (lastIndex + 1 >= datas.length) {

			int[] newArr = new int[datas.length * 2];
			for (int i = 0; i < datas.length; i++) {
				newArr[i] = datas[i];
			}

			datas = newArr;
		}
	}

	// add 1
	void add(int data) {
		//반복
		extendDatasSize();
		//반복

		lastIndex++;

		datas[lastIndex] = data;
	}

	// add 2
	void add(int data, int index) {
		extendDatasSize();

		lastIndex++;

		// 수정된 부분
		for (int i = lastIndex - 1; i > lastIndex - 1; i--) {
			datas[i+1] = datas[i];
		}

		datas[index] = data;

	}

	int get(int index) {
		return datas[index];
	}

	int size() {
		return lastIndex + 1;
	}
}