package test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Integer> nums = Stream.iterate(0,(i)->i+2).limit(10).collect(Collectors.toList());
        System.out.println(nums);
    }
}
