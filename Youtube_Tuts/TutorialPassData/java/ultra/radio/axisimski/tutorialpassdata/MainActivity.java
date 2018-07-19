package ultra.radio.axisimski.tutorialpassdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button sendData_btn;
    EditText input_edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sendData_btn=findViewById(R.id.button);
        input_edt=findViewById(R.id.editText);


        sendData_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String data=input_edt.getText().toString();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("key22", data);
                startActivity(intent);



            }
        });

    }
}
