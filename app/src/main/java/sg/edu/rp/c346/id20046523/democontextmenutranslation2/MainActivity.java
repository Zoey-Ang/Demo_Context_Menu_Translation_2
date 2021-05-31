package sg.edu.rp.c346.id20046523.democontextmenutranslation2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView tvTranslatedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTranslatedText=findViewById(R.id.textViewTranslatedText);
        registerForContextMenu(tvTranslatedText); //to invoke the context menu after long press
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        //menu.add(0,0,0,"English");

        getMenuInflater().inflate(R.menu.menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.EnglishSelection)
        {
            tvTranslatedText.setText("Hello");
        }
        else if(id==R.id.ItalianSelection)
        {
            tvTranslatedText.setText("Ciao");
        }
        return super.onContextItemSelected(item);
    }
}