package com.netease.study.learnjava.guava;

import com.google.common.base.*;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.Lists;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Objects;
import java.util.Optional;

import static com.google.common.base.Preconditions.checkArgument;

/**
 * @author : lishuming
 */
public class GuavaSolution {
    static void testCollection() {
        Map items = ImmutableBiMap.of("a", 1, "b", 2);

        items.entrySet()
            .stream()
            .forEach(System.out::println);

        List<String> lists = Lists.newArrayList("a", "b");

        lists.stream().forEach(System.out::println);
    }

    static void testLambda() {
        Car car1 = new Car(1L, "a", 2);
        Car car2 = new Car(1L, "a", 0);
        List<Car> cars = Lists.newArrayList(car1, car2);
        System.out.println(car1);

        Predicate<Car> byPrice = car -> car.getPrice() > 0;
        List<String> results = FluentIterable.from(cars)
            .filter(byPrice)
            .transform(Functions.toStringFunction())
            .toList();

        System.out.println(results);
    }

    static void testArgment() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter items:");
        String input = br.readLine();
        List<String> items = Splitter.on(" ").splitToList(input);

        items.stream().forEach(x -> {
            checkArgument(x != null, "x not null");
            checkArgument(!x.isEmpty(), "x not empty");

            System.out.println(x);
        });
    }

    public static void main(String[] args) throws IOException {
        //testCollection();
        //testLambda();
        //String tempFile = "newfile.txt";
        //Files.touch(new File(tempFile));
        // testArgment();

        System.out.println(Objects.equals("", ""));
        System.out.println(Objects.hashCode(new String("a")));
        System.out.println(Objects.hashCode(new String("a")));
        //Optional<Integer> i = Optional.of(6);
        Optional<Integer> i = null;
        System.out.println(i.get());

        String a = MoreObjects.firstNonNull(null, "a");
        System.out.println(a);
        Strings.emptyToNull(null);
        List<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        List<Integer> linkedList = Collections.unmodifiableList(list);
        System.out.println(linkedList);
    }
}
