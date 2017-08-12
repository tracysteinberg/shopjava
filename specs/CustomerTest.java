
import static org.junit.Assert.*;
import org.junit.*;
import customer.*;
import java.math.BigDecimal;

public class CustomerTest {

  Customer customer;
  BigDecimal funds;
  BigDecimal fundsAfterSale;
  BigDecimal fundsAfterRefund;
  BigDecimal buyPrice;
  BigDecimal refundPrice;
  BigDecimal expected;

  
    @Before 
      public void before() {
      funds = new BigDecimal("20.00");
      fundsAfterSale = new BigDecimal("15.00");
      fundsAfterRefund = new BigDecimal("20.00");
      buyPrice = new BigDecimal("5.00");
      refundPrice = new BigDecimal("5.00");
 
      customer = new Customer("Alex", funds, PaymentMethod.VISA, fundsAfterSale, fundsAfterRefund, buyPrice, refundPrice);
      
   }

    @Test
      public void hasName() {
      assertEquals("Alex", customer.getName());
    }


    @Test
       public void hasFunds() {
       expected = new BigDecimal("20.00"); 
       assertEquals(expected, customer.getFunds());
    }

    @Test
      public void hasPaymentType() {
      assertEquals(PaymentMethod.VISA, customer.getPaymentType());
    }

    @Test
      public void PaymentTypeNotNull() {
      assertNotNull(customer.getPaymentTypeNotNull());
    }


//    Customer Funds go down and up

    @Test
       public void hasFundsAfterSale(){
         expected = new BigDecimal("15.00");
         assertEquals(expected, customer.getFundsAfterSale());
    }

    @Test
        public void hasFundsAfterRefund(){
        expected = new BigDecimal("20.00");
        assertEquals(expected, customer.getFundsAfterRefund());
    }





} 