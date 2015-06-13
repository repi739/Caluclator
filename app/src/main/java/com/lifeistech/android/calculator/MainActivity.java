package com.lifeistech.android.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity{

    int number1;
    int ope;
    int number2;
    int answer;

    TextView num1Text;
    TextView opeText;
    TextView num2Text;
    TextView answerText;


    //初期化
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //変数の初期化
        number1 = 0;
        number2 = 0;
        answer = 0;
        ope = 0;

        //関連付け
        num1Text = (TextView)findViewById(R.id.num1);
        opeText = (TextView)findViewById(R.id.ope);
        num2Text = (TextView)findViewById(R.id.num2);
        answerText = (TextView)findViewById(R.id.answer);

        //ラベルの値を初期状態に
        num1Text.setText("0");
        opeText.setText("");
        num2Text.setText("");
        answerText.setText("");

    }



    //1を押したとき
    public void bt1(View v) {
        if (ope == 0) {
                number1 = number1*10 + 1;
                num1Text.setText(number1+"");
        } else if (ope > 0) {
                number2 = number2 * 10 + 1;
                num2Text.setText(number2 + "");
        }
    }
    //2を押したとき
    public void bt2(View v) {
        if (ope == 0) {
            number1 = number1*10 + 2;
            num1Text.setText(number1+"");
        } else if (ope > 0) {
            number2 = number2 * 10 + 2;
            num2Text.setText(number2 + "");
        };
    }
    //3を押したとき
    public void bt3(View v) {
        if (ope == 0) {
            number1 = number1*10 + 3;
            num1Text.setText(number1+"");
        } else if (ope > 0) {
            number2 = number2 * 10 + 3;
            num2Text.setText(number2 + "");
        }
    }
    //4を押したとき
    public void bt4(View v) {
        if (ope == 0) {
            number1 = number1*10 + 4;
            num1Text.setText(number1+"");
        } else if (ope > 0) {
            number2 = number2 * 10 + 4;
            num2Text.setText(number2 + "");
        }
    }
    //5を押したとき
    public void bt5(View v) {
        if (ope == 0) {
            number1 = number1*10 + 5;
            num1Text.setText(number1+"");
        } else if (ope > 0) {
            number2 = number2 * 10 + 5;
            num2Text.setText(number2 + "");
        }
    }
    //6を押したとき
    public void bt6(View v) {
        if (ope == 0) {
            number1 = number1*10 + 6;
            num1Text.setText(number1+"");
        } else if (ope > 0) {
            number2 = number2 * 10 + 6;
            num2Text.setText(number2 + "");
        }
    }
    //7を押したとき
    public void bt7(View v) {
        if (ope == 0) {
            number1 = number1*10 + 7;
            num1Text.setText(number1+"");
        } else if (ope > 0) {
            number2 = number2 * 10 + 7;
            num2Text.setText(number2 + "");
        }
    }
    //8を押したとき
    public void bt8(View v) {
        if (ope == 0) {
            number1 = number1*10 + 8;
            num1Text.setText(number1+"");
        } else if (ope > 0) {
            number2 = number2 * 10 + 8;
            num2Text.setText(number2 + "");
        }
    }
    //9を押したとき
    public void bt9(View v) {
        if (ope == 0) {
            number1 = number1*10 + 9;
            num1Text.setText(number1+"");
        } else if (ope > 0) {
            number2 = number2 * 10 + 9;
            num2Text.setText(number2 + "");
        }
    }
    //0を押したとき
    public void bt0(View v) {
        if (ope == 0) {
            number1 = number1*10;
            num1Text.setText(number1+"");
        } else if (ope > 0) {
            number2 = number2 * 10;
            num2Text.setText(number2 + "");
        }
    }

    //opeの管理：四則演算
    //「＋」ボタンが押された時
    public void btplus (View v) {
        ope = 1;
        opeText.setText("+");
        num2Text.setText("");
    }

    //『－』ボタンが押されたとき
    public void btminus (View v) {
        ope = 2;
        opeText.setText("-");
        num2Text.setText("");
    }

    //『×』ボタンが押されたとき
    public void btmultiply (View v) {
        ope = 3;
        opeText.setText("*");
        num2Text.setText("");
    }

    //『÷』ボタンが押されたとき
    public void btdivide (View v) {
        ope = 4;
        opeText.setText("/");
        num2Text.setText("");
    }

    //clearを押したとき
    public void clear(View v) {
        ope = 0;
        answer = 0;
        number1 = 0;
        number2 = 0;
        opeText.setText("");
        num1Text.setText("0");
        num2Text.setText("");
        answerText.setText("");
    }


    //『＝』の管理
    public void btequal(View v){
        if(ope == 1) {
            answer = number1 + number2;
            answerText.setText("=" + answer);
            ope = -1;
        }
        if(ope == 2){
            answer = number1 - number2;
            answerText.setText("=" + answer);
            ope = -1;
        }
        if(ope == 3){
            answer = number1 * number2;
            answerText.setText("=" + answer);
            ope = -1;
        }
        if(ope == 4){
            answer = number1 / number2;
            answerText.setText("=" + answer);
            ope = -1;
        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
