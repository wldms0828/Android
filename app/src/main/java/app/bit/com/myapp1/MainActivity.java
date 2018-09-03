package app.bit.com.myapp1;

        import android.content.Context;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context ctx = MainActivity.this;
        findViewById(R.id.plusbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = findViewById(R.id.num1);
                EditText num2 = findViewById(R.id.num2);
                String sNum1 = num1.getText().toString();
                String sNum2 = num2.getText().toString();
                TextView result = findViewById(R.id.result);
                int n1 = Integer.parseInt(sNum1);
                int n2 = Integer.parseInt(sNum2);
                String plus = String.valueOf((n1+n2));
                result.setText(plus);
                Toast.makeText(ctx,"더하기한 값 : "+plus,Toast.LENGTH_LONG).show();
            }
        });
        findViewById(R.id.minusbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = findViewById(R.id.num1);
                EditText num2 = findViewById(R.id.num2);
                String sNum1 = num1.getText().toString();
                String sNum2 = num2.getText().toString();
                TextView result = findViewById(R.id.result);
                int n1 = Integer.parseInt(sNum1);
                int n2 = Integer.parseInt(sNum2);
                String minus = String.valueOf((n1-n2));
                result.setText(minus);
                Toast.makeText(ctx,"빼기 값 : "+minus,Toast.LENGTH_LONG).show();
            }
        });
        findViewById(R.id.multiplebtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = findViewById(R.id.num1);
                EditText num2 = findViewById(R.id.num2);
                String sNum1 = num1.getText().toString();
                String sNum2 = num2.getText().toString();
                TextView result = findViewById(R.id.result);
                int n1 = Integer.parseInt(sNum1);
                int n2 = Integer.parseInt(sNum2);
                String multiple = String.valueOf((n1*n2));
                result.setText(multiple);
                Toast.makeText(ctx,"곱하기 값 : "+multiple,Toast.LENGTH_LONG).show();
            }
        });
        findViewById(R.id.dividebtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = findViewById(R.id.num1);
                EditText num2 = findViewById(R.id.num2);
                String sNum1 = num1.getText().toString();
                String sNum2 = num2.getText().toString();
                TextView result = findViewById(R.id.result);
                int n1 = Integer.parseInt(sNum1);
                int n2 = Integer.parseInt(sNum2);
                String divide = String.valueOf((n1/n2));
                result.setText(divide);
                Toast.makeText(ctx,"나누기 값 : "+divide,Toast.LENGTH_LONG).show();
            }
        });
    }
}
