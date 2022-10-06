package br.ulbra.visualizadordeimagens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
   ImageView imgfoto;
   Button btfoto1,btfoto2;
   TextView txinformacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgfoto = findViewById(R.id.imgfoto);
        btfoto1 = findViewById(R.id.btfoto1);
        btfoto2 =  findViewById(R.id.btfoto2);
        txinformacao =findViewById(R.id.txtinformacao);

       btfoto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgfoto.setImageResource(R.drawable.g1);
                txinformacao.setText("Foto 1");
            }
        });
        btfoto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgfoto.setImageResource(R.drawable.g2);
                txinformacao.setText("Foto 2");
            }
        });
    }
}