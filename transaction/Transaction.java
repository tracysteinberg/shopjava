package transaction;

import java.math.BigDecimal;
import java.util.*;
import customer.*;

public class Transaction {

  private BigDecimal amount;
  private Customer customer;
  private PaymentMethod paymentMethod;

  public Transaction(BigDecimal amt, Customer cust, PaymentMethod pm) {
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

  
  // private BigDecimal startFunds;
  // private String     transactionType;
  // private BigDecimal salePrice;
  // private BigDecimal refundPrice;
  // private String     discountApplied;
  // private BigDecimal fundsAfterSale;
  // private BigDecimal fundsAfterRefund;
  // private PaymentMethod  paymentType;
  // private BigDecimal endFunds;



  // public Transaction(BigDecimal startFunds, String transactionType, BigDecimal salePrice, BigDecimal refundPrice, String discountApplied, 
  //  BigDecimal fundsAfterSale, BigDecimal fundsAfterRefund, PaymentMethod paymentType, BigDecimal endFunds) {
  //   this.startFunds = startFunds;
  //   this.transactionType = transactionType;
  //   this.salePrice = salePrice;
  //   this.refundPrice = refundPrice;
  //   this.discountApplied = discountApplied;
  //   this.fundsAfterSale = fundsAfterSale;
  //   this.fundsAfterRefund = fundsAfterRefund;
  //   this.paymentType = paymentType;
  //   this.endFunds = endFunds;
  // }

  // public BigDecimal getStartFunds(){
  //   return this.startFunds;
  // }

  // public String getTransactionType(){
  //    return this.transactionType;
  // }

  // public BigDecimal getSalePrice(){
  //   return this.salePrice;
  // }

  // public BigDecimal getRefundPrice(){
  //   return this.refundPrice;
  // }

  // public String getDiscountApplied(){
  //   return this.discountApplied;
  // }

  // public BigDecimal getFundsAfterSale(){
  //    return this.startFunds.add(salePrice);
  // }

  // public BigDecimal getFundsAfterRefund(){
  //    return this.fundsAfterSale.subtract(refundPrice);
  // }

  // public PaymentMethod getPaymentType() {
  //    return this.paymentType;
  // }

  // public PaymentMethod getPaymentTypeNotNull() {
  //    return this.paymentType;
  // }


  // public BigDecimal getEndFunds() {
  //    return this.endFunds;
  // }
