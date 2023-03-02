package com.example.hilt;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class AppModule {
    @Provides
    @Singleton
    public CryptocurrencyRepository provideCryptocurrencyRepository(){
        return new CryptocurrencyRepositoryImpl();
    }
}
