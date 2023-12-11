package org.example.service;

import org.aspectj.lang.annotation.Pointcut;
import org.example.annotation.InTransaction;
import org.example.annotation.Secured;
import org.example.ds.CurrencyType;
import org.springframework.stereotype.Service;

@Service
@Secured
public class MyCurrencyService {



    public void changeCurrency(int amount,int to){

    }


    public void changeCurrency(int amount){

    }

    public int changeCurrencyName(CurrencyType currencyType,int amount){
        return amount;
    }

    @InTransaction
    public String changeCurrencyCountyName(CurrencyType type){
        if(type.name().equals("US")){
            return "USA";
        }else
            throw new IllegalArgumentException();
    }

}
