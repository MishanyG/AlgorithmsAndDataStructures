package arrays_and_sorting.homework6;

public class Main {
    public static void main(String[] args) {
//        MyTreeMap<Integer, String> map = new MyTreeMap<>();
//        map.put(5, "five");
//        map.put(3, "three");
//        map.put(9, "nine");
//        map.put(4, "four");
//        map.put(7, "seven");
//        System.out.println(map);

//        map.delete(4);
//        System.out.println(map);

//        map.deleteMin();
//        System.out.println(map.minKey());
//        System.out.println(map.get(4));
//        System.out.println(map.contains(9));

        MyTreeMap<Integer, Integer> map ;
        int j = 0;

        for(int i = 0; i < 1000000; i++) {
            map = new MyTreeMap<>();
            while(map.height() != 6) {
                int random = (int) (Math.random() * 200 - 100);
                map.put(random, random);
            }
            System.out.println(map.size() + ": " + map.height());
            System.out.println(map.isBalanced());
            if(!map.isBalanced())
                j++;
        }
        System.out.println((((double)j/1000000.0)*100.0));
//        Процент несбалансированных деревьев из 1000000 деревьев: 99.99980000000001
    }
}
