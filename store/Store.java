package store;

import java.math.BigDecimal;
import java.util.*;


public class Store  {


  private BigDecimal incomeReport;
  private BigDecimal totalSales;
  private BigDecimal totalRefunds;
  // private PaymentMethods  totalPaymentMethods;
  
  




  public Store(BigDecimal incomeReport, BigDecimal totalSales, BigDecimal totalRefunds) {
    this.incomeReport = incomeReport;
    this.totalSales = totalSales;
    this.totalRefunds = totalRefunds;
    
  }

  public BigDecimal getIncomeReport() {
    return this.incomeReport;
  }


  public BigDecimal getTotalSales(){
     return this.incomeReport.subtract(totalRefunds);
  }

  public BigDecimal getTotalRefunds(){
     return this.incomeReport.subtract(totalSales);
  }

  
}