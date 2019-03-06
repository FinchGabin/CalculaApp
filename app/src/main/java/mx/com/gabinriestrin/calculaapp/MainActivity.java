package mx.com.gabinriestrin.calculaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtSuma, txtResta, txtMultiplicacion, txtDivision;

    int a;
    int b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        a=10;
        b=5;
        suma(a,b);
        resta(a,b);
        multiplicacion(a,b);
        division(a,b);




    }

    private void suma(int x, int y) {
        int resultadoSuma;
        resultadoSuma = x + y;
        String sumaString;
        sumaString = Integer.toString(resultadoSuma);

        Log.d("Mis_resultados","suma "+ sumaString.toString());
        txtSuma = findViewById(R.id.textView21);
        txtSuma.setText(sumaString);

    }

    private void resta(int x, int y) {
        int resultadoResta;
        resultadoResta = x - y;
        String restaString;
        restaString = Integer.toString(resultadoResta);
        Log.d("Mis_resultados","resta "+restaString.toString());
        txtResta = findViewById(R.id.textView22);
        txtResta.setText(restaString);

    }
    private void multiplicacion(int x, int y) {
        int resultadoMultiplicacion;
        resultadoMultiplicacion = x*y;
        String multiplicacionString;
        multiplicacionString = Integer.toString(resultadoMultiplicacion);
        Log.d("Mis_resultados","multiplicacion "+ multiplicacionString.toString());
        txtMultiplicacion = findViewById(R.id.textView23);
        txtMultiplicacion.setText(multiplicacionString);

    }
    private void division(int x, int y) {
        int resultadoDivision;
        resultadoDivision = x/y;
        String divisionString;
        divisionString = Integer.toString(resultadoDivision);
        Log.d("Mis_resultados", "division "+divisionString.toString());
        txtDivision = findViewById(R.id.textView24);
        txtDivision.setText(divisionString);

    }
}
