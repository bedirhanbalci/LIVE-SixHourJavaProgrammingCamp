import java.util.ArrayList;
import java.util.Collections;
class Main
{
	//SOLID
	public static void main(String[] args)
	{
	  /*CreditManager creditManager = new CreditManager();
		creditManager.add();
		creditManager.calculate();
		
		MortgageManager mortgageManager = new MortgageManager();
		mortgageManager.add();
		
		CreditManager[] credits = new CreditManager[3];
		
		
		credits[0] = new MortgageManager();
		credits[1] = new VehicleManager();
		credits[2] = new OfficerManager();*/
		
		//ArrayList<String> sehirler = new ArrayList<String>(); deneme için
		
		
		ArrayList<CreditManager> credits = new ArrayList<CreditManager>();
		credits.add(new MortgageManager());
		credits.add(new VehicleManager());
		credits.add(new OfficerManager());

		
		//for(int i = 0; i < credits.length; i++)
		
		for(CreditManager credit : credits)
		{
			credit.calculate();
		}
	}
}