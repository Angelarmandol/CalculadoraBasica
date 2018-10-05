package com.example.angel.calculadorabasica;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    int a = 0;
    int b = 0;


    TextView resultado;
    EditText numero1, numero2;
    Button buttonMulti, buttonDivi, buttonResta, buttomSuma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        resultado =(TextView) findViewById(R.id.resultado);
        numero1 = (EditText) findViewById(R.id.numero1);
        numero2 = (EditText) findViewById(R.id.numero2);

        buttonMulti = (Button) findViewById(R.id.buttonMulti);
        buttonDivi = (Button) findViewById(R.id.buttonDivi);
        buttonResta = (Button) findViewById(R.id.buttonResta);
        buttomSuma = (Button) findViewById(R.id.buttomSuma);


        buttonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               a =  Integer.parseInt(numero1.getText().toString());
               b =  Integer.parseInt(numero2.getText().toString());
                multiplicacion(a,b);

            }
        });





    }// end onCreate


    public void multiplicacion(int datoA,int datoB){
        int result =0;
        try {
            if ((datoA > 0) && (datoB > 0)) {
                result = datoB + datoB;
                resultado.setText(result);
            }


        } catch (NumberFormatException e) {
            resultado.setText("Error");
            Log.d("APP_CALCULATOR", "Error al realizar suma");
        }



    }
}
