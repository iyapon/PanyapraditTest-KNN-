package iyaaut.pr;

import naphon.ai.ai.exceptions.AIException;
import naphon.ai.classify.KNearestNeighbors;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        KNearestNeighbors kn = new KNearestNeighbors();
        try {
            kn.train(Arrays.asList(new double[]{120.0, 1710.0}, new double[]{880.0, 615}, new double[]{90.0, 50.0}, new double[]{603.0, 1200.0}, new double[]{850.0, 132.0}, new double[]{50.0, 60.0}, new double[]{70.0, 5000.0}, new double[]{569.0, 524.0}, new double[]{50.0, 100.0}, new double[]{55.0, 80.0}),
                    Arrays.asList("Train", "Airplane", "Bus", "Train", "Airplane", "Bus", "Train", "Airplane", "Bus", "Bus"));
            System.out.println(kn.predict(new double[]{100.0, 40.0}, 300).get(0));
        } catch (AIException e) {

            throw new RuntimeException(e);
        }


    }
}