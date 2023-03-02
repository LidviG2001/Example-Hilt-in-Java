package com.example.hilt;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class MainViewModel extends ViewModel {
    MutableLiveData <List<Cryptocurrency>> _cryptocurrencyEmitter = new MutableLiveData<List<Cryptocurrency>>();
    LiveData<List<Cryptocurrency>> cryptocurrencyEmitter = _cryptocurrencyEmitter;

    CryptocurrencyRepository cryptocurrencyRepository;

    @Inject
    public MainViewModel (CryptocurrencyRepository cryptocurrencyRepository){
        this.cryptocurrencyRepository = cryptocurrencyRepository;
        Log.d("TAG", "View Model." + cryptocurrencyRepository.getCryptoCurrency());
        loadCryptocurrency();
    }

    public void loadCryptocurrency() {
        _cryptocurrencyEmitter.setValue(cryptocurrencyRepository.getCryptoCurrency());
}}
