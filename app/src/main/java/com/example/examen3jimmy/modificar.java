package com.example.examen3jimmy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class modificar extends AppCompatActivity {

    private Context context;
    private EditText txtDescripcion, txtCantidad, txtTiempo, txtPeriocidad;
    private Button btnRegistrar;

    private  Medicamentos medicamentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificar);


        txtDescripcion = findViewById(R.id.txtDescripciond);
        txtCantidad = findViewById(R.id.txtCantidadd);
        txtTiempo = findViewById(R.id.txtTiempod);
        txtPeriocidad = findViewById(R.id.txtPeriocidadd);
        context = getApplicationContext();

        medicamentos = (Medicamentos) getIntent().getExtras().getSerializable("itemDetalle");


        //Glide.with(this.context).load(user.getUrl()).into(holder.foto);
        // Glide.with (context) .load (user.getUrl()).into(foto);
        txtDescripcion.setText(medicamentos.getDescripcion());
        txtCantidad.setText(medicamentos.getCantidad());
        txtTiempo.setText(medicamentos.getTiempo());
        txtPeriocidad.setText(medicamentos.getPeriocidad());
    }
}