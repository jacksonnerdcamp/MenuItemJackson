public class Drink implements menuItem {
    private String name;
    private double price;
    public Drink(double price, String name)
    {
        this.name = name;
        this.price = price;
    }

    public String getName()
    {
        return this.name;
    }
    public double getPrice()
    {
        return this.price;
    }
}
