package org.example;

import java.util.ArrayList;
import java.util.List;


public class StatementRepository {

    private ArrayList<Transaction> transactions = new ArrayList<>();

    public void deposit(int amount) {
        transactions.add(new Transaction(amount));
    }

    public void withdrawal(int i) {
        transactions.add(new Transaction(-i));
    }

    public List<Transaction> getAll() {
        return transactions;
    }
}
