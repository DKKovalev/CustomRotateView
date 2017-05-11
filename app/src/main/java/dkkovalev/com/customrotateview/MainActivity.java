package dkkovalev.com.customrotateview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Circle circle = (Circle)findViewById(R.id.circle);
//        CircleAnimation circleAnimation = new CircleAnimation(circle, 360);
//        circleAnimation.setDuration(1000);
//        circleAnimation.setRepeatCount(Animation.INFINITE);
//        circle.startAnimation(circleAnimation);

        textView = (TextView)findViewById(R.id.textView);
        textView.setOnClickListener(ggefs -> sayHello());

        Circle anotherCircle = (Circle)findViewById(R.id.circle_1);
        AnotherCircleAnimation anotherCircleAnimation = new AnotherCircleAnimation(anotherCircle, 360);
        anotherCircleAnimation.setDuration(1000);
        anotherCircleAnimation.setRepeatCount(Animation.INFINITE);
        anotherCircle.startAnimation(anotherCircleAnimation);
    }

    private void sayHello(){
        textView.setText("Hello");
    }
}
