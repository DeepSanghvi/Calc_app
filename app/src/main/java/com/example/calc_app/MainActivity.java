package com.example.calc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button one, two, three, four, five, six, seven, eight, nine, zero, add, sub, mul, div, mod, dot, equal, bck, clr;
    EditText disp;
    String optr;
    int op1;
    int op2;
    double op3;
    double op4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        mod = (Button) findViewById(R.id.mod);
        dot = (Button) findViewById(R.id.dot);
        equal = (Button) findViewById(R.id.equal);
        bck = (Button) findViewById(R.id.bsp);
        clr = (Button) findViewById(R.id.clr);

        disp = (EditText) findViewById(R.id.display);

        try {
            one.setOnClickListener(this);
            two.setOnClickListener(this);
            three.setOnClickListener(this);
            four.setOnClickListener(this);
            five.setOnClickListener(this);
            six.setOnClickListener(this);
            seven.setOnClickListener(this);
            eight.setOnClickListener(this);
            nine.setOnClickListener(this);
            zero.setOnClickListener(this);
            add.setOnClickListener(this);
            sub.setOnClickListener(this);
            mul.setOnClickListener(this);
            div.setOnClickListener(this);
            mod.setOnClickListener(this);
            dot.setOnClickListener(this);
            equal.setOnClickListener(this);
            clr.setOnClickListener(this);
            bck.setOnClickListener(this);


        } catch (Exception e) {

        }

    }

    public void operation() {
        if (optr.equals("+")) {
            op4 = Double.parseDouble(disp.getText().toString());
            disp.setText("");
            op3 = op3 + op4;
            disp.setText(Double.toString(op3));

        } else if (optr.equals("-")) {
            op4 = Double.parseDouble(disp.getText().toString());
            disp.setText("");
            op3 = op3 - op4;
            disp.setText(Double.toString(op3));
        } else if (optr.equals("*")) {
            op4 = Double.parseDouble(disp.getText().toString());
            disp.setText("");
            op3 = op3 * op4;
            disp.setText(Double.toString(op3));
        } else if (optr.equals("/")) {
            op4 = Double.parseDouble(disp.getText().toString());
            disp.setText("");
            op3 = op3 / op4;
            ;
            disp.setText(Double.toString(op3));
        }
    }

    @Override
    public void onClick(View v) {
        Editable str = disp.getText();

        switch (v.getId()) {

            case R.id.one:
                if (op2 != 0) {
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(one.getText());
                disp.setText(str);
                break;

            case R.id.two:
                if (op2 != 0) {
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(two.getText());
                disp.setText(str);
                break;

            case R.id.three:
                if (op2 != 0) {
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(three.getText());
                disp.setText(str);
                break;

            case R.id.four:
                if (op2 != 0) {
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(four.getText());
                disp.setText(str);
                break;

            case R.id.five:
                if (op2 != 0) {
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(five.getText());
                disp.setText(str);
                break;
            case R.id.six:
                if (op2 != 0) {
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(six.getText());
                disp.setText(str);
                break;

            case R.id.seven:
                if (op2 != 0) {
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(seven.getText());
                disp.setText(str);
                break;

            case R.id.eight:
                if (op2 != 0) {
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(eight.getText());
                disp.setText(str);
                break;

            case R.id.nine:
                if (op2 != 0) {
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(nine.getText());
                disp.setText(str);

                break;

            case R.id.zero:
                if (op2 != 0) {
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(zero.getText());
                disp.setText(str);
                break;

            case R.id.clr:
                op1 = 0;
                op2 = 0;
                op3 = 0;
                op4 = 0;
                disp.setText("");

                break;

            case R.id.add:
                optr = "+";
                if (op3 == 0) {
                    op3 = Double.parseDouble(disp.getText().toString());
                    disp.setText("");
                } else if (op4 != 0) {
                    op4 = 0;
                    disp.setText("");
                } else {
                    op4 = Double.parseDouble(disp.getText().toString());
                    disp.setText("");
                    op3 = op3 + op4;
                    disp.setText(Double.toString(op3));
                }
                break;

            case R.id.sub:
                optr = "-";
                if (op3 == 0) {
                    op3 = Double.parseDouble(disp.getText().toString());
                    disp.setText("");
                } else if (op4 != 0) {
                    op4 = 0;
                    disp.setText("");
                } else {
                    op4 = Double.parseDouble(disp.getText().toString());
                    disp.setText("");
                    op3 = op3 - op4;
                    disp.setText(Double.toString(op3));
                }
                break;

            case R.id.mul:
                optr = "*";
                if (op3 == 0) {
                    op3 = Double.parseDouble(disp.getText().toString());
                    disp.setText("");
                } else if (op4 != 0) {
                    op4 = 0;
                    disp.setText("");
                } else {
                    op4 = Double.parseDouble(disp.getText().toString());
                    disp.setText("");
                    op3 = op3 * op4;
                    disp.setText(Double.toString(op3));
                }
                break;

            case R.id.div:
                optr = "/";
                if (op3 == 0) {
                    op3 = Double.parseDouble(disp.getText().toString());
                    disp.setText("");
                } else if (op4 != 0) {
                    op4 = 0;
                    disp.setText("");
                } else {
                    op4 = Double.parseDouble(disp.getText().toString());
                    disp.setText("");
                    op3 = op3 / op4;
                    disp.setText(Double.toString(op3));
                }
                break;

            case R.id.mod:
                optr = "%";
                if (op3 == 0) {
                    op3 = Double.parseDouble(disp.getText().toString());
                    disp.setText("");
                } else if (op4 != 0) {
                    op4 = 0;
                    disp.setText("");
                } else {
                    op4 = Double.parseDouble(disp.getText().toString());
                    disp.setText("");
                    op3 = op3 % op4;
                    disp.setText(Double.toString(op3));
                }
                break;

            case R.id.equal:
                if (!optr.equals(null)) {
                    if (op4 != 0) {
                        if (optr.equals("+")) {
                            disp.setText("");
                            /*op1 = op1 + op2;*/
                            disp.setText(Double.toString(op3));
                        } else if (optr.equals("-")) {
                            disp.setText("");
                            /* op1 = op1 - op2;*/
                            disp.setText(Double.toString(op3));
                        } else if (optr.equals("*")) {
                            disp.setText("");
                            /* op1 = op1 * op2;*/
                            disp.setText(Double.toString(op3));
                        } else if (optr.equals("/")) {
                            disp.setText("");
                            /* op1 = op1 / op2;*/
                            disp.setText(Double.toString(op3));
                        } else if (optr.equals("%")) {
                            disp.setText("");
                            /* op1 = op1 % op2;*/
                            disp.setText(Double.toString(op3));
                        }
                        } else {
                            operation();
                        }
                    }
                    break;

                    case R.id.dot:
                        if (op4 != 0) {
                            op4 = 0;
                            disp.setText("");
                        }
                        str = str.append(dot.getText());
                        disp.setText(str);
                        break;

                    case R.id.bsp:
                        if (op4 != 0) {
                            op4 = 0;
                            disp.setText("");
                        }
                        // Get edit text characters
                        String textInBox = disp.getText().toString();
                        if (textInBox.length() > 0) {
                            //Remove last character//
                            String newText = textInBox.substring(0, textInBox.length() - 1);
                            // Update edit text
                            disp.setText(newText);
                        }
                        break;

                }


        }
    }