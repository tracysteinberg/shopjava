
import static org.junit.Assert.*;
import org.junit.*;
import store.*;
import java.math.BigDecimal;
import customer.*;
import transaction.*;
import java.util.HashMap;

public class StoreTest {

    Store graceBros;
    Transaction transaction1;
    Transaction transaction2;
    Customer customer1;
    Customer customer2;
    HashMap<PaymentMethod, BigDecimal>  myWallet;
  
    @Before 
    public void before() { 

      myWallet = new HashMap<PaymentMethod, BigDecimal>();
      myWallet.put(PaymentMethod.VISA, new BigDecimal("2000"));
      myWallet.put(PaymentMethod.CHEQUE, new BigDecimal("1000"));

      graceBros = new Store(new BigDecimal("200.00"));
      customer1 = new Customer("Alex", myWallet);
      customer2 = new Customer("Keith", myWallet);

      transaction1 = new Transaction(new BigDecimal("50.00"), PaymentMethod.CHEQUE, customer1);
      transaction2 = new Transaction(new BigDecimal("-50.00"), PaymentMethod.VISA, customer2);
    }


    @Test
    public void storeCanMakeSale() {
         graceBros.addTransaction(transaction1);
         BigDecimal expected = new BigDecimal("250.00");
         assertEquals(expected, graceBros.getBalance());

      }


    @Test
    public void storeCanReturn() {
       graceBros.addTransaction(transaction1);
       graceBros.subtractTransaction(transaction2);
       BigDecimal expected = new BigDecimal("200.00");
       assertEquals(expected, graceBros.getBalance());
    }



} 