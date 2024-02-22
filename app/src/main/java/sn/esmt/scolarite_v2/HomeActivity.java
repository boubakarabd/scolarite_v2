package sn.esmt.scolarite_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button inscription_btn = (Button) findViewById(R.id.inscription_btn);
        Button visualisation_btn = (Button) findViewById(R.id.visualisation_btn);

        inscription_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, InscriptionActivity.class);
                startActivity(intent);
            }
        });

        visualisation_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, ListeEtudiantActivity.class);
                startActivity(intent);
            }
        });
    }
}