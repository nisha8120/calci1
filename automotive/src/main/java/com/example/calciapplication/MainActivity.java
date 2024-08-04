package com.example.calciapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView inputText , outputText;

    private String input , output , newOutput;

    private Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,buttonAdd,
    buttonMultiply ,buttonSubs, buttonDivision, buttonpoint, buttonpower, buttonequal, buttonpercent,buttonclear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText=findViewById(R.id.input_text);
        outputText=findViewById(R.id.output_text);

        button0=findViewById(R.id.btn0);
        button1=findViewById(R.id.btn1);
        button2=findViewById(R.id.btn2);
        button3=findViewById(R.id.btn3);
        button4=findViewById(R.id.btn4);
        button5=findViewById(R.id.btn5);
        button6=findViewById(R.id.btn6);
        button7=findViewById(R.id.btn7);
        button8=findViewById(R.id.btn8);
        button9=findViewById(R.id.btn9);
        buttonAdd=findViewById(R.id.addition_btn);
        buttonMultiply=findViewById(R.id.multiply_btn);
        buttonDivision=findViewById(R.id.division_btn);
        buttonSubs=findViewById(R.id.subtraction_btn);
        buttonpoint=findViewById(R.id.btnpoint);
        buttonpower=findViewById(R.id.power_btn);
        buttonequal=findViewById(R.id.equal_btn);
        buttonpercent=findViewById(R.id.percent_btn);
        buttonclear=findViewById(R.id.clear_btn);

    }
    public void onbuttonclicked(View view){

        Button button = (Button) view;
        String data = button.getText().toString();
        switch (data){
            case "C":
                input=null;
                output=null;
                outputText.setText("");
                break;

            case "^":
                input+="^";
               solve();
               break;
            case "*":
                input+="*";
                solve();
                break;

            case "=":
                solve();
                break;

            case "%":
                input+="%";
                double d = Double.parseDouble(inputText.getText().toString()) / 100;
                outputText.setText(String.valueOf(d));
                break;

            default:
                if(input == null){
                    input = "";
                }
                if (data.equals("+") || data.equals("/") || data.equals("-")){
                    solve();
                }
                input +=data;

        }
        inputText.setText(input);
    }
    private void solve(){


    }
}