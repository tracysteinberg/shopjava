package store;

import java.math.BigDecimal;
import java.util.*;


public class Store  {

  // private BigDecimal totalSales;
  // private BigDecimal totalRefunds;
  // private PaymentMethods  totalPaymentMethods;
  private ArrayList<Transaction> transactions;

  public Store() {
    // this.incomeReport = incomeReport;
    // this.totalSales = totalSales;
    // this.totalRefunds = totalRefunds;
    transactions = new ArrayList<Transaction>();
  }

  // public BigDecimal getIncomeReport() {
  //   return this.incomeReport;
  // }


  // public BigDecimal getTotalSales(){
  //    return this.incomeReport.subtract(totalRefunds);
  // }

  // public BigDecimal getTotalRefunds(){
  //    return this.incomeReport.subtract(totalSales);
  // }

  public ArrayList<Transaction> getTransactions(){
    return this.transactions;
  }

  public void addTransaction(Transaction t) {
    transactions.add(t);
  }

  
}