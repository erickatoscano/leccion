package com.example.redes.leccion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.redes.leccion.MainActivity.EXTRA_MESSAGE;

public class pFinal extends AppCompatActivity {

    TextView txtAnimal, txtInsecto;

    private String[] tituloAvatar;

    private int[] avatares = {
            R.drawable.a1,
            R.drawable.a2,
            R.drawable.a3,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_final);

        String animals = getResources().getString(R.string.animals);
        String insects = getResources().getString(R.string.insects);



        tituloAvatar= getResources().getStringArray(R.array.avatares);

        txtAnimal = (TextView)findViewById(R.id.txtAnimal);
        txtInsecto = (TextView)findViewById(R.id.txtInsecto);
        Intent intent = getIntent();
        String tAnimal = intent.getStringExtra("ani");
        String tInsecto = intent.getStringExtra("ins");

        txtAnimal.setText(tAnimal + "/3 " +animals);
        txtInsecto.setText(tInsecto +"/3 "+insects);
    }
}
