package pro.istiyak.counterdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button_count,button_reset;
    TextView textView_count;
    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        buttonListener();

    }
    private void initialize(){

        button_count = (Button) findViewById(R.id.button_count);
        button_reset = (Button) findViewById(R.id.button_reset);
        textView_count = (TextView) findViewById(R.id.textView_count);

        textView_count.setText(String.valueOf(counter));

    }
    private void buttonListener(){

        button_count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                textView_count.setText(String.valueOf(counter));
            }
        });
        button_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter=0;
                textView_count.setText(String.valueOf(counter));
                Toast.makeText(MainActivity.this, "Reset to 0", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
