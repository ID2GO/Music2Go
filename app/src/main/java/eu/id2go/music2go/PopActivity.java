package eu.id2go.music2go;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);


                  /*Creation of ArrayList: I'm going to add String
           *elements so I made it of string type
           */
        ArrayList<Music> songs = new ArrayList<>();
//            /*This is how elements should be added to the array list*/


        songs.add(new Music("U2", "Gloria", "U2 - October", R.drawable
                .u2_october_front, R.raw.gloria));
        songs.add(new Music("U2", "I Fall Down", "U2 - October", R.drawable
                .u2_october_front, R.raw.i_fall_down));
        songs.add(new Music("U2", "I Threw A Brick Through A Window", "U2 - October", R.drawable
                .u2_october_front, R.raw.i_threw_a_brick_through_a_window));
        songs.add(new Music("U2", "Rejoice", "U2 - October", R.drawable
                .u2_october_front, R.raw.rejoice));
        songs.add(new Music("U2", "Fire", "U2 - October", R.drawable
                .u2_october_front, R.raw.fire));
        songs.add(new Music("U2", "Tomorrow", "U2 - October", R.drawable
                .u2_october_front, R.raw.tomorrow));
        songs.add(new Music("U2", "October", "U2 - October", R.drawable
                .u2_october_front, R.raw.october));
        songs.add(new Music("U2", "08 - With A Shout (Jerusalem)", "U2 - October", R.drawable
                .u2_october_front, R.raw.with_a_shout_jerusalem));
        songs.add(new Music("U2", "Stranger In A Strange Land", "U2 - October", R.drawable
                .u2_october_front, R.raw.stranger_in_a_strange_land));
        songs.add(new Music("U2", "Scarlet", "U2 - October", R.drawable
                .u2_october_front, R.raw.scarlet));
        songs.add(new Music("U2", "Is That All ", "U2 - October", R.drawable
                .u2_october_front, R.raw.is_that_all));



        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        MusicAdapter adapter = new MusicAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list layout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);


    }
//    @Override
//    protected int getBackgroundColor() { return R.color.category_pop; }
}
