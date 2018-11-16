package fr.wildcodeschool.blablawild;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ItinerarySearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerary_search);
        final Button validate = findViewById(R.id.button);
        final EditText departure = findViewById(R.id.depInput);
        final EditText destination = findViewById(R.id.destInput);

        validate.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;

                if(TextUtils.isEmpty(departure.getText().toString()) || TextUtils.isEmpty(destination.getText().toString())){
                    Toast.makeText(context, R.string.toast, duration).show();
                }else{
                    Intent i = new Intent(ItinerarySearchActivity.this, ItineraryListActivity.class);
                    i.putExtra(getString(R.string.departure),departure.getText().toString());
                    i.putExtra(getString(R.string.destination), destination.getText().toString());
                    startActivity(i);
                }
        };
    });
    }

}