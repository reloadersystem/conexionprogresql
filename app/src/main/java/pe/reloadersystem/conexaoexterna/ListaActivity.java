package pe.reloadersystem.conexaoexterna;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ListaActivity extends AppCompatActivity {

    private ListView listViewUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        this.listViewUsuario = findViewById(R.id.listViewUsuario);

        this.listViewUsuario.setAdapter(new UsuarioAdapter(this,new Usuario().getLista()));



    }
}
