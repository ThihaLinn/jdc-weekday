package org.example.service;

import org.example.annotation.Secured;
import org.springframework.stereotype.Service;

@Service
public class CurrencyServiceImpl implements CurrencyService {

    @Override
    public double changeCurrency(int amount) {
        return amount;
    }
}
