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
        final EditText num = findViewById(R.id.num);
        final TextView result = findViewById(R.id.result);
        class Calc{
            int num, res;
            String op;
            public void exe(){
                switch (op){
                    case "+" :res += num ;break;
                    case "-" :res -= num ;break;
                    case "*" :res *= num ;break;
                    case "/" :res /= num ;break;
                }
            }
            public int getNum() {return num;}
            public int getRes() {return res;}
            public String getOp() {return op;}
            public void setNum(int num){this.num = num;}
            public void setRes(int res){this.res = res;}
            public void setOp(String op){this.op = op;}

        }
        final Calc c = new Calc();
        findViewById(R.id.plusbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String sNum1 = num1.getText().toString();
                //String sNum2 = num2.getText().toString();
                int n = Integer.parseInt(num.getText().toString());
                c.setNum(n);
                c.setOp("+");
                Toast.makeText(ctx,"더하기한 값 : "+n ,Toast.LENGTH_LONG).show();
                String plus = String.valueOf((n+n));
                result.setText("계산결과 : "+plus);
                Toast.makeText(ctx,"더하기한 값 : "+plus,Toast.LENGTH_LONG).show();
            }
        });
        findViewById(R.id.minusbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n = Integer.parseInt(num.getText().toString());
                String minus = String.valueOf((n-n));
                result.setText(minus);
                Toast.makeText(ctx,"빼기 값 : "+minus,Toast.LENGTH_LONG).show();
            }
        });
        findViewById(R.id.multiplebtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n = Integer.parseInt(num.getText().toString());
                String multiple = String.valueOf((n*n));
                result.setText(multiple);
                Toast.makeText(ctx,"곱하기 값 : "+multiple,Toast.LENGTH_LONG).show();
            }
        });
        findViewById(R.id.dividebtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n = Integer.parseInt(num.getText().toString());
                String divide = String.valueOf((n/n));
                result.setText(divide);
                Toast.makeText(ctx,"나누기 값 : "+divide,Toast.LENGTH_LONG).show();
            }
        });
        findViewById(R.id.equalbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n = Integer.parseInt(num.getText().toString());
                String divide = String.valueOf((n/n));
                result.setText(divide);
                Toast.makeText(ctx,"나누기 값 : "+divide,Toast.LENGTH_LONG).show();
            }
        });
    }
}
