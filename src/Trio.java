public class Trio implements menuItem {
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;

    public Trio(Sandwich sandwich, Salad salad, Drink drink)
    {
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }
    //methods
    public String getName()
    {
        return this.sandwich.getName() + " + " + this.salad.getName() + " + " + this.drink.getName();
    }
    double price = 0;
    public double getPrice()
    {
        if ((this.sandwich.getPrice() <= this.salad.getPrice()) && (this.sandwich.getPrice() <= this.drink.getPrice())) {
            price =  this.salad.getPrice() + this.drink.getPrice();
        } else if ((this.salad.getPrice() <= this.sandwich.getPrice()) && (this.salad.getPrice() <= this.drink.getPrice())) {
            price = this.sandwich.getPrice() + this.drink.getPrice();
        } else if ((this.drink.getPrice() <= this.salad.getPrice()) && (this.drink.getPrice() <= this.sandwich.getPrice())) {
            price = this.salad.getPrice() + this.sandwich.getPrice();
        }
        return price;
    }
}
