package model;

import java.util.HashMap;
import java.util.Map;

public class Wallet {
    private double balance;
    private Map<String, Double> holdings;

    public Wallet() {
        this.balance = 10000.0; // demo balance
        this.holdings = new HashMap<>();
    }

    public void buy(String asset, double amount, double price) {
        double cost = amount * price;
        if (cost <= balance) {
            balance -= cost;
            holdings.put(asset, holdings.getOrDefault(asset, 0.0) + amount);
        }
    }

    public void sell(String asset, double amount, double price) {
        if (holdings.getOrDefault(asset, 0.0) >= amount) {
            holdings.put(asset, holdings.get(asset) - amount);
            balance += amount * price;
        }
    }

    public double getBalance() {
        return balance;
    }

    public Map<String, Double> getHoldings() {
        return holdings;
    }
}
