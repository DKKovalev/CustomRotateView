package dkkovalev.com.customrotateview;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/**
 * Created by DKovalev on 12.09.16.
 */
public class AnotherCircleAnimation extends Animation {

    private Circle circle;
    private float newAngle;
    private float oldAngle;

    public AnotherCircleAnimation(Circle circle, float newAngle) {
        this.circle = circle;
        this.newAngle = newAngle;
        this.oldAngle = circle.getAngle();
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        float angle = (oldAngle - newAngle) * interpolatedTime;
        circle.setAngle(angle);
        circle.setStartAngle(angle + 10);
        circle.requestLayout();
    }
}