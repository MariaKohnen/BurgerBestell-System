public class MainApp {
    public static void main(String[] args) {
        OrderSystem burgerBestellSystem = new OrderSystem();
        Menu menu1 = new Menu("Menü1", 1.2, "Hamburger", "Pommes", "Cola");
        Menu menu2 = new Menu("Menü2", 1.2, "Cheeseburger", "Pommes", "Cola");
        Menu menu3 = new Menu("Menü3", 1.2, "Veggieburger", "Pommes", "Cola");
        burgerBestellSystem.addMenu(1, menu1);
        burgerBestellSystem.addMenu(2, menu2);
        burgerBestellSystem.addMenu(3, menu3);
        System.out.println("Herzlich Willkommen beim Burgerladen");
        System.out.println("Sie können zwischen folgenden Menüs auswählen:");
        System.out.println(burgerBestellSystem.getAllMenus());
        burgerBestellSystem.placeOrder();
    }
}
