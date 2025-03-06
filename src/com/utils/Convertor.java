package com.utils;

public class Convertor {

    final static double CONVERTER_DISTANCE = 1.60934;

    public static double getConverterKmToMl(double km) {
        return km / CONVERTER_DISTANCE;
    }

    public static double getConverterMlToKm(double ml) {
        return ml * CONVERTER_DISTANCE;
    }
}