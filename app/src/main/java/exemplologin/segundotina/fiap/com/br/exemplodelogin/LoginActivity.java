package exemplologin.segundotina.fiap.com.br.exemplodelogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.id;
import static exemplologin.segundotina.fiap.com.br.exemplodelogin.R.string.usuario;

public class LoginActivity extends AppCompatActivity {

    EditText edtUsuario;
    EditText edtSenha;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUsuario = (EditText)findViewById(R.id.edtUsuario);
        edtSenha = (EditText)findViewById(R.id.edtSenha);
    }

    public void logar(View v) {
        String usuario = edtUsuario.getText().toString();
        String senha = edtSenha.getText().toString();

        if(usuario.toLowerCase().equals("fiap") && senha.toLowerCase().equals("fiap123")){
            Intent it = new Intent(this, MainActivity.class);
            startActivity(it);
        }else{
            Toast.makeText(this, getString(R.string.mensagem_erro), Toast.LENGTH_SHORT).show();
        }


    }
}