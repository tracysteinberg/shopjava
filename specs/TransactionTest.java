
import static org.junit.Assert.*;
import org.junit.*;
import customer.*;
import java.math.BigDecimal;
import transaction.*;
import customer.*;
import store.*;
import java.util.HashMap;


public class TransactionTest {

  Customer customer1;
  Customer customer2;
  Transaction transaction1;
  Transaction transaction2;
  Store graceBros;
  HashMap<PaymentMethod, BigDecimal>  myWallet;

  
    @Before 
    public void before() {

  
      myWallet = new HashMap<PaymentMethod, BigDecimal>();
      myWallet.put(PaymentMethod.VISA, new BigDecimal("10000"));
      myWallet.put(PaymentMethod.CHEQUE, new BigDecimal("1000"));


      customer1 = new Customer("Alex", myWallet);
      customer2 = new Customer("Keith", myWallet);


      graceBros = new Store(new BigDecimal("200.00"));
      transaction1 = new Transaction(new BigDecimal("50.00"),  PaymentMethod.CHEQUE, customer1);
      transaction2 = new Transaction(new BigDecimal("50.00"),  PaymentMethod.VISA, customer2);
   }


    @Test
    public void hasStartFunds() {
        graceBros.addTransaction(transaction1);
        graceBros.subtractTransaction(transaction2);
        assertEquals(2, graceBros.getTransactions().size());
    }
  
   






} 