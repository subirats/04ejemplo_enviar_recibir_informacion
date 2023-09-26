package lluis.subirats.a04ejemplo_enviar_recibir_informacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import lluis.subirats.a04ejemplo_enviar_recibir_informacion.modelos.Direccion;

public class CrearDireccionActivity extends AppCompatActivity {
    private EditText txtCalle;
    private EditText txtNum;
    private EditText txtCiudad;
    private Button btnCrear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_direccion);

        inicializarVista();

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String calle = txtCalle.getText().toString();
                int num = Integer.parseInt(txtNum.getText().toString());
                String ciudad = txtCiudad.getText().toString(); //aqui haríamos la comrpobación si ha rellenado todos los campos

                Direccion direccion = new Direccion(calle, num, ciudad);

                Bundle bundle = new Bundle(); //maleta
                bundle.putSerializable("DIR", direccion); //como direccion no es serializable, en la clase la hacemos serializable
                Intent intent = new Intent(); //coche
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);//vuelve con la info del resultado
                finish();
            }
        });
    }

    private void inicializarVista() {
        txtCalle = findViewById(R.id.txtCalleCrear);
        txtNum = findViewById(R.id.txtNumCrear);
        txtCiudad = findViewById(R.id.txtCiudadCrear);
        btnCrear = findViewById(R.id.btnCrearDireccionCrear);
    }
}