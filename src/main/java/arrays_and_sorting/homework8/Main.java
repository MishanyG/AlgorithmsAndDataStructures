package arrays_and_sorting.homework8;

public class Main {
    public static void main(String[] args) {
//        Double d = -78.0;
//
//        System.out.println(Integer.toHexString(d.hashCode()));

//        Long l = -78L;
//        System.out.println(Integer.toHexString(l.hashCode()));

//        int x = Integer.MIN_VALUE;
//        System.out.println(x);
//        System.out.println(Math.abs(x));

        ChainingHashMap<Integer, String> chm = new ChainingHashMap<>(16);

        chm.put(1, "one");
        chm.put(222, "222e");
        chm.put(4545, "4545e");
        chm.put(45454, "4545b");
        chm.put(454545, "4545c");

//        System.out.println(chm.get(222));
        System.out.println(chm);
        chm.delete(1);
//        System.out.println(chm.get(222));
        System.out.println(chm);
        chm.put(1, "222e");
//        System.out.println(chm.get(222));
        System.out.println(chm);

//        Random random = new Random();
//
//        for (int i = 0; i < 12; i++) {
//            chm.put(random.nextInt(1000), "");
//        }

//        System.out.println(chm);

        LinearProbingHashMap<Integer, String> lphm = new LinearProbingHashMap<>();

        lphm.put(1, "one");
        lphm.put(222, "222e");
        lphm.put(4545, "4545e");
        lphm.delete(4545);
        System.out.println(lphm.get(4545));
        lphm.put(4545, "222e");
        System.out.println(lphm.get(4545));

    }
}