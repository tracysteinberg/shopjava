package customer;

import java.math.BigDecimal;
import java.util.*;
// import customer.*;

public class Customer  {


  private String name;
  private BigDecimal funds;
  private PaymentMethod  paymentType;



  // private BigDecimal initialfunds;
  // private BigDecimal fundsAfterSale;
  // private BigDecimal fundsAfterRefund;
  // private BigDecimal buyPrice;
  // private BigDecimal refundPrice;
  // private BigDecimal finalFunds;



  public Customer(String name, BigDecimal funds, PaymentMethod paymentType) {
    this.name = name;
    this.funds = funds;
    this.paymentType = paymentType;

  }


    // this.initialFunds = initialFunds;
    // this.fundsAfterSale = fundsAfterSale;
    // this.fundsAfterRefund = fundsAfterRefund;
    // this.buyPrice = buyPrice;
    // this.refundPrice = refundPrice;
    // this.finalFunds = finalFunds;

  public String getName(){
    return this.name;
  }

  public BigDecimal getFunds() {
    return this.funds;
  }

  public PaymentMethod getPaymentType() {
     return this.paymentType;
  }
   public PaymentMethod getPaymentTypeNotNull() {
     return this.paymentType;
  }




  // public BigDecimal getInitialFunds(){
  //   return this.initialFunds;
  // }

  // public BigDecimal getFundsAfterSale(){
  //    return this.initialFunds.subtract(buyPrice);
  // }

  // public BigDecimal getFundsAfterRefund(){
  //    return this.fundsAfterSale.add(refundPrice);
  // }

  // public BigDecimal getFinalFunds() {
  //    return this.finalFunds;
  // }

}