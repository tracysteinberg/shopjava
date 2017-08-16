package store;

import java.math.BigDecimal;
import java.util.*;
import java.util.ArrayList;
import transaction.*;
import customer.*;
import store.*;


public class Store  {

  
  private ArrayList<Transaction> transactions;
  private BigDecimal initialBalance;

  public Store(BigDecimal initialBalance) {
    this.initialBalance = initialBalance;
    this.transactions = new ArrayList<Transaction>();
  }

  

  public ArrayList<Transaction> getTransactions(){
    return this.transactions;
  }

//   total sales

  public void addTransaction(Transaction t) {
  
    transactions.add(t);
    t.getCustomer().spendMoney(t.getAmount(), t.getPaymentMethod());

  }



//   total refunds

   public void subtractTransaction(Transaction t) {
    transactions.add(t);
    t.getCustomer().refundMoney(t.getAmount(), t.getPaymentMethod());

   }



//  sum = balance 

  public BigDecimal getBalance() {
    
    BigDecimal sum = BigDecimal.ZERO;

    for (int i = 0; i < this.transactions.size(); i++) {
      sum = sum.add(this.transactions.get(i).getAmount());
    }
     
    return sum.add(this.initialBalance);

  }

   

  
}