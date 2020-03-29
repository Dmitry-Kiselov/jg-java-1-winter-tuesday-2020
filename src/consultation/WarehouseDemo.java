package consultation;

import java.util.ArrayList;
import java.util.List;

public class WarehouseDemo {

    public static void main(String[] args) {

        Warehouse<Milk> milkWarehouse = new Warehouse<>();

        milkWarehouse.setObject(new Milk());
        Milk milk = milkWarehouse.getObject();

        List<Bread> breadList = new ArrayList<>();
        breadList.add(new Bread());

        List<WhiteBread> whiteBreadList = new ArrayList<>();
        whiteBreadList.add(new WhiteBread());

        List<BlackBread> blackBreadList = new ArrayList<>();
        blackBreadList.add(new BlackBread());

        printBreadList(breadList);
        printBreadList(whiteBreadList);
        printBreadList(blackBreadList);

        //List<Bread> != List<WhiteBread>
        //Bread == WhiteBread

    }

    public static void printBreadList(List<? extends Bread> breads) {
        for (Bread bread : breads) {
            System.out.println(bread);
        }
    }

}
