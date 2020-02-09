package com.example.mylibrary_test;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.work_page.work;

public class MainActivity extends AppCompatActivity {

    private EditText add_a;
    private EditText add_b;
    private EditText add_result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.initView();
    }

    private void initView(){
        add_a=findViewById(R.id.add_num_a_edittext);
        add_b=findViewById(R.id.add_num_b_edittext);
        add_result=findViewById(R.id.add_num_result_edittext);
    }

    public void onClickSureButton(View view){
        String str_a=add_a.getText().toString();
        String str_b=add_b.getText().toString();

        if(str_a.length()==0||str_b.length()==0) {
            Toast.makeText(MainActivity.this,"请正确输入加数以及被加数",Toast.LENGTH_SHORT).show();
        }
        else {
            double dou_a=Double.parseDouble(str_a);
            double dou_b=Double.parseDouble(str_b);

            work cacul=new work();

            double dou_result=cacul.addition(dou_a,dou_b);

            String str_result=Double.toString(dou_result);

            add_result.setText(str_result);

            Toast.makeText(MainActivity.this,"计算完成！",Toast.LENGTH_SHORT).show();
        }
    }
}
