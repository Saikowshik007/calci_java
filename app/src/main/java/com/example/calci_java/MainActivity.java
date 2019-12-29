package com.example.calci_java;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity {
            public int x=20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bplus, bminus, bmul, bdivide, bfact, bequals, bpower, bdot, bopen, bclose, broot, bac,vib;
        ImageButton bclear;
        final String[] t = new String[1];
        final TextView e = (TextView) findViewById(R.id.text);
        final Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        bplus = findViewById(R.id.bplus);
        bminus = findViewById(R.id.bminus);
        bmul = findViewById(R.id.bmul);
        bdot = findViewById(R.id.bdot);
        broot = findViewById(R.id.broot);
        bfact = findViewById(R.id.bfact);
        bdivide = findViewById(R.id.bdivide);
        bequals = findViewById(R.id.bequals);
        bopen = findViewById(R.id.bopen);
        bclose = findViewById(R.id.bclose);
        bpower = findViewById(R.id.bpower);
        bclear = (ImageButton) findViewById(R.id.bclear);
        bac = findViewById(R.id.bac);
        vib=findViewById(R.id.vib);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText() + "0");
                vb.vibrate(x);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText() + "1");
                vb.vibrate(x);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText() + "2");
                vb.vibrate(x);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText() + "3");
                vb.vibrate(x);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText() + "4");
                vb.vibrate(x);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText() + "5");
                vb.vibrate(x);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText() + "6");
                vb.vibrate(x);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText() + "7");
                vb.vibrate(x);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText() + "8");
                vb.vibrate(x);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText() + "9");
                vb.vibrate(x);
            }
        });
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check('+',e.getText().toString())){e.setText(e.getText() + "+");}
                else{e.setText(e.getText() + "");}
                vb.vibrate(x);
            }
        });
        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check('-',e.getText().toString())){e.setText(e.getText() + "-");}
                else{e.setText(e.getText() + "");}
                vb.vibrate(x);
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check('*',e.getText().toString())){e.setText(e.getText() + "*");}
                else{e.setText(e.getText() + "");}
                vb.vibrate(x);
            }
        });
        bdivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check('/',e.getText().toString())){e.setText(e.getText() + "/");}
                else{e.setText(e.getText() + "");}
                vb.vibrate(x);
            }
        });
        broot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText("sqrt(" + e.getText().toString() + ")");
                vb.vibrate(x);

            }
        });
        bfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check('%',e.getText().toString())){e.setText(e.getText() + "%");}
                else{e.setText(e.getText() + "");}
                vb.vibrate(x);
            }
        });
        bopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText() + "(");
                vb.vibrate(x);
            }
        });
        bclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText() + ")");
                vb.vibrate(x);
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(check('.',e.getText().toString())){e.setText(e.getText() + ".");}
                else{e.setText(e.getText() + "");}
                vb.vibrate(x);
            }
        });
        bpower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check('^',e.getText().toString())){e.setText(e.getText() + "^");}
                else{e.setText(e.getText() + "");}
                vb.vibrate(x);
            }
        });
        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = e.getText().toString();
                if(s=="Bad Expression"){e.setText("");}
                else{
                if (s.length() > 0) {
                    s = s.substring(0, s.length() - 1);
                }
                e.setText(s);
                vb.vibrate(x);
            }
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(""); vb.vibrate(x);
            }
        });
        bequals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = e.getText().toString();

                try {
                    Expression expression = new ExpressionBuilder(s).build();
                    Double result;
                    result = expression.evaluate();
                    e.setText(Double.toString(result));
                } catch (Exception ex) {
                    e.setText("Bad Expression");
                }
                vb.vibrate(x);


            }
        });

        vib.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v){
                finish();
                System.exit(0);
                vb.vibrate(x);
            }
        });
        getSupportActionBar().hide();


    }
    public boolean check(char a,String s){
        int count=0;
        for(int i =0;i<s.length();i++)
        {
            if(s.charAt(i)== a){count++;}
        }
        if (count==1){return false;}
        else
            return true;
    }
}