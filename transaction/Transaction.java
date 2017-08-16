package transaction;

import java.math.BigDecimal;
import java.util.*;
import customer.*;

public class Transaction {


  private Customer customer;
  private BigDecimal amount;
  private PaymentMethod paymentMethod;


  public Transaction(BigDecimal amt, PaymentMethod pm, Customer cust) {
    this.amount = amt;
    this.customer = cust;
    this.paymentMethod = pm;
  }

  public BigDecimal getAmount() {
    return this.amount;
  }

  public Customer getCustomer() {
    return this.customer;
  }

  public PaymentMethod getPaymentMethod() {
    return this.paymentMethod;
  }

} 

  
  