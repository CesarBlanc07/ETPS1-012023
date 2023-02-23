package sv.edu.utec.parcialetps1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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

        ingresar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                ejercicio();
            }
        });

    }

    public void ejercicio()
    {
        String user, pass;
        user = usuario.getText().toString();
        pass = contra.getText().toString();

        if(user.equals("parcialETps1") && pass.equals("p4rC14l#tp$"))
        {
            Intent intento = new Intent();
            intento = new Intent(this,Pantalla_Formula.class);
            startActivity(intento);
        }
        else
        {
            Toast.makeText(this,"Contraseña o usuario incorrectos",Toast.LENGTH_LONG).show();
        }
    }
}