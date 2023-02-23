package sv.edu.utec.parcialetps1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Pantalla_Formula extends AppCompatActivity
{

    EditText peso, altura;
    TextView resultado, mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_formula);
        peso = findViewById(R.id.edtPeso);
        altura = findViewById(R.id.edtAltura);
        resultado = findViewById(R.id.txvResultado);
        mensaje = findViewById(R.id.txvInfo);
    }

    public void calcular(View v)
    {
        String val1 = peso.getText().toString();
        String val2 = altura.getText().toString();
        double num1 = Double.parseDouble(val1);
        double num2 = Double.parseDouble(val2);
        double IMC;
        String total = "";

        IMC = (num1)/(num2 * num2);

        if(IMC < 10.5)
        {
            total = "El resultado es: " + IMC;
            mensaje.setText("Criticamente bajo de peso");
        }

        if(IMC > 10.5 && IMC < 15.9)
        {
            total = "El resultado es: " + IMC;
            mensaje.setText("Severamente bajo de peso");
        }

        if(IMC > 15.9 && IMC < 18.5)
        {
            total = "El resultado es: " + IMC;
            mensaje.setText("Bajo de peso");
        }

        if(IMC > 18.5 && IMC < 25)
        {
            total = "El resultado es: " + IMC;
            mensaje.setText("Normal (peso saludable)");
        }

        if(IMC > 25 && IMC < 30)
        {
            total = "El resultado es: " + IMC;
            mensaje.setText("Sobrepeso");
        }

        if(IMC > 30 && IMC < 35)
        {
            total = "El resultado es: " + IMC;
            mensaje.setText("Obesidad Clase 1 - Moderadamente Obeso");
        }

        if(IMC > 35 && IMC < 50)
        {
            total = "El resultado es: " + IMC;
            mensaje.setText("Obesidad Clase 2 - Severamente Obeso");
        }

        if(IMC > 50)
        {
            total = "El resultado es: " + IMC;
            mensaje.setText("Obesidad Clase 3 - Criticamente Obeso");
        }

        resultado.setText(total);
    }
}