package week1.day2;

//3.create another class EdgeBrowser and create an object for Browser in the main method and call both methods of Browser class
// of Browser class in Edge Browser and execute

public class EdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  Browser ie = new Browser();
	  String launchBrowser = ie.launchBrowser("ie");
	  ie.loadurl();
	  System.out.println(launchBrowser);
	  
			  
	}

}
