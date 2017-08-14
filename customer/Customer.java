package customer;

import java.math.BigDecimal;
import java.util.*;
import transaction.*;


public class Customer  {


  private String name;
  private BigDecimal funds;
  private PaymentMethod preferredPaymentMethod;


  public Customer(String name, BigDecimal funds, PaymentMethod paymentMethod) {
    this.name = name;
    this.funds = funds;
    this.preferredPaymentMethod = paymentMethod;
  }


  public String getName(){
    return this.name;
  }

  public BigDecimal getFunds() {
    return this.funds;
  }

  public PaymentMethod getPaymentType() {
    return this.preferredPaymentMethod;
  }

  public void spendMoney(BigDecimal amount){
   this.funds = this.funds.subtract(amount);
  }


  public void refundMoney(BigDecimal amount){
   this.funds = this.funds.add(amount);
  }


//  Customer funds go down/up


  // public BigDecimal getFundsAfterSale(){
  //    return this.funds.subtract(buyPrice);
  // }

  // public BigDecimal getFundsAfterRefund(){
  //    return this.fundsAfterSale.add(refundPrice);
  // }

  
}