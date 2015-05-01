package com.silasg.sparklab;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

/**
 * Created by mvelloso on 4/22/15.
 */
public class Launcher {

    public static void main(String[] args) {

        SparkConf conf = new SparkConf().setAppName("sparklab");
        JavaSparkContext sc = new JavaSparkContext(conf);

        System.out.println("Sum of integer list is: " + Examples.sumOfIntegers(sc, 1, 2, 3, 4, 5));

        sc.stop();
    }
}
