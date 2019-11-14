package br.com.etecia.appcomidajaponesa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.idToolBar);
        setSupportActionBar(toolbar);
    }
    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.mPesquisar:
                Toast.makeText(getApplicationContext(), "Cliquei no alterar",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mAtualizar:
                Toast.makeText(getApplicationContext(), "Cliquei no alterar",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mCompartilhar:
                Toast.makeText(getApplicationContext(), "Cliquei no alterar",
                        Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
