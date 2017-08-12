package transaction;

import java.math.BigDecimal;
import java.util.*;

public class Transaction {

  
  private BigDecimal startFunds;
  private String     transactionType;
  private BigDecimal salePrice;
  private BigDecimal refundPrice;
  private String     discountApplied;
  private BigDecimal fundsAfterSale;
  private BigDecimal fundsAfterRefund;
  private String     paymentMethod;
  private BigDecimal endFunds;



  public Transaction(BigDecimal startFunds, String transactionType, BigDecimal salePrice, BigDecimal refundPrice, String discountApplied, 
   BigDecimal fundsAfterSale, BigDecimal fundsAfterRefund, String paymentMethod, BigDecimal endFunds) {
    this.startFunds = startFunds;
    this.transactionType = transactionType;
    this.salePrice = salePrice;
    this.refundPrice = refundPrice;
    this.discountApplied = discountApplied;
    this.fundsAfterSale = fundsAfterSale;
    this.fundsAfterRefund = fundsAfterRefund;
    this.paymentMethod = paymentMethod;
    this.endFunds = endFunds;
  }

  public BigDecimal getStartFunds(){
    return this.startFunds;
  }

  public String getTransactionType(){
     return this.transactionType;
  }

  public BigDecimal getSalePrice(){
    return this.salePrice;
  }

  public BigDecimal getRefundPrice(){
    return this.refundPrice;
  }

  public String getDiscountApplied(){
    return this.discountApplied;
  }

  
  public BigDecimal getFundsAfterSale(){
     return this.startFunds.add(salePrice);
  }

  public BigDecimal getFundsAfterRefund(){
     return this.fundsAfterSale.subtract(refundPrice);
  }




  public String getPaymentMethod(){
     return this.paymentMethod;
  }

  public BigDecimal getEndFunds() {
     return this.endFunds;
  }

} 