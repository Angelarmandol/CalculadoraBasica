package com.example.angel.calculadorabasica;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {

    int enteroNumero1;
    int enteroNumero2;


    @BindView(R.id.resultado)
    TextView resultado;
    @BindView(R.id.numero1)
    TextView numero1;
    @BindView(R.id.numero2)
    TextView numero2;
    @BindView(R.id.btn_Multi)
    Button bn_Multi;
    @BindView(R.id.btn_Divi)
    Button bn_Divi;
    @BindView(R.id.btn_Resta)
    Button bn_Resta;
    @BindView(R.id.btn_Suma)
    Button bn_Suma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);



    }// end onCreate


    @OnClick(R.id.btn_Multi)
    public void multiplicacion() {
        getNumbers();
        int result = 0;
        try {
            if ((enteroNumero1 > 0) && (enteroNumero2 > 0)) {
                result = (enteroNumero1 * enteroNumero2);
                Toast toast3 =
                        Toast.makeText(getApplicationContext(),
                                "el valor de la multiplicacion es : " + result, Toast.LENGTH_SHORT);
                toast3.show();
            }

        } catch (NumberFormatException e) {
            resultado.setText("Error");
            Log.d("APP_CALCULATOR", "Error al realizar miltiplicacion");
            Toast toast4 =
                    Toast.makeText(getApplicationContext(),
                            "falo la multiplicacion", Toast.LENGTH_SHORT);
            toast4.show();
        }
        Log.d("APP_CALCULATOR", "Mulipliccion----------"+result);
        resultado.setText(""+result);
    }





    @OnClick(R.id.btn_Divi)
    public void division() {
        getNumbers();
        float result = 0;
        try {
            if ((enteroNumero1 > 0) && (enteroNumero2 > 0)) {
                result =  ((float)enteroNumero1 / (float)enteroNumero2);
                Log.d("APP_CALCULATOR", "Resultado de la division----------- "+result);
                Toast toast3 =
                        Toast.makeText(getApplicationContext(),
                                "el valor de la division es : " + result, Toast.LENGTH_SHORT);
                toast3.show();
            }

        } catch (NumberFormatException e) {
            resultado.setText("Error");
            Log.d("APP_CALCULATOR", "Error al realizar division");
            Toast toast4 =
                    Toast.makeText(getApplicationContext(),
                            "falo la division", Toast.LENGTH_SHORT);
            toast4.show();
        }
        resultado.setText(""+result);
    }

    @OnClick({R.id.btn_Suma})
    public void suma() {
        getNumbers();
        int result = 0;
        try {
            if ((enteroNumero1 > 0) && (enteroNumero2 > 0)) {
                result = (enteroNumero1 + enteroNumero2);
                Log.d("APP_CALCULATOR", "Resultado de la suma----------- "+result);
                Toast toast3 =
                        Toast.makeText(getApplicationContext(),
                                "el valor de la suma es : " + result, Toast.LENGTH_SHORT);
                toast3.show();
            }
        } catch (NumberFormatException e) {
            resultado.setText("Error");
            Log.d("APP_CALCULATOR", "Error al realizar suma");
            Toast toast4 =
                    Toast.makeText(getApplicationContext(),
                            "falo la suma", Toast.LENGTH_SHORT);
            toast4.show();
        }
        resultado.setText(""+result);

    }

    @OnClick({R.id.btn_Resta})
    public void resta() {
        getNumbers();
        int result = 0;
        try {
            if ((enteroNumero1 > 0) && (enteroNumero1 > 0)) {
                result = (enteroNumero1 - enteroNumero2);
                Log.d("APP_CALCULATOR", "Resultado de la resta----------- "+result);
                Toast toast3 =
                        Toast.makeText(getApplicationContext(),
                                "el valor de la resta es : " + result, Toast.LENGTH_SHORT);
                toast3.show();
            }
        } catch (NumberFormatException e) {
            resultado.setText("Error");
            Log.d("APP_CALCULATOR", "Error al realizar suma");
            Toast toast4 =
                    Toast.makeText(getApplicationContext(),
                            "falo la resta" + result, Toast.LENGTH_SHORT);
            toast4.show();
        }
        resultado.setText(""+result);

    }


    public void getNumbers() {
        String a = numero1.getText().toString();
        String b = numero2.getText().toString();

        try {
            enteroNumero1 = (int) Integer.parseInt(a);
        } catch (Exception e) {
            resultado.setText("no paso el parseo new " + a);
        }

        try {
            enteroNumero2 = (int) Integer.parseInt(b);
        } catch (Exception e) {
            resultado.setText("no paso el parseo new " + b);
        }

        Toast toast1 =
                Toast.makeText(getApplicationContext(),
                        "el valor de c es: " + enteroNumero1, Toast.LENGTH_SHORT);
        toast1.show();

        Toast toast2 =
                Toast.makeText(getApplicationContext(),
                        "el valor de d es: " + enteroNumero2, Toast.LENGTH_SHORT);
        toast2.show();

    }


}
