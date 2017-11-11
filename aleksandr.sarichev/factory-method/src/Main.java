import com.example.army.GermanyTanksArmy;
import com.example.army.TanksArmy;
import com.example.army.USATanksArmy;
import com.example.army.USSRTanksArmy;
import com.example.tanksfactory.LeopardTankCreator;
import com.example.tanksfactory.M1AbramsTankCreator;
import com.example.tanksfactory.T34TankCreator;
import com.example.tanksfactory.TankCreator;

public class Main {

	public static void main(String[] args) {
		TankCreator ussrTankCreator = new T34TankCreator();
		TanksArmy ussrTankArmy = new USSRTanksArmy(30, ussrTankCreator);
		ussrTankArmy.attack();
		
		TankCreator usaTankCreator = new M1AbramsTankCreator();
		TanksArmy usaTankArmy = new USATanksArmy(20, usaTankCreator);
		usaTankArmy.attack();
		
		TankCreator germanyTankCreator = new LeopardTankCreator();
		TanksArmy germanyTankArmy = new GermanyTanksArmy(10, germanyTankCreator);
		germanyTankArmy.attack();

	}

}
