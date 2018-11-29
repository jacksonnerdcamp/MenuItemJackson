public class Salad implements menuItem {
    private String name;
    private double price;
    public Salad(double price, String name)
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
