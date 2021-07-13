package arrays_and_sorting.homework5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Backpack {
    private List <Thing> bestThings = null;
    private int maxWeight;
    private int bestPrice;

    public Backpack(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public static void main(String[] args) {
        List <Thing> things = Arrays.asList(new Thing(11, 8), new Thing(7, 6),
                new Thing(5, 10), new Thing(2, 10), new Thing(3, 15));
        Backpack backpack = new Backpack(10);
        List <Thing> result = backpack.allOptions(things);

        if(result == null) System.out.println("Нет решения!");
        else {
            int sumWeight = 0;
            int sumPrice = 0;
            System.out.println("Вещи в рюкзаке:");
            for(Thing thing : result) {
                sumWeight += thing.getWeight();
                sumPrice += thing.getPrice();
                System.out.println("Вес: " + thing.getWeight() + " | Цена: " + thing.getPrice());
            }
            System.out.println("Общий вес: " + sumWeight + " \nОбщая стоимость: " + sumPrice);
        }
    }

    private int calculateWeight(List <Thing> items) {
        int sumWeight = 0;
        for(Thing thing : items)
            sumWeight += thing.getWeight();
        return sumWeight;
    }

    private int calculatePrice(List <Thing> items) {
        int sumPrice = 0;
        for(Thing thing : items)
            sumPrice += thing.getPrice();
        return sumPrice;
    }

    private void bestOption(List <Thing> items) {
        if(bestThings == null) {
            if(calculateWeight(items) <= maxWeight) {
                bestThings = items;
                bestPrice = calculatePrice(items);
            }
        } else if(calculateWeight(items) <= maxWeight && calculatePrice(items) > bestPrice) {
            bestThings = items;
            bestPrice = calculatePrice(items);
        }
    }

    public List <Thing> allOptions(List <Thing> items) {
        if(items.size() > 0) bestOption(items);
        for(int i = 0; i < items.size(); i++) {
            List <Thing> newSet = new ArrayList <>(items);
            newSet.remove(i);
            allOptions(newSet);
        }
        return bestThings;
    }
}
