package com.example.alejandra.soccer_bolivia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Penalizacion extends AppCompatActivity {

    TextView penal;
    String resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penalizacion);
        penal=(TextView)findViewById(R.id.tx_penalnom);

        Bundle bundle = this.getIntent().getExtras();

        resultado=bundle.getString("valor").toString();

        penal.setText(resultado);



    }
}
