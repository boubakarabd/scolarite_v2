package sn.esmt.scolarite_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InscriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
        Button retour_btn = (Button) findViewById(R.id.retour_inscription_btn);
        Button inscript_btn = (Button) findViewById(R.id.inscrip_btn);

        retour_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InscriptionActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        inscript_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}