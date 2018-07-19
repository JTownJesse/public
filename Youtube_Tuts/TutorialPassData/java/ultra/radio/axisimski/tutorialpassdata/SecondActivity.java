package ultra.radio.axisimski.tutorialpassdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        output=findViewById(R.id.textView);

        String retrivedData=getIntent().getStringExtra("key22");

        output.setText(retrivedData);

    }
}
