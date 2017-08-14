import static org.junit.Assert.*;
import org.junit.*;
import customer.*;
import transaction.*;
import store.*;
import java.math.BigDecimal;

public class CustomerTest {

  Customer customer1;
  Customer customer2;
  BigDecimal funds;
  BigDecimal expected;

  
    @Before 
      public void before() {
      funds = new BigDecimal("20.00");
      
      customer1 = new Customer("Alex", new BigDecimal("20.00"), PaymentMethod.VISA);
      customer2 = new Customer("Keith", new BigDecimal("50"), PaymentMethod.CHEQUE);
      }
      
    @Test
      public void hasName() {
      assertEquals("Alex", customer1.getName());
    }


    @Test
       public void hasFunds() {
       expected = new BigDecimal("20.00"); 
       assertEquals(expected, customer1.getFunds());
    }

    @Test
      public void hasPaymentType() {
      assertEquals(PaymentMethod.VISA, customer1.getPaymentType());
    }

    




} 