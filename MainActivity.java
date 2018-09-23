package com.example.lab08.androidalertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

/* Burhan GÖK

  burhangok@yahoo.com
  İstanbul 2018

   */
    public Button satisButonu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        satisButonu=findViewById(R.id.satinAl);

        satisButonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder uyariPenceresi = new AlertDialog.Builder(MainActivity.this);
                uyariPenceresi.setTitle("UYARI");
                uyariPenceresi.setMessage("Satın alma işlemini onaylıyor musunuz ?");
                uyariPenceresi.setIcon(R.drawable.ic_launcher_background);
                uyariPenceresi.setPositiveButton("EVET", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "İşlem Onaylandı.", Toast.LENGTH_SHORT).show();
                    }
                });

                uyariPenceresi.setNegativeButton("HAYIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "İşlem İptal Edildi !", Toast.LENGTH_LONG).show();

                    }
                });

                uyariPenceresi.setNeutralButton("VAZGEÇ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "İşlemden vazgeçildi !", Toast.LENGTH_SHORT).show();
                    }
                });
                uyariPenceresi.show();
            }
        });
    }
}
