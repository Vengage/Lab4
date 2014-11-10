package com.laborator4;

import com.laborator4.adapter.*;

/**
 * Created by venga_000 on 11/10/2014.
 *
 * This is the Main class. It holds the role of the client.
 */
public class Main {

    public static void main(String[] args) {
        // Initialise an array of legacy objects
        Object[] shapes = {new LegacyCircle(), new LegacyLine()};

        // Draw the legacy objects
        for (Object shape : shapes) {
            if (shape instanceof LegacyLine) {
                // Draw specific shape
                ((LegacyLine) shape).draw(1,2,3,4);
            } else if (shape instanceof LegacyCircle) {
                // Draw specific shape
                ((LegacyCircle) shape).draw(1,2,3);
            } else {
                // Unknown shape
                System.out.println("Unknown shape found");
            }
        }

        IShape[] adaptedShapes = {new AdaptedCircle(), new AdaptedLine()};
        for (IShape shape : adaptedShapes) {
            shape.draw(2, 3, 4, 5);
        }
    }
}
