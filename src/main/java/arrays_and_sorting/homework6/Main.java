package arrays_and_sorting.homework6;

public class Main {
    public static void main(String[] args) {
        MyTreeMap<Integer, String> map = new MyTreeMap<>();
        map.put(5, "five");
        map.put(3, "three");
        map.put(9, "nine");
        map.put(4, "four");
        map.put(7, "seven");
        System.out.println(map);

//        map.delete(4);
//        System.out.println(map);

//        map.deleteMin();
//        System.out.println(map.minKey());
//        System.out.println(map.get(4));
        System.out.println(map.contains(9));
    }
}
