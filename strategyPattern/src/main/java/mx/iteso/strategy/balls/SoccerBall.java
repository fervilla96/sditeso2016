package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.Deformable;
import mx.iteso.strategy.behaviors.impl.NormalBounce;

public class SoccerBall extends Ball {
    public SoccerBall() {
        bounceBehavior = new NormalBounce();
        deflateBehavior = new Deflatable();
        deformBehaviour = new Deformable();
        type = "Soccer ball";
    }
}
