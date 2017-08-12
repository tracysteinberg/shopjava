
import static org.junit.Assert.*;
import org.junit.*;
import customer.*;
import java.math.BigDecimal;




public class CustomerTest {

  Customer customer;
  BigDecimal initialFunds;
  BigDecimal buyPrice;
  BigDecimal refundPrice;
  BigDecimal fundsAfterSale;
  BigDecimal fundsAfterRefund;
  BigDecimal finalFunds;
  BigDecimal expected;

  
    @Before 
      public void before() {

      initialFunds = new BigDecimal("20.00");
      buyPrice = new BigDecimal("5.00");
      refundPrice = new BigDecimal("5.00");
      fundsAfterSale = new BigDecimal("15.00");
      fundsAfterRefund = new BigDecimal("20.00");
      finalFunds = new BigDecimal("20.00");
      customer = new Customer("Alex", initialFunds, buyPrice, refundPrice, fundsAfterSale, fundsAfterRefund, finalFunds);
      
   }

    @Test
      public void hasName() {
      assertEquals("Alex", customer.getName());
    }


    @Test
      public void hasInitialFunds() {
         expected = new BigDecimal("20.00"); 
         assertEquals(expected, customer.getInitialFunds());
    }
  
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


    @Test
         public void hasFinalFunds(){
         expected = new BigDecimal("20.00");
         assertEquals(expected, customer.getFinalFunds());
    
    }




} 