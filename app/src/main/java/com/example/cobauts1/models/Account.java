package com.example.cobauts1.models;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private List<Transaction> transactions;

    public Account() {
        this.transactions = new ArrayList<>();
    }



    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void addTransaction(Transaction transaction){
        transaction.getClassSchedule();
        transaction.getDay();
        this.transactions.add(transaction);
    }

    public void removeTransaction(int index){
        Transaction transaction = transactions.get(index);
        transaction.getClassSchedule();
        transaction.getDay();
        this.transactions.remove(transaction);
    }
    public void updateTransaction(int index, Transaction transaction){
        this.transactions.set(index, transaction);
    }
}
