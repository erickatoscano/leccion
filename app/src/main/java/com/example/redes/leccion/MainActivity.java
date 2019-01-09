package com.example.redes.leccion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView ivSA,ivCC, ivRC, ivCTi;
    public static final String EXTRA_MESSAGE = "com.example.administrador.myapplication.MESSAGE";

    private String[] avatars;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        avatars= getResources().getStringArray(R.array.avatares);

        ivSA=(ImageView) findViewById(R.id.avatar1);
        ivCC=(ImageView) findViewById(R.id.avatar2);
        ivRC=(ImageView) findViewById(R.id.avatar3);

        ivSA.setOnClickListener(this);
        ivCC.setOnClickListener(this);
        ivRC.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch(id) {
            case R.id.avatar1:
                Intent intent1 = new Intent(this, animal.class);
                intent1.putExtra(EXTRA_MESSAGE, avatars[0].toString());
                startActivity(intent1);
                break;
            case R.id.avatar2:
                Intent intent2 = new Intent(this, animal.class);
                intent2.putExtra(EXTRA_MESSAGE, avatars[1].toString());
                startActivity(intent2);
                break;
            case R.id.avatar3:
                Intent intent3 = new Intent(this, animal.class);
                intent3.putExtra(EXTRA_MESSAGE, avatars[2].toString());
                startActivity(intent3);
                break;

        }
    }
}
