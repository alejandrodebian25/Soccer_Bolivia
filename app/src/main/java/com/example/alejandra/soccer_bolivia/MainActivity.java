package com.example.alejandra.soccer_bolivia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.media.MediaPlayer;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nombre;
    ImageView amarillo;
    ImageView rojo;
    Button butto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre=(EditText)findViewById(R.id.et_nombre);
        amarillo=(ImageView)findViewById(R.id.image_amarillo);
        rojo =(ImageView)findViewById(R.id.image_rojo);
        butto =(Button)findViewById(R.id.button);

    }


    ///////////////



    //para  ir al otro boton
    public void buscar(View view)
    {

        MediaPlayer mp=MediaPlayer.create(this,R.raw.silbido);
        mp.start();

        String nom=nombre.getText().toString();
        Intent intencion =new Intent(getApplication(),Penalizacion.class);
        intencion.putExtra("valor", nom);

        startActivity(intencion);
    }

    ///para la accion del boton

    public void onClick(View arg0) {
        // TODO Auto-generated method stub
        switch (arg0.getId())
        {


            case R.id.button:

                //romper a mi cerditoooo porky
                if(butto==null)
                {

                    Toast toast=Toast.makeText(this, "Introduzca un nombre",Toast.LENGTH_SHORT);
                    toast.show();


                }



                break;}}

    //para ir a la imagen
    public void Image_amarillo(View view)
    {
        MediaPlayer ma=MediaPlayer.create(this,R.raw.amarilla);
        ma.start();

        Intent i=new Intent(getApplicationContext(),TarjetaAmarilla.class);

        startActivity(i);
    }

    public void Image_rojo(View view)
    {
        MediaPlayer mb=MediaPlayer.create(this,R.raw.roja);
        mb.start();
        Intent intencion=new Intent(getApplicationContext(),TarjetaRoja.class);
        startActivity(intencion);
    }



}

