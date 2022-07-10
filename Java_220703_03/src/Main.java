class Main {
	public static void main(String[] args) {
		Article[] articles = new Article[100];
		int articleSize = 0;
		articles[0] =  new Article();
		articleSize++;
		articles[1] =  new Article();
		articleSize++;
		articles[2] =  new Article();
		articleSize++;
		articles[3] =  new Article();
		articleSize++;
//		System.out.println(articles[0].id);
//		System.out.println(articles[1].id);
//		System.out.println(articles[2].id);
//		System.out.println(articles[3].id);
		for(int i = 0; i <articleSize; i++) {
			System.out.println(articles[i].id);
		}

	}

}
class Article{
	static int lastId; //static int lastId=1;도 가능
	int id;
	String regDate;
	static {
		lastId = 0;
	}
	Article(){
		
		this(lastId+1, "2022-07-03 12:37:11");
		lastId++;
	}
	Article(int id, String regDate){
		this.id = id;
		this.regDate = regDate;
	}
}