package sv.edu.utec.parcialetps1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    EditText usuario, contra;
    Button ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario = findViewById(R.id.edtUsuario);
        contra = findViewById(R.id.edtContra);
        ingresar = findViewById(R.id.btnIngresar);

    }

    public void ingresar(View v)
    {
        String nombre = usuario.getText().toString();
        String pass = contra.getText().toString();

        if(nombre.equals("parcialETps1") && pass.equals("p4rC14l#tp$"))
        {
            ingresar.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    Intent intento = new Intent(getApplicationContext(), Pantalla_Formula.class);
                    startActivity(intento);
                }
            });
        }

        else
        {
            ingresar.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    Toast toastp = new Toast(getApplicationContext());
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.toast_mensaje,(ViewGroup) findViewById(R.id.lytMensaje));

                    TextView txtmensaje = (TextView) layout.findViewById(R.id.txvMen);
                    txtmensaje.setText("Usuario o Contraseña incorrectos");

                    toastp.setDuration(Toast.LENGTH_LONG);
                    toastp.setView(layout);
                    toastp.show();
                }
            });
        }
    }
}