package Stream.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class mainStream {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
        Stream<Integer> st1 = list.stream();
        Stream<Integer> st2 = list.stream().map(x -> x * 10);
        Stream<String> st3 = Stream.of("Maria", "Jose", "Flavia");
        Stream<Integer> st4 = Stream.iterate(0, x -> x + 2);
        Stream<Long> st5 = Stream.iterate(new Long[]{0l, 1l}, p -> new Long[]{p[1], p[0] + p[1]}).map(p -> p[0]);
        
        System.out.println(Arrays.toString(st1.toArray()));
        System.out.println(Arrays.toString(st2.toArray()));
        System.out.println(Arrays.toString(st3.toArray()));
        System.out.println(Arrays.toString(st4.limit(10).toArray()));
        System.out.println(Arrays.toString(st5.limit(30).toArray()));

    }
}
