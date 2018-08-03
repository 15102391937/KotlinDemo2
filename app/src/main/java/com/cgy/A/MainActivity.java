package com.cgy.A;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.cgy.B.FashdkjfKt;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FashdkjfKt.ding();
        String s = FashdkjfKt.dingS;

        TextView tv1 = findViewById(R.id.tv1);
        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView3);

        DecimalFormat df5 = new DecimalFormat("###,####.00");
        DecimalFormat df6 = new DecimalFormat("0.##%");
        String result1 = (df6.format(0.30522));
        String result2 = (df6.format(0.33));
        String result3 = (df5.format(123456.123));

        tv1.setText(result1);
        textView.setText(result2);
        textView.setText(result3);

        ss(new Integer(89));

        Teeee teeee = new Teeee();
        teeee.testLam(new Function1<String, Unit>() {
            @Override
            public Unit invoke(String s) {
                return Unit.INSTANCE;
            }
        });
        List<String> ooo = new ArrayList<>();


        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

    }

    private void ss(Object o) {
        Log.e("ya", o.toString());
    }

}
