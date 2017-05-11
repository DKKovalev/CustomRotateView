package dkkovalev.com.customrotateview;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/**
 * Created by DKovalev on 12.09.16.
 */
public class CircleAnimation extends Animation {

    private Circle circle;
    private LittleCircle littleCircle;
    private float newAngle;
    private float oldAngle;

    public CircleAnimation(Circle circle, LittleCircle littleCircle, float newAngle) {
        this.circle = circle;
        this.littleCircle = littleCircle;
        this.newAngle = newAngle;
        this.oldAngle = circle.getAngle();
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        float angle = oldAngle + (oldAngle - newAngle) * interpolatedTime;
        circle.setAngle(angle);
        circle.setStartAngle(angle + 10);
        circle.requestLayout();

        if (circle.getAngle() == 180) {
            float littleCircleAngle = oldAngle - (oldAngle + newAngle) * interpolatedTime;
            littleCircle.setAngle(littleCircleAngle);
            littleCircle.setStartAngle(littleCircleAngle - 10);
            littleCircle.requestLayout();
        }
    }
}
