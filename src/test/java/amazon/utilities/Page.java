package amazon.utilities;

public class Page {

	public static void sleep(long millis) {
		 
		try {
			Thread.sleep(millis);
		 
		} catch (InterruptedException e) {
			e.printStackTrace();
		 
	}
		 
	}
}
