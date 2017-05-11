package dkkovalev.com.customrotateview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by DKovalev on 12.09.16.
 */
public class Circle extends View {

    private static final int START_ANGLE = 55;

    private Paint paint;
    private RectF rect;
    private int strokeWidth;
    private float angle;
    private float startAngle;

    public Circle(Context context, AttributeSet attrs) {
        super(context, attrs);

        strokeWidth = 40;

        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(strokeWidth);
        rect = new RectF(strokeWidth, strokeWidth, strokeWidth + 100, strokeWidth + 100);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(rect, startAngle, angle, false, paint);
    }

    public float getAngle() {
        return angle;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }

    public void setStartAngle(float startAngle) {
        this.startAngle = startAngle;
    }

    public float getStartAngle() {
        return startAngle;
    }
}
