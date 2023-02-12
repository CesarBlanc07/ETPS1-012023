package sv.edu.utec.instrucciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText valorn;
    TextView incre, decre, dupli;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valorn = findViewById(R.id.edtValor);
        incre = findViewById(R.id.tvIncrementar);
        decre = findViewById(R.id.tvDecrementar);
        dupli = findViewById(R.id.tvDuplicar);
    }

    public void instruccion(View v)
    {
        String val = valorn.getText().toString();
        int resultado1, resultado2, resultado3;
        int N = Integer.parseInt(val);

        resultado1 = N + 77;
        resultado2 = resultado1 - 3;
        resultado3 = resultado2 * 2;

        incre.setText("El incremento es de: " + String.valueOf(resultado1));
        decre.setText("El decremento es de: " + String.valueOf(resultado2));
        dupli.setText("El doble es de: " + String.valueOf(resultado3));
    }
}