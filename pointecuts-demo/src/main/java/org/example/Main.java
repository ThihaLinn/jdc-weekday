package org.example;

import org.example.ds.CurrencyType;
import org.example.service.AnotherCurrencyService;
import org.example.service.CurrencyService;
import org.example.service.CurrencyServiceImpl;
import org.example.service.MyCurrencyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Type;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppcConfig.class);
        context.registerShutdownHook();

        CurrencyService currencyService =
                context.getBean(CurrencyService.class);
        currencyService.changeCurrency(13);

        AnotherCurrencyService anotherCurrencyService =
                context.getBean(AnotherCurrencyService.class);
        anotherCurrencyService.changeCurrencyName("USD");

        MyCurrencyService myCurrencyService =
                context.getBean(MyCurrencyService.class);
        myCurrencyService.changeCurrency(13);
        myCurrencyService.changeCurrency(300,1500);
        myCurrencyService.changeCurrencyName(CurrencyType.EURO,13000);
        myCurrencyService.changeCurrencyCountyName(CurrencyType.US);
        try {
            myCurrencyService.changeCurrencyCountyName(CurrencyType.EURO);
        }catch (IllegalArgumentException e){
            System.out.println("Expection caught::"+e);
        }
    }
}