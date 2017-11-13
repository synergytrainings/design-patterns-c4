import com.example.factory.BusFactory;
import com.example.factory.CarFactory;
import com.example.factory.TransportFactory;
import com.example.transport.Transport;


public class Client {

	public static void main(String[] args) {

		TransportFactory factory = new BusFactory();
		Transport transport = factory.create();
		System.out.println(transport.drive());

		factory = new CarFactory();
		transport = factory.create();
		System.out.println(transport.drive());
	}

}
