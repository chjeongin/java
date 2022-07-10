
public class Main {
	public boolean main(String s) {

		
		if (s.length() == 5 || s.length() == 8) {
			try {
				int a = Integer.parseInt(s);
				return true;
			} catch (Exception e) {
				return false;

			}
		}else {
			return false;
		}

	}

}
