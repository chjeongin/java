import java.util.ArrayList;

class Main {
	public static void main(String[] args) {
		exam2();

		

	}
	static void exam2() {
		ArrayList<Article> articles = new ArrayList<Article>(); //또는 new ArrayList<>()
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());
		for(int i = 0; i < articles.size();i++) {
			Article article = articles.get(i);
			
			System.out.println(article.id);
		}
	}
	
	static void exam3() {
		
	ArrayList<Article> articles = new ArrayList();
	articles.add(new, )
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