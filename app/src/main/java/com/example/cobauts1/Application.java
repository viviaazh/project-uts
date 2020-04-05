package com.example.cobauts1;

import com.example.cobauts1.models.Account;

public class Application extends android.app.Application{
    private static Account account;

    @Override
    public void onCreate() {
        super.onCreate();
        account = new Account();
    }

    public static Account getAccount() {
        return account;
    }
}
