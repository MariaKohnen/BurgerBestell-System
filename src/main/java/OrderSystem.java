import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class OrderSystem {
    Map <Integer, Menu> menus = new HashMap<>();

    public void addMenu (int id, Menu menu){
        menus.put(id, menu);
    }
    public Menu getOrderById (Integer id) throws NoSuchElementException{
        if (menus.containsKey(id)){
            System.out.println("Menü gefunden. Hau rein!");
            return menus.get(id);
        }
        else {
            System.out.println("Menü nicht gefunden!");
            throw new NoSuchElementException("Id nicht gefunden: "+id);
        }
    }

    public void placeOrder (){
        System.out.println("Bitte geben Sie Ihre Bestellung ein");
        Scanner scan = new Scanner(System.in);
        Integer id = scan.nextInt();
        //getOrderById(id);
        System.out.println(getOrderById(id));
    }
    public Map<Integer, Menu> getAllMenus (){
        return menus;
    }

    @Override
    public String toString() {
        return "OrderSystem{" +
                "menus=" + menus +
                '}';
    }
}
