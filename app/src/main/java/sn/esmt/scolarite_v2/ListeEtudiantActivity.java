package sn.esmt.scolarite_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListeEtudiantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_etudiant);
        Button retour_liste_btn = (Button) findViewById(R.id.retour_liste_btn);
        retour_liste_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListeEtudiantActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}