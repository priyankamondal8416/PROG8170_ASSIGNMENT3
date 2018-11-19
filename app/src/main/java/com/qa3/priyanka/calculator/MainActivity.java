package com.qa3.priyanka.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {


    private final char ADDITION = '+';
    private final char DIVIDE = '/';
    private final char SUBTRACT = '-';
    private final char MULTIPLY = '*';
    private final char EQU = 0;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button dot;
    private Button equal;
    private Button add;
    private Button divide;
    private Button multiply;
    private Button subtract;
    private TextView info;
    private TextView result;
    private Button clear;
    private double valueOne = Double.NaN;
    private double valueTwo;

    private char ACTION;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        keypadSetupView();

        // set lister for all buttons

        // zero
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "0");
            }
        });

        // one
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "1");
            }
        });

        // two
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "2");
            }
        });

        // three
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "3");
            }
        });

        // four
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "4");
            }
        });


        // five
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "5");
            }
        });


        // six
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "6");
            }
        });

        // seven
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "7");
            }
        });

        // eight
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "8");
            }
        });

        // nine
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "9");
            }
        });

        // dot
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + ".");
            }
        });


        // add
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculate();
                ACTION = ADDITION;
                if (!Double.isNaN(valueOne) && String.valueOf(valueOne).length() > 0) {
                    result.setText(String.valueOf(valueOne) + ACTION);
                    info.setText(null);
                }
            }
        });

        // subtract
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculate();
                ACTION = SUBTRACT;
                if (!Double.isNaN(valueOne) && String.valueOf(valueOne).length() > 0) {
                    result.setText(String.valueOf(valueOne) + ACTION);
                    info.setText(null);
                }
            }
        });

        // multiply
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculate();
                ACTION = MULTIPLY;
                if (!Double.isNaN(valueOne) && String.valueOf(valueOne).length() > 0) {
                    result.setText(String.valueOf(valueOne) + ACTION);
                    info.setText(null);
                }
            }
        });

        // divide
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculate();
                ACTION = DIVIDE;
                if (!Double.isNaN(valueOne) && String.valueOf(valueOne).length() > 0) {
                    result.setText(String.valueOf(valueOne) + ACTION);
                    info.setText(null);
                }
            }
        });

        // equal
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ((Double.isNaN(valueTwo) || valueTwo == 0.0) && info.getText().length() > 0) {
                    valueTwo = Double.parseDouble(info.getText().toString());
                }

                if (valueOne != 0.0 && result.getText().length() > 0 && String.valueOf(valueTwo).length() > 0 && String.valueOf(valueOne).length() > 0) {

                    calculate();
                    ACTION = EQU;
                    result.setText(result.getText().toString() + String.valueOf(valueTwo) + "=" + String.valueOf(valueOne));
                    info.setText(null);
                }

            }
        });

        // clear
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (info.getText().length() > 0) {
                    CharSequence name = info.getText().toString();
                    info.setText(name.subSequence(0, name.length() - 1));
                } else {
                    valueOne = Double.NaN;
                    valueTwo = Double.NaN;
                    info.setText(null);
                    result.setText(null);
                }
            }
        });
    }

    private void keypadSetupView() {
        one = (Button) findViewById(R.id.buttonOne);
        two = (Button) findViewById(R.id.buttonTwo);
        three = (Button) findViewById(R.id.buttonThree);
        four = (Button) findViewById(R.id.buttonFour);
        five = (Button) findViewById(R.id.buttonFive);
        six = (Button) findViewById(R.id.buttonSix);
        seven = (Button) findViewById(R.id.buttonSeven);
        eight = (Button) findViewById(R.id.buttonEight);
        nine = (Button) findViewById(R.id.buttonNine);
        zero = (Button) findViewById(R.id.buttonZero);
        dot = (Button) findViewById(R.id.buttonDot);
        add = (Button) findViewById(R.id.buttonAdd);
        subtract = (Button) findViewById(R.id.buttonSubtract);
        multiply = (Button) findViewById(R.id.buttonMultiply);
        divide = (Button) findViewById(R.id.buttonDivide);
        equal = (Button) findViewById(R.id.buttonEqual);
        info = (TextView) findViewById(R.id.infoTextView);
        result = (TextView) findViewById(R.id.resulTextView);
        clear = (Button) findViewById(R.id.buttonClear);
    }

    // CALCULATE
    private void calculate() {
        if (!Double.isNaN(valueOne) && valueOne != 0.0 && info.getText().length() > 0) {
            valueTwo = Double.parseDouble(info.getText().toString());
            Calculator calculator = new Calculator();
            switch (ACTION) {
                case ADDITION:
                    valueOne = calculator.addition(valueOne, valueTwo);
                    break;
                case SUBTRACT:
                    valueOne = calculator.subtraction(valueOne, valueTwo);
                    break;
                case MULTIPLY:
                    valueOne = calculator.multiplication(valueOne, valueTwo);
                    break;
                case DIVIDE:
                    valueOne = calculator.division(valueOne, valueTwo);
                    break;
                case EQU:
                    break;
            }
        } else if (info.getText().toString().length() > 0) {
            valueOne = Double.parseDouble(info.getText().toString());
        }
    }
}
