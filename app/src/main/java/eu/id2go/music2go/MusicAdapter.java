package eu.id2go.music2go;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link MusicAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link Music} objects.
 * Created by rob on 30-3-18.
 */

public class MusicAdapter extends ArrayAdapter<Music> {

    private static final String LOG_TAG = MusicAdapter.class.getSimpleName();

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context    The current context. Used to inflate the layout file.
     * @param songs      A List of {@MusicAdapter} objects to display in a list
     */
    public MusicAdapter(Activity context, ArrayList<Music> songs) {

        // This is our own constructor. It doesn't mirror a superclass constructor
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, songs);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     * @param position      The AdapterView position that is requesting a view
     * @param convertView   The recycled view to populate (search online for "android view
     *                      recycling...)
     * @param parent        The parent ViewGroup that is used for inflation
     * @return              Return the View for the position in the AdapterView
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        // Get the {@link AndroidFlavor} object located at this position in the list
        Music currentMusic= getItem(position);
        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView songtitleTextView = (TextView) listItemView.findViewById(R.id.songtitle_text_view);

        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        songtitleTextView.setText(currentMusic.getSongTitle());

        // Find the TextView in the list_item.xml layout with the ID version_number
//        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
//        defaultTextView.setText(currentMusic.getDefaultTranslation());
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView

        return listItemView;
    }


}
