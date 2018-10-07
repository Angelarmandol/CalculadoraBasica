package com.example.angel.calculadorabasica;

import android.util.Log;
import android.widget.EditText;

import junit.framework.TestCase;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */


public class ExampleUnitTest extends TestCase {

    @Rule
    public MainActivity TestMainActivity = new MainActivity();




    @Test
    public void testAddition_isCorrect() {;

        TestMainActivity.suma();


    int res = Integer.parseInt(TestMainActivity.resultado.toString());

        assertEquals(10, TestMainActivity.resultado);

    }


}