package com.sparkbyexamples.java;
import org.apache.spark.sql.SparkSession;

public class SessionTest {

    public static void main(String args[]) {
        SparkSession spark = SparkSession
                .builder()
                .master("local[1]")
                .appName("SparkByexamples.com")
                .getOrCreate();
        System.out.println("Spark version: "+spark.version());
        System.out.println("Spark version: "+spark.sparkContext().appName());
        System.out.println("Spark version: "+spark.sparkContext().applicationId());

    }
}
