package com.laborator4.adapter;

/**
 * Created by venga_000 on 11/10/2014.
 *
 * The adapted legacy circle
 */

public class AdaptedCircle implements IShape {

        /* The adapted object */
        LegacyCircle adaptee = new LegacyCircle();

        @Override
        public void draw(int x, int y, int z, int tz) {
            // Adapt the existent class to the generic method
            int radius = Math.abs(z - tz);
            adaptee.draw(x, y, radius);
        }

}
