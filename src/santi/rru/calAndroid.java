package santi.rru;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import santi.rru.*;
public class calAndroid extends Activity {
Button bt1,bt2,bt3,bt4;
EditText et1,et2,et3;
Double sum;
cal c=new cal();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        bt1=(Button)findViewById(R.id.Button01);
        bt2=(Button)findViewById(R.id.Button02);
        bt3=(Button)findViewById(R.id.Button03);
        bt4=(Button)findViewById(R.id.Button04);
        et1=(EditText)findViewById(R.id.EditText01);
        et2=(EditText)findViewById(R.id.EditText02);
        et3=(EditText)findViewById(R.id.EditText03);
        
        bt1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				sum=c.add(Double.parseDouble(et1.getText().toString()), Double.parseDouble(et2.getText().toString()));
				et3.setText(String.valueOf(sum));
				}});
        bt2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				sum=c.minus(Double.parseDouble(et1.getText().toString()), Double.parseDouble(et2.getText().toString()));
				et3.setText(String.valueOf(sum));
				}
		});
        bt3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				sum=c.multiply(Double.parseDouble(et1.getText().toString()), Double.parseDouble(et2.getText().toString()));
				et3.setText(String.valueOf(sum));
				}
		});
        bt4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				sum=c.divide(Double.parseDouble(et1.getText().toString()), Double.parseDouble(et2.getText().toString()));
				et3.setText(String.valueOf(sum));
				}
		});
    }
}