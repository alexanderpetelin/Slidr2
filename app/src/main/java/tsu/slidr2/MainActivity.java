package tsu.slidr2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: 20.08.2017 Код для тестирования GitHub 

        textView = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);

        textView.setText("- Hello!");
        textView2.setText("- Hello!");

        textView.setText("- Hello! 2");
        textView2.setText("- Hello! 2");

        textView.setText("- Hello! 3");
        textView2.setText("- Hello! 3");
    }
}
