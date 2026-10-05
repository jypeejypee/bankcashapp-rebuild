package model;

import  java.math.BigDecimal;
import  java.time.LocalDateTime;

public class Transaction {
    private String type; 
    private BigDecimal amount;
    private String details;
    private LocalDateTime dateTime;


    public Transaction(){}
    public Transaction(String type, BigDecimal amount, String details, LocalDateTime dateTime){
        this.type = type;
        this.amount = amount;
        this.details = details;
        this.dateTime = dateTime;
    }

    /*getter
     public data getName(){
     return name;
     }   
     setter
     public void setName(type name){
     this.name=name;
     }
    */

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public BigDecimal getAmount(){
        return amount;
    }

    public void getAmount(BigDecimal amount){
        this.amount = amount;
    }
    
    public String getDetails(){
        return details;
    }

    public void setDetails(String details){
        this.details = details;
    }

    public LocalDateTime getDateTime(){
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime){
        this.dateTime = dateTime;
    }


}
