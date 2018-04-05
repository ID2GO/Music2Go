package eu.id2go.music2go;

import android.app.Activity;
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
        TextView pop = findViewById(R.id.pop);

        // Set a click listener on pop View
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

        // Find the View that shows the pop category
        TextView rock = findViewById(R.id.rock);

        // Set a click listener on rock View
        rock.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent rockIntent = new Intent(Music2Go.this, RockActivity.class);
                // Start the new activity
                startActivity(rockIntent);
            }
        });

        // Find the View that shows the pop category
        TextView blues = findViewById(R.id.blues);

        // Set a click listener on rock View
        blues.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent bluesIntent = new Intent(Music2Go.this, BluesActivity.class);
                // Start the new activity
                startActivity(bluesIntent);
            }
        });

        // Find the View that shows the pop category
        TextView jazz = findViewById(R.id.jazz);

        // Set a click listener on rock View
        jazz.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent jazzIntent = new Intent(Music2Go.this, JazzActivity.class);
                // Start the new activity
                startActivity(jazzIntent);
            }
        });

    }
}
