package app.bit.com.myapp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class switchCalc extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.switch_calc);
        final EditText num = findViewById(R.id.num);
        final TextView result = findViewById(R.id.result);
        Button plusBtn = findViewById(R.id.plusbtn);
        Button minusBtn = findViewById(R.id.minusbtn);
        Button multipleBtn = findViewById(R.id.multiplebtn);
        Button divideBtn = findViewById(R.id.dividebtn);
        Button equalBtn = findViewById(R.id.equalbtn);
        plusBtn.setOnClickListener(this);
        minusBtn.setOnClickListener(this);
        multipleBtn.setOnClickListener(this);
        divideBtn.setOnClickListener(this);
        equalBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        final EditText num = findViewById(R.id.num);
        final TextView result = findViewById(R.id.result);
        switch (v.getId()){
            case R.id.plusbtn : break;
            case R.id.minusbtn : break;
            case R.id.multiplebtn : break;
            case R.id.dividebtn : break;
            case R.id.equalbtn : break;
        }

    }
}
