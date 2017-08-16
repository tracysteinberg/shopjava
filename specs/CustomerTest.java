import static org.junit.Assert.*;
import org.junit.*;
import customer.*;
import transaction.*;
import store.*;
import java.math.BigDecimal;
import java.util.HashMap;

public class CustomerTest {

  Customer customer1;
  Customer customer2;
  BigDecimal funds;
  BigDecimal expected;
  HashMap  myWallet;

  
   @Before 
     public void before() {
     myWallet = new HashMap<PaymentMethod, BigDecimal>();
     myWallet.put(PaymentMethod.CHEQUE, new BigDecimal("1000.00"));
     myWallet.put(PaymentMethod.VISA, new BigDecimal("10000.00"));
  
     customer1 = new Customer("Alex", myWallet);
     customer2 = new Customer("Keith", myWallet);


    }
      
   @Test
      public void hasName() {
      assertEquals("Alex", customer1.getName());
    }


   @Test
      public void hasFunds() {
      BigDecimal expected = new BigDecimal("1000.00");
      assertEquals(expected, customer1.getFunds().get(PaymentMethod.CHEQUE));
      
    }

    @Test
       public void canDeductFromPaymentMethod() {
       BigDecimal expected = new BigDecimal("950.00");
       BigDecimal spendMoney = new BigDecimal("50.00");
       customer1.spendMoney(spendMoney, PaymentMethod.CHEQUE);
       assertEquals(expected, customer1.getFunds().get(PaymentMethod.CHEQUE));
    }


    @Test
       public void canAddToPaymentMethod() {
       BigDecimal expected = new BigDecimal("10060.00");
       BigDecimal refundMoney = new BigDecimal("60.00");
       customer2.refundMoney(refundMoney, PaymentMethod.VISA);
       assertEquals(expected, customer2.getFunds().get(PaymentMethod.VISA));
    }



} 