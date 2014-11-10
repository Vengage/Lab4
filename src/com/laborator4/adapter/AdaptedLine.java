package com.laborator4.adapter;

/**
 * Created by venga_000 on 11/10/2014.
 *
 * The adapted legacy line
 */
public class AdaptedLine implements IShape {

    /* The adapted object */
    private LegacyLine adaptee = new LegacyLine();

    @Override
    public void draw(int x, int y, int z, int tz) {
        // Adapt the old method to the new one
        adaptee.draw(x, y, z, tz);
    }

}
