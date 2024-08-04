package week1.day2;

//1.Creation of java class named "Browser"

public class Browser {
	
	public String launchBrowser(String browserName)
	     
			 {
		System.out.println("browser launched successfully");
			 return browserName;
			 }
	public void loadurl () {
	System.out.println("application URL loaded successfully");
	}
	
	//2.create an object for Browser class in the main method and call the two methods and run the code
	
 public static void main(String[] args) {
	 Browser chrome = new Browser();
	 
	 String browser = chrome.launchBrowser("safari");
	 chrome.loadurl();
	 System.out.println(browser);
	 
	 
     
	
	 
			 
			  
}
	
			
	

}
