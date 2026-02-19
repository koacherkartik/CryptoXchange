package app;

import model.User;
import service.TradingService;

public class CryptoXApp {
    public static void main(String[] args) {

        User user = new User("kartik", "password123");
        TradingService tradingService = new TradingService();

        tradingService.buy(user, "BTC", 0.1);
        tradingService.sell(user, "BTC", 0.05);

        System.out.println("Balance: $" + user.getWallet().getBalance());
        System.out.println("Holdings: " + user.getWallet().getHoldings());
    }
}
