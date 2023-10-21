import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Account {
    int total = 0;

    int limit = 300;

    List<Purchase> purchases = new ArrayList<>();

    public int getTotal() {
        return total;
    }

    public void newPurchase(String description, int value) {
        if(value + this.total  > limit) {
            System.out.println("Insufficient funds");
        } else {
            var currentPurchase = new Purchase();
            currentPurchase.setValue(value);
            currentPurchase.setDescription(description);
            purchases.add(currentPurchase);
            this.total+= value;
        }
    };

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void getPurchases() {
        System.out.println("*********** EXTRACT ***********");
        Collections.sort((purchases));
        purchases.forEach(p -> {
            System.out.println(p.getDescription() + " - " + p.getValue());
        });


        System.out.println("TOTAL ------------ " + this.getTotal());
        System.out.println("*******************************");
    }


}
