package com.silasg.sparklab;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mvelloso on 4/23/15.
 */
public class ExamplesTest {

    private JavaSparkContext sc;

    @Before
    public void setUp() throws Exception {
        SparkConf conf = new SparkConf().setAppName("sparklab").setMaster("local[4]");
        sc = new JavaSparkContext(conf);
    }

    @After
    public void tearDown() throws Exception {
        sc.stop();
    }

    @Test
    public void testSumOfIntegers() throws Exception {

        assertEquals(15, Examples.sumOfIntegers(sc, 1, 2, 3, 4, 5).intValue());

        assertEquals(222, Examples.sumOfIntegers(sc, 13, 2, 27, 180).intValue());

        assertEquals(91, Examples.sumOfIntegers(sc, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13).intValue());
    }
}