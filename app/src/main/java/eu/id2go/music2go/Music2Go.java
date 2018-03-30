package eu.id2go.music2go;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Music2Go extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_music2_go.xml layout file
        setContentView(R.layout.activity_music2_go);

        // Find the View that shows the pop category
        TextView pop = (TextView) findViewById(R.id.pop);

        // Set a click listener on that View
        pop.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent popIntent = new Intent(Music2Go.this, PopActivity.class);
                // Start the new activity
                startActivity(popIntent);
            }
        });

    }
}
