
import static org.junit.Assert.*;
import org.junit.*;
import store.*;
import java.math.BigDecimal;
import customer.*;
import transaction.*;

public class StoreTest {

  Store      store;
  BigDecimal incomeReport;
  BigDecimal totalSales;
  BigDecimal totalRefunds;
  BigDecimal expected;

  
    @Before 
      public void before() {
      incomeReport = new BigDecimal("2000.00");
      totalSales = new BigDecimal("1500.00");
      totalRefunds = new BigDecimal("500.00");
 
      store = new Store(incomeReport, totalSales, totalRefunds);
      
    }
    

    @Test
       public void hasIncomeReport() {
       expected = new BigDecimal("2000.00"); 
       assertEquals(expected, store.getIncomeReport());
    }

    @Test
       public void hasTotalSales() {
       expected = new BigDecimal("1500.00"); 
       assertEquals(expected, store.getTotalSales());
    }

     @Test
       public void hasTotalRefunds() {
       expected = new BigDecimal("500.00"); 
       assertEquals(expected, store.getTotalRefunds());
    }






} 