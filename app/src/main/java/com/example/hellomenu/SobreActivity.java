package com.example.hellomenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SobreActivity extends AppCompatActivity {


    private TextView textViewTitulo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

        textViewTitulo = findViewById(R.id.text_view_titulo);
        Intent intent = getIntent();
        String titulo = intent.getStringExtra("TITULO");
        textViewTitulo.setText(titulo);

    }
}
