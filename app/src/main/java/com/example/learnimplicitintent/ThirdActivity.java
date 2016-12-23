package com.example.learnimplicitintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

/**并没有实现加载并显示网页的功能，
 * 不能像浏览器一样工作。
 * 在真正的项目中不要做这种可能误导用户的行为
 */
public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_third);

        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText("并没有实现加载并显示网页的功能，不能像浏览器一样工作。在真正的项目中不要做这种可能误导用户的行为");


    }
}
