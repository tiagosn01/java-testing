public class Purchase implements Comparable<Purchase> {
    String description;
    int value;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Purchase anotherPurchase) {
        return Double.compare(this.value, (double) anotherPurchase.value);
    }
}
