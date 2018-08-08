package com.vaz.felipe.gerenciamentodecontas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    Button btExtrsto, btvisualisarconsulta, btdeslogar;
    Intent iTelaExtrato, iTelaVisualisarConsulta, iTelaLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btExtrsto = (Button) findViewById(R.id.btn_extrato);
        btExtrsto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iTelaExtrato = new Intent(Menu.this,
                        Extrato.class);
                startActivity(iTelaExtrato);
            }
        });

    }
}
