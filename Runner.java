import customer.*;
import store.*;
import transaction.*;
import java.math.BigDecimal;
import java.util.*;

public class Runner {

	public static void main(String[] args) {
		Store graceBros = new Store(new BigDecimal("3000.00"));
		HashMap<PaymentMethod, BigDecimal> myWallet = new HashMap<PaymentMethod, BigDecimal>();
      	myWallet.put(PaymentMethod.VISA, new BigDecimal("10000.00"));
      	myWallet.put(PaymentMethod.CHEQUE, new BigDecimal("1000.00"));

		Customer cust1 = new Customer("Alex", myWallet);
		Transaction trans1 = new Transaction(new BigDecimal("10.00"), PaymentMethod.VISA, cust1);

		Customer cust2 = new Customer("Keith", myWallet);
		Transaction trans2 = new Transaction(new BigDecimal("-30.00"), PaymentMethod.CHEQUE, cust2);


		graceBros.getBalance();
		System.out.println("Grace Brothers has a starting balance of: " + graceBros.getBalance());


		graceBros.addTransaction(trans1);
		System.out.println("After sale Grace Brothers has a balance of: " + graceBros.getBalance());

        graceBros.subtractTransaction(trans2);
		System.out.println("After refund Grace Brothers has a balance of: " + graceBros.getBalance());


	}


}