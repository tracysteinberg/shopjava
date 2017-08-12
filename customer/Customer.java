package customer;

import java.math.BigDecimal;
import java.util.*;

public class Customer  {


  private String name;
  private BigDecimal initialFunds;
  private BigDecimal fundsAfterSale;
  private BigDecimal fundsAfterRefund;
  private BigDecimal buyPrice;
  private BigDecimal refundPrice;
  private BigDecimal finalFunds;



  public Customer(String name, BigDecimal initialFunds, BigDecimal buyPrice, BigDecimal refundPrice, BigDecimal fundsAfterSale, BigDecimal fundsAfterRefund, BigDecimal finalFunds) {
    this.name = name;
    this.initialFunds = initialFunds;
    this.fundsAfterSale = fundsAfterSale;
    this.fundsAfterRefund = fundsAfterRefund;
    this.buyPrice = buyPrice;
    this.refundPrice = refundPrice;
    this.finalFunds = finalFunds;
  }


  public String getName(){
     return this.name;
  }

  public BigDecimal getInitialFunds(){
    return this.initialFunds;
  }

  public BigDecimal getFundsAfterSale(){
     return this.initialFunds.subtract(buyPrice);
  }

  public BigDecimal getFundsAfterRefund(){
     return this.fundsAfterSale.add(refundPrice);
  }

  public BigDecimal getFinalFunds() {
     return this.finalFunds;
  }

}