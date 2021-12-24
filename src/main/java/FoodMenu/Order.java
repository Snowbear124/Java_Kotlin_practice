package FoodMenu;

public class Order {
    String main = "pork";
    String dish = "egg";
    String dessert = "fruit";

    public Order(String main, String dish, String dessert) {
        if (main != "") this.main = main;
        if (dish != "") this.dish = dish;
        if (dessert != "") this.dessert = dessert;
    }

    public void print() {
        System.out.println("You order '" + main + "' + '" + dish
                + "' + '" + dessert + "' right?");
    }
}
