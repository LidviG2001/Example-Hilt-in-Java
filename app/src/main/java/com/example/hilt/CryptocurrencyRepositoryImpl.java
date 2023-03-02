package com.example.hilt;

import java.util.ArrayList;
import java.util.List;

public class CryptocurrencyRepositoryImpl implements CryptocurrencyRepository {
    @Override
    public List<Cryptocurrency> getCryptoCurrency() {
        ArrayList<Cryptocurrency> arrayList = new ArrayList<Cryptocurrency>();
        arrayList.add(new Cryptocurrency("one", "two"));
        arrayList.add(new Cryptocurrency("three", "four"));
        arrayList.add(new Cryptocurrency("five", "six"));
        arrayList.add(new Cryptocurrency("seven", "eight"));
        return arrayList;
    }
}
