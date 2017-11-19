import com.example.army.Army;
import com.example.army.GermanyArmy;
import com.example.army.USAArmy;
import com.example.army.USSRArmy;



public class Main {

	public static void main(String[] args) {
		Army ussrArmy = new USSRArmy(30,10,20);
		ussrArmy.attack();
		
		
		Army germanyArmy = new GermanyArmy(30,10,20);
		germanyArmy.attack();
		
	
		Army usaArmy = new USAArmy(30,10,20);
		usaArmy.attack();

	}

}
