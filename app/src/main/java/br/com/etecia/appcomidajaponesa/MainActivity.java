package br.com.etecia.appcomidajaponesa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    GridView gridview;


    String[] txtUm = {"Genghis Khan", "Hot-Roll", "Nikorasu", "Ramen", "Robata", "Sashimi", "Shimeji", "Sushi", "Temaki", "Yakisoba"};
    int[] imgUm = {R.drawable.genghiskhan, R.drawable.hotroll, R.drawable.nikorasu, R.drawable.ramen, R.drawable.robata,
            R.drawable.sashimi, R.drawable.shimeji, R.drawable.sushi, R.drawable.temaki, R.drawable.yakisoba};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.idToolBar);
        setSupportActionBar(toolbar);


        gridview = findViewById(R.id.gdvComidas);

        CustomAdapter customAdapter = new CustomAdapter();
        gridview.setAdapter(customAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
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
    class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return imgUm.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View view1 = getLayoutInflater().inflate(R.layout.modelo_layout, null);

            TextView texto = (TextView) view1.findViewById(R.id.txtUm);
            ImageView image = (ImageView) view1.findViewById(R.id.imgUm);

            texto.setText(txtUm[position]);
            image.setImageResource(imgUm[position]);


            return view1;
        }
    }
}
