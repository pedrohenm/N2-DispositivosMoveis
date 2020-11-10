package com.example.provadispositivosmoveis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editUsuario;
    private EditText editSenha;
    private Button button;
    private TextView txtResposta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String usuario = "Pedro";
        final String senha = "123456";

        txtResposta = findViewById(R.id.txtResposta);
        editUsuario = findViewById(R.id.editUsuario);
        editSenha = findViewById(R.id.editSenha);
        button = findViewById(R.id.btnEntrar);

        editUsuario.setHint("Usuário");
        editSenha.setHint("Senha");

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String txtSenha = editSenha.getText().toString();
                String txtUsuario = editUsuario.getText().toString();

                if(txtUsuario.equals(usuario) && txtSenha.equals(senha)){
                    txtResposta.setVisibility(View.VISIBLE);
                    txtResposta.setText("Login efetuado com sucesso!");
                }
                else{
                    txtResposta.setVisibility(View.VISIBLE);
                    txtResposta.setText("Usuário ou senha inválido.");
                }
            }
        };

        button.setOnClickListener(onClickListener);
    }
}