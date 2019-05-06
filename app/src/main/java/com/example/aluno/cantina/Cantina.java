package com.example.aluno.cantina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cantina extends AppCompatActivity {

    private EditText nome;
    private Button adSal;
    private Button adRefri;
    private Button finalizar;
    public int valor;
    public int valorsoma;
    private TextView soma;
    private TextView nomeFinal;
    private TextView item1;
    private TextView item2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cantina);

      nome = (EditText) findViewById(R.id.nomeCliente);
       adSal = (Button) findViewById(R.id.btSalgado);
        adRefri = (Button) findViewById(R.id.btRefri);
        finalizar = (Button) findViewById(R.id.btFinalizar);
        soma = (TextView) findViewById(R.id.txtResultado);
        nomeFinal = (TextView) findViewById(R.id.txtNome);
        item1 = (TextView) findViewById(R.id.txtItem1);
       item2 = (TextView) findViewById(R.id.txtItem2);


        adSal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                     valorsoma = valorsoma+4;
                     item1.setText("Salgado - R$4,00");
                }catch (Exception e){
                }
            }
        });
        adRefri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    valorsoma = valorsoma+3;
                    item2.setText("Refrigerante - R$3,00");
                }catch (Exception e){

                }
            }
        });

        finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                 soma.setText("R$"+valorsoma);
                 nomeFinal.setText(nome.getText());
                }catch (Exception e){

                }
            }
        });


    }
}
