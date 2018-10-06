package com.example.angel.calculadorabasica;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {




    @BindView(R.id.resultado) TextView resultado;
    @BindView(R.id.numero1) TextView numero1;
    @BindView(R.id.numero2) TextView numero2;
    @BindView(R.id.buttonMulti) Button bn_Multi;
    @BindView(R.id.buttonDivi) Button bn_Divi;
    @BindView(R.id.buttonResta) Button bn_Resta;
    @BindView(R.id.buttomSuma) Button bn_Suma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);



        /*
        buttonMulti.setOnClickListener(new View.OnClickListener() {

            int numeroUno = 0;
            int numeroDos = 0;


            @Override
            public void onClick(View v) {

                String a = numero1.getText().toString();
                String b = numero2.getText().toString();




                try {
                    int d = Integer.parseInt(b);
                }catch(Exception e){
                    resultado.setText("no paso el parseo new "+b);
                }



                try {
                    int c = Integer.parseInt(a);
                }catch(Exception e){
                    resultado.setText("no paso el parseo new "+a);
                }

                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                "el valor de a es: "+numero1, Toast.LENGTH_SHORT);

                toast1.show();

                Toast toast2 =
                        Toast.makeText(getApplicationContext(),
                                "el valor de b es: "+numero2, Toast.LENGTH_SHORT);

                toast2.show();

                //resultado.setText(""+multiplicacion(numeroUno,numeroDos));


            }
        });
*/


// falta parsearcuando es cero

    }// end onCreate


    @OnClick(R.id.buttonMulti)
    public void hacer(){
        resultado.setText("test");
        Toast toast1 =
                Toast.makeText(getApplicationContext(),
                        " test  ", Toast.LENGTH_SHORT);
    }


    public int multiplicacion(int datoA,int datoB){
        int result =0;
        try {
            if ((datoA > 0) && (datoB > 0)) {
                result = datoB * datoB;
                //toast
            }


        } catch (NumberFormatException e) {
            resultado.setText("Error");
            Log.d("APP_CALCULATOR", "Error al realizar suma");
        }

        return result;

    }
}
