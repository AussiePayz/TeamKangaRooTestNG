package utilities;

import pages.brandsPage;
import pages.checkoutPage;
import pages.loginPage;
import pages.navigationBarPage;
import pages.registrationPage;
import pages.searchBarPage;
import pages.shoppingCartPage;
import pages.wishListPage;

public class pageInitializer extends driver{
	
	public static checkoutPage cp;
	public static searchBarPage sbp;
	public static wishListPage wp;
	public static brandsPage bp;
	public static loginPage lp;
	public static registrationPage rp;
	public static shoppingCartPage scp;
	public static navigationBarPage nbp;
	
	
	public static void initialize() {
		
		cp = new checkoutPage();
		sbp = new searchBarPage();
		wp = new wishListPage();
		bp = new brandsPage();
		lp = new loginPage();
		rp = new registrationPage();
		scp = new shoppingCartPage();
		nbp = new navigationBarPage();
		
		
		
		
		
	}

}
