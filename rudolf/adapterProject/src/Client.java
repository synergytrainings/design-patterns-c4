import com.example.domain.Account;
import com.example.adapter.AccountAdapter;
import com.example.adaptee.OffshoreAccount;
import com.example.domain.StandardAccount;

public class Client {

	public static void main(String[] args) {

		Account standardAccount = new StandardAccount(2000);
		Account adapter = new AccountAdapter(new OffshoreAccount(5000));
		printBalance(standardAccount);
		printBalance(adapter);
	}

	public static void printBalance(Account account) {
		System.out.println("Balance is " + account.getBalance());
	}
}
