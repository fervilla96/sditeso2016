package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fernando on 14/09/16.
 */
public class BounceTest {
    @Test
    public void testNormalBounce() {
        NormalBounce normalBounce = new NormalBounce();
        assertEquals("I'm bouncing normally!",normalBounce.bounce());
    }
}
