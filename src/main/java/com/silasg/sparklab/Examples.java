package com.silasg.sparklab;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function2;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mvelloso on 4/23/15.
 */
public class Examples {

    private Examples(JavaSparkContext sc) {
        // Make sure no one can instantiate this class
    }

    public static Integer sumOfIntegers(JavaSparkContext sc, Integer... nums) {

        List<Integer> data = Arrays.asList(nums);
        JavaRDD<Integer> distData = sc.parallelize(data);

        Integer sum = distData.reduce(new Function2<Integer, Integer, Integer>() {

            @Override
            public Integer call(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        });

        return sum;
    }
}
