package customer;

import java.math.BigDecimal;
import java.util.*;


public class Customer  {


  private String name;
  private BigDecimal funds;
  private FundsMethod  paymentType;
  private BigDecimal fundsAfterSale;
  private BigDecimal fundsAfterRefund;
  private BigDecimal buyPrice;
  private BigDecimal refundPrice;




  public Customer(String name, BigDecimal funds, FundsMethod paymentType, BigDecimal fundsAfterSale, BigDecimal fundsAfterRefund, BigDecimal buyPrice, BigDecimal refundPrice) {
    this.name = name;
    this.funds = funds;
    this.paymentType = paymentType;
    this.fundsAfterSale = fundsAfterSale;
    this.fundsAfterRefund = fundsAfterRefund;
    this.buyPrice = buyPrice;
    this.refundPrice = refundPrice;

  }


  public String getName(){
    return this.name;
  }

  public BigDecimal getFunds() {
    return this.funds;
  }

  public FundsMethod getPaymentType() {
     return this.paymentType;
  }
   public FundsMethod getPaymentTypeNotNull() {
     return this.paymentType;
  }

//  Customer funds go down/up


  public BigDecimal getFundsAfterSale(){
     return this.funds.subtract(buyPrice);
  }

  public BigDecimal getFundsAfterRefund(){
     return this.fundsAfterSale.add(refundPrice);
  }

  
}