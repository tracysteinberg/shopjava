
import static org.junit.Assert.*;
import org.junit.*;
import customer.*;
import java.math.BigDecimal;
import transaction.*;
import customer.*;
import store.*;


public class TransactionTest {

  Transaction transaction1;
  Transaction transaction2;
  Customer customer1;
  Customer customer2;
  Store graceBros;
  // BigDecimal startFunds;
  // BigDecimal salePrice;
  // BigDecimal refundPrice;
  // BigDecimal fundsAfterSale;
  // BigDecimal fundsAfterRefund;
  // BigDecimal endFunds;
  // BigDecimal expected;

  
    @Before 
    public void before() {

      // startFunds = new BigDecimal("100.00");
      // salePrice = new BigDecimal("5.00");
      // refundPrice = new BigDecimal("5.00");
      // fundsAfterSale = new BigDecimal("105.00");
      // fundsAfterRefund = new BigDecimal("100.00");
      // endFunds = new BigDecimal("100.00");
      // transaction = new Transaction(startFunds, "Sale", salePrice, refundPrice, "50%", 
      // fundsAfterSale, fundsAfterRefund, PaymentMethod.VISA, endFunds);
 
      graceBros = new Store(new BigDecimal("200.00"));
      customer1 = new Customer("Alex", new BigDecimal("20.00"), PaymentMethod.VISA);
      transaction1 = new Transaction(new BigDecimal("10.00"), customer1, PaymentMethod.VISA);
      customer2 = new Customer("Keith", new BigDecimal("50.00"), PaymentMethod.CHEQUE);
      transaction2 = new Transaction(new BigDecimal("30.00"), customer2, PaymentMethod.CHEQUE);
   }


    @Test
    public void hasStartFunds() {
        graceBros.addTransaction(transaction1);
        graceBros.subtractTransaction(transaction2);
        assertEquals(2, graceBros.getTransactions().size());
    }

    @Test
    public void customerLosesFunds() {
      graceBros.addTransaction(transaction1);
      BigDecimal expected = new BigDecimal("10.00");
      assertEquals(expected, customer1.getFunds());
    }
     @Test
     public void customerGainsFunds() {
      graceBros.subtractTransaction(transaction2);
      BigDecimal expected = new BigDecimal("80.00");
      assertEquals(expected, customer2.getFunds());
    }
  



    // @Test
    //   public void hasTransactionType() {
    //   assertEquals("Sale", transaction.getTransactionType());
    // }

    // @Test
    //   public void hasSalePrice() {
    //   expected = new BigDecimal("5.00"); 
    //   assertEquals(expected, transaction.getSalePrice());
    // }

    // @Test
    //   public void hasRefundPrice() {
    //   expected = new BigDecimal("5.00"); 
    //   assertEquals(expected, transaction.getRefundPrice());
    // }

     
    // @Test
    //   public void hasDiscountApplied() { 
    //   assertEquals("50%", transaction.getDiscountApplied());
    // }




    // @Test
    //    public void hasFundsAfterSale(){
    //    expected = new BigDecimal("105.00");
    //    assertEquals(expected, transaction.getFundsAfterSale());
    // }

    // @Test
    //    public void hasFundsAfterRefund(){
    //    expected = new BigDecimal("100.00");
    //    assertEquals(expected, transaction.getFundsAfterRefund());
    // }

    //  @Test
    //     public void hasPaymentType() {
    //     assertEquals(PaymentMethod.VISA, transaction.getPaymentType());
    // }

    //  @Test
    //     public void PaymentTypeNotNull() {
    //     assertNotNull(transaction.getPaymentTypeNotNull());
    // }



    //  @Test
    //     public void hasEndFunds(){
    //     expected = new BigDecimal("100.00");
    //     assertEquals(expected, transaction.getEndFunds());
    
    // }




} 