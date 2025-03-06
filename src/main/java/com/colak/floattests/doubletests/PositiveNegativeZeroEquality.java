package com.colak.floattests.doubletests;

// See https://medium.com/@poojaauma/unknown-java-facts-that-will-surprise-even-experienced-developers-53917140ff34
public class PositiveNegativeZeroEquality {

    public static void main() {

        // in Java, 0.0 and -0.0 are considered equal! This behavior is due to how IEEE 754 floating-point arithmetic works.
        // Despite having different bit representations, they compare as equal:
        System.out.println(0.0 == -0.0); // true
    }
}
