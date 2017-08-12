
import static org.junit.Assert.*;
import org.junit.*;
import customer.*;
import java.math.BigDecimal;
import transaction.*;


public class TransactionTest {

  Transaction transaction;
  BigDecimal startFunds;
  BigDecimal salePrice;
  BigDecimal refundPrice;
  BigDecimal fundsAfterSale;
  BigDecimal fundsAfterRefund;
  BigDecimal endFunds;
  BigDecimal expected;

  
    @Before 
      public void before() {

      startFunds = new BigDecimal("100.00");
      salePrice = new BigDecimal("5.00");
      refundPrice = new BigDecimal("5.00");
      fundsAfterSale = new BigDecimal("105.00");
      fundsAfterRefund = new BigDecimal("100.00");
      endFunds = new BigDecimal("100.00");
      transaction = new Transaction(startFunds, "Sale", salePrice, refundPrice, "50%", 
        fundsAfterSale, fundsAfterRefund, "Credit Card", endFunds);

      
   }


    @Test
      public void hasStartFunds() {
         expected = new BigDecimal("100.00"); 
         assertEquals(expected, transaction.getStartFunds());
    }


    @Test
      public void hasTransactionType() {
      assertEquals("Sale", transaction.getTransactionType());
    }

    @Test
      public void hasSalePrice() {
      expected = new BigDecimal("5.00"); 
      assertEquals(expected, transaction.getSalePrice());
    }

    @Test
      public void hasRefundPrice() {
      expected = new BigDecimal("5.00"); 
      assertEquals(expected, transaction.getRefundPrice());
    }

     
    @Test
      public void hasDiscountApplied() { 
      assertEquals("50%", transaction.getDiscountApplied());
    }




    @Test
       public void hasFundsAfterSale(){
         expected = new BigDecimal("105.00");
         assertEquals(expected, transaction.getFundsAfterSale());
    }

    @Test
        public void hasFundsAfterRefund(){
        expected = new BigDecimal("100.00");
        assertEquals(expected, transaction.getFundsAfterRefund());
    }

     @Test
      public void hasPaymentMethod() {
      assertEquals("Credit Card", transaction.getPaymentMethod());
    }



    @Test
         public void hasEndFunds(){
         expected = new BigDecimal("100.00");
         assertEquals(expected, transaction.getEndFunds());
    
    }




} 