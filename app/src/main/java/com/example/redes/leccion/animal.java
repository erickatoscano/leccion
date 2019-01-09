package com.example.redes.leccion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.redes.leccion.MainActivity.EXTRA_MESSAGE;

public class animal extends AppCompatActivity implements View.OnClickListener {

    ImageView avatarEscogido, animalEscogido1, animalEscogido2,animalEscogido3, insectoEscogido1,insectoEscogido2,insectoEscogido3;
    Button btn_validar;
    int insecto=0;
    int animal=0;
    int contI1=0;
    int contI2=0;
    int contI3=0;

    int contA1=0;
    int contA2=0;
    int contA3=0;

    private String[] tituloAvatar;

    private int[] avatares = {
            R.drawable.a1,
            R.drawable.a2,
            R.drawable.a3,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);

        String correcto = getResources().getString(R.string.correct);
        String incorrecto = getResources().getString(R.string.incorrect);


        tituloAvatar= getResources().getStringArray(R.array.avatares);

        // A V A T A R E S
        avatarEscogido = (ImageView)findViewById(R.id.avatarEscogido);
        animalEscogido1 =  (ImageView)findViewById(R.id.animal1);
        animalEscogido2 =  (ImageView)findViewById(R.id.animal2);
        animalEscogido3 =  (ImageView)findViewById(R.id.animal3);

        insectoEscogido1 =  (ImageView)findViewById(R.id.insecto1);
        insectoEscogido2 =  (ImageView)findViewById(R.id.insecto2);
        insectoEscogido3 =  (ImageView)findViewById(R.id.insecto3);

        btn_validar = (Button)findViewById(R.id.btn_validar);


        animalEscogido1.setOnClickListener(this);
        animalEscogido2.setOnClickListener(this);
        animalEscogido3.setOnClickListener(this);

        insectoEscogido1.setOnClickListener(this);
        insectoEscogido2.setOnClickListener(this);
        insectoEscogido3.setOnClickListener(this);

        btn_validar.setOnClickListener(this);

        Intent intent = getIntent();
        String message = intent.getStringExtra(EXTRA_MESSAGE);

        if (message.equals(tituloAvatar[0].toString())){
            avatarEscogido.setImageResource(avatares[0]);
        }
        if (message.equals(tituloAvatar[1].toString())){
            avatarEscogido.setImageResource(avatares[1]);
        }
        if (message.equals(tituloAvatar[2].toString())){
            avatarEscogido.setImageResource(avatares[2]);
        }



    }

    @Override
    public void onClick(View v) {

        int id=v.getId();
        switch(id) {
            case R.id.insecto1:

                if(contI1==0){
                    insecto++;
                    Toast.makeText(this, "INCORRECTO", Toast.LENGTH_LONG).show();
                }
                contI1++;
                break;
            case R.id.insecto2:

                if(contI2==0){
                insecto++;
                Toast.makeText(this, "INCORRECTO", Toast.LENGTH_LONG).show();
                }
                contI2++;
                break;
            case R.id.insecto3:

                if(contI3==0){
                insecto++;
                Toast.makeText(this, "INCORRECTO", Toast.LENGTH_LONG).show();
                }
                contI3++;
                break;

            case R.id.animal1:

                if(contA1==0){
                animal++;
                Toast.makeText(this, "CORRECTO", Toast.LENGTH_LONG).show();
                }
                contA1++;
                break;
            case R.id.animal2:

                if(contA2==0){
                animal++;
                Toast.makeText(this, "CORRECTO", Toast.LENGTH_LONG).show();
                }
                contA2++;
                break;
            case R.id.animal3:

                if(contA3==0){
                animal++;
                Toast.makeText(this, "CORRECTO", Toast.LENGTH_LONG).show();
                }
                contA3++;
                break;
            case R.id.btn_validar:
                Intent intent = new Intent(this, pFinal.class);
                String aniS=""+animal;
                String insS=""+insecto;
                intent.putExtra("ani", aniS);
                intent.putExtra("ins", insS);
                startActivity(intent);


                break;

        }
    }
}
