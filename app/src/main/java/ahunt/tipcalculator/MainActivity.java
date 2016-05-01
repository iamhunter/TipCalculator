package ahunt.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);



    }

    public void onButtonClick(View v){
        EditText e1 = (EditText)findViewById(R.id.editText);
        EditText e2 = (EditText)findViewById(R.id.editText2);

        TextView t1 = (TextView)findViewById(R.id.textView);
        TextView t2 = (TextView)findViewById(R.id.textView2);


        assert e1 != null;
        assert e2 != null;

        double total = Integer.parseInt(e1.getText().toString());
        double percent = Integer.parseInt(e2.getText().toString());

        double totalWithTip = total + ((total * percent) / 100);
        double tip = ((total * percent) / 100);

        assert t1 != null;
        assert t2 != null;

        t1.setText(Double.toString(totalWithTip));
        t2.setText(Double.toString(tip));
    }
}
