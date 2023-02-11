package sv.edu.utec.bienvenida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText nombre;
    Button ingresar;
    TextView mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.edtNombre);
        mensaje = findViewById(R.id.tvMensaje);
    }

    public void bienvenida(View v)
    {
        String men = nombre.getText().toString();

        mensaje.setText("Bienvenido " + String.valueOf(men));

    }
}