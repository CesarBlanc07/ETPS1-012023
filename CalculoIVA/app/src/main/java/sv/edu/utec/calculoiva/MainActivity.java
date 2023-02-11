package sv.edu.utec.calculoiva;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    EditText valor;
    TextView precio, precioIVA, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor = findViewById(R.id.edtValor);
        precio = findViewById(R.id.tvValor);
        precioIVA = findViewById(R.id.tvIVA);
        resultado = findViewById(R.id.tvTotal);
    }

    public void calculo(View v)
    {
        double preciop, precioiva, total;

        preciop = Double.parseDouble(valor.getText().toString());
        precioiva = preciop * 0.134;
        total = preciop + precioiva;

        precio.setText("El precio del producto sin iva es: $" + String.valueOf(preciop));
        precioIVA.setText("El precio del IVA es: $" + String.valueOf(precioiva));
        resultado.setText("El precio total es de: $" + String.valueOf(total));
    }
}