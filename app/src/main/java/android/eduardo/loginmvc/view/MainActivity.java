package android.eduardo.loginmvc.view;

import android.content.Context;
import android.eduardo.loginmvc.R;
import android.eduardo.loginmvc.controller.UsuarioController;
import android.eduardo.loginmvc.datamodel.UsuarioDataModel;
import android.eduardo.loginmvc.model.Usuario;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText email, senha, nome;
    Button entrar, cadastar;
    UsuarioController controller;
    Usuario usuario;
    Context context;

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        initComponentes();

        boolean camposValidados = validarCampos();

        usuario = new Usuario();
        controller = new UsuarioController(this);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private boolean validarCampos() {

        return nome.getText().toString().isEmpty() || email.getText().toString().isEmpty() || senha.getText().toString().isEmpty();
    }

    private void initComponentes() {
        email    = findViewById(R.id.email);
        nome     = findViewById(R.id.nome);
        senha    = findViewById(R.id.senha);
        entrar   = findViewById(R.id.entrar);
        cadastar = findViewById(R.id.cadastrar);
    }
}