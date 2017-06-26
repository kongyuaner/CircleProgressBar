package com.ky.circleprogressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CircleProgressBar recommend_progressBar;//circle百分比
    private TextView recommend_rate_circle;//百分比利率

    private float aFloat = 75.8f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recommend_progressBar = (CircleProgressBar) findViewById(R.id.recommend_progressBar);
        recommend_rate_circle = (TextView) findViewById(R.id.recommend_rate_circle);

        recommend_rate_circle.setText(String.valueOf(aFloat));//百分比利率
        recommend_progressBar.setTargetPercent(aFloat);//circle百分比

    }
}
