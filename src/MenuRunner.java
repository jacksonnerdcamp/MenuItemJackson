public class MenuRunner {
    public static void main(String[] args)
    {
        Sandwich reuben = new Sandwich(5.75, "Reuben");
        Sandwich BEC = new Sandwich(2.00, "BEC");
        Salad waldorf = new Salad(7.25, "Waldorf");
        Salad caesar = new Salad(4.50, "Caesar");
        Drink icedTea = new Drink(1.50, "Iced Tea");
        Drink smoothie = new Drink(5.50, "Smoothie");

        Trio trio1 = new Trio(reuben, waldorf, icedTea);
        Trio trio2 = new Trio(BEC, caesar, smoothie);
        Trio trio3 = new Trio(BEC, caesar, icedTea);
    }