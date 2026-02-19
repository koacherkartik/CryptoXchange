package service;

import model.User;
import util.PriceGenerator;

public class TradingService {

    public void buy(User user, String asset, double quantity) {
        double price = PriceGenerator.getPrice(asset);
        user.getWallet().buy(asset, quantity, price);
        System.out.println("Bought " + quantity + " " + asset + " at $" + price);
    }

    public void sell(User user, String asset, double quantity) {
        double price = PriceGenerator.getPrice(asset);
        user.getWallet().sell(asset, quantity, price);
        System.out.println("Sold " + quantity + " " + asset + " at $" + price);
    }
}
