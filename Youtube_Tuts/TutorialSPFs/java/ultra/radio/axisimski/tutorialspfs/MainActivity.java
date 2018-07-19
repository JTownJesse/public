package ultra.radio.axisimski.tutorialspfs;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    Button saveData_Btn;
    EditText input_Edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saveData_Btn=findViewById(R.id.saveData_btn);
        input_Edt=findViewById(R.id.input_edt);
        loadData();

        saveData_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
            }
        });


    }


    private void saveData(){

        String data=input_Edt.getText().toString();
        SharedPreferences sharedPreferences=getApplicationContext().getSharedPreferences("Settings", Context.MODE_PRIVATE);
        sharedPreferences.edit().putString("key", data).apply();

    }


    private void loadData(){

        SharedPreferences sharedPreferences=getApplicationContext().getSharedPreferences("Settings", Context.MODE_PRIVATE);
        String retrivedData=sharedPreferences.getString("key", "Nothing saved in spf yet");

        input_Edt.setText(retrivedData);

    }




}
