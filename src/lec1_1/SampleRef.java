package lec1_1;

/**
 * Created by Illya on 16.11.2016.
 */
public class SampleRef {
    public static void main(String[] args) {
        final Integer i = 75;
        final Integer v = 75;
        Class <?> cls = Integer.class;
        System.out.println(i.getClass()==v.getClass());
        System.out.println(i.getClass()+","+cls);
    }
}
