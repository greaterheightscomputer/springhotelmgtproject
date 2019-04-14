package greater.pojo;
// Generated Mar 23, 2019 12:04:22 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * BarPriceLists generated by hbm2java
 */
public class BarPriceLists  implements java.io.Serializable {


     private Integer barPriceId;
     private String drinkType;
     private String drinkDescription;
     private Double vat5;
     private Double conTax5;
     private Double amount;
     private String createdDate;
     private Set barses = new HashSet(0);

    public BarPriceLists() {
    }

    public BarPriceLists(String drinkType, String drinkDescription, Double vat5, Double conTax5, Double amount, String createdDate, Set barses) {
       this.drinkType = drinkType;
       this.drinkDescription = drinkDescription;
       this.vat5 = vat5;
       this.conTax5 = conTax5;
       this.amount = amount;
       this.createdDate = createdDate;
       this.barses = barses;
    }
   
    public Integer getBarPriceId() {
        return this.barPriceId;
    }
    
    public void setBarPriceId(Integer barPriceId) {
        this.barPriceId = barPriceId;
    }
    public String getDrinkType() {
        return this.drinkType;
    }
    
    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }
    public String getDrinkDescription() {
        return this.drinkDescription;
    }
    
    public void setDrinkDescription(String drinkDescription) {
        this.drinkDescription = drinkDescription;
    }
    public Double getVat5() {
        return this.vat5;
    }
    
    public void setVat5(Double vat5) {
        this.vat5 = vat5;
    }
    public Double getConTax5() {
        return this.conTax5;
    }
    
    public void setConTax5(Double conTax5) {
        this.conTax5 = conTax5;
    }
    public Double getAmount() {
        return this.amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public String getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
    public Set getBarses() {
        return this.barses;
    }
    
    public void setBarses(Set barses) {
        this.barses = barses;
    }




}

