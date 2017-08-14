
import static org.junit.Assert.*;
import org.junit.*;
import store.*;
import java.math.BigDecimal;
import customer.*;
import transaction.*;

public class StoreTest {

    Store graceBros;
    Transaction transaction1;
    Transaction transaction2;
    Customer customer1;
    Customer customer2;
  
    @Before 
    public void before() { 
      graceBros = new Store(new BigDecimal("200.00"));
      customer1 = new Customer("Alex", new BigDecimal("20.00"), PaymentMethod.VISA);
      transaction1 = new Transaction(new BigDecimal("10.00"), customer1, PaymentMethod.VISA);
      customer2 = new Customer("Keith", new BigDecimal("50.00"), PaymentMethod.CHEQUE);
      transaction2 = new Transaction(new BigDecimal("-30.00"), customer2, PaymentMethod.CHEQUE);
      
      
    }

    @Test
    public void storeCanMakeSale() {
       graceBros.addTransaction(transaction1);
       BigDecimal expected = new BigDecimal("210.00");
       assertEquals(expected, graceBros.getBalance());
    }

    @Test
    public void storeCanReturn() {
       graceBros.addTransaction(transaction1);
       graceBros.subtractTransaction(transaction2);
       BigDecimal expected = new BigDecimal("180.00");
       assertEquals(expected, graceBros.getBalance());
    }

} 