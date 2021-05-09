package com.binary_studio.academy_coin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public final class AcademyCoin {


    private AcademyCoin() {
    }

    public static int maxProfit(Stream<Integer> prices) {
        List<Integer> buyDay = new ArrayList<>();
        List<Integer> sellDay = new ArrayList<>();
        List<Integer> integers = prices.collect(Collectors.toList());
        for (int i = 0; i < integers.size() - 1; i++) {
            if (integers.get(i) < integers.get(i + 1)) {
                buyDay.add(i);
                sellDay.add(i + 1);
                System.out.println();
            }

        }
        int sum = 0;
        for (int i = 0; i < buyDay.size(); i++) {
            sum += integers.get(sellDay.get(i)) - integers.get(buyDay.get(i));
        }
        System.out.println();
        return sum;
    }

}
