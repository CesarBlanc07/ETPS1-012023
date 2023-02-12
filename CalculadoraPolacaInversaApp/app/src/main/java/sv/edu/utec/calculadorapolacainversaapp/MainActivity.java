package sv.edu.utec.calculadorapolacainversaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    EditText valor1, valor2;
    TextView resultado;
    CheckBox suma, resta, multipicar, dividir;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1 = findViewById(R.id.edtValor1);
        valor2 = findViewById(R.id.edtValor2);
        resultado = findViewById(R.id.tvResultado);
        suma = findViewById(R.id.cbxSuma);
        resta = findViewById(R.id.cbxResta);
        multipicar = findViewById(R.id.cbxMulti);
        dividir = findViewById(R.id.cbxDiv);
    }

    public void operar(View v)
    {
        String val1 = valor1.getText().toString();
        String val2 = valor2.getText().toString();
        double num1 = Double.parseDouble(val1);
        double num2 = Double.parseDouble(val2);
        String total = "";

        if(suma.isChecked()==true)
        {
            double sum = num1 + num2;
            total = "El resultado es: " + sum;
        }
        if(resta.isChecked()==true)
        {
            double res = num1 - num2;
            total = "El resultado es: " + res;
        }
        if(multipicar.isChecked()==true)
        {
            double mul = num1 * num2;
            total = "El resultado es: " + mul;
        }
        if(dividir.isChecked()==true)
        {
            double div = num1 / num2;
            total = "El resultado es: " + div;
        }

        resultado.setText(total);
    }
}