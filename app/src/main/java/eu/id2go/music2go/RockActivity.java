package eu.id2go.music2go;

public class RockActivity extends MusicManager {

    @Override
    protected void addMusic() {
          /*Creation of ArrayList:
          /*This is how elements should be added to the array list*/

        songs.add(new Music("Bruce Springsteen", "Blinded By The Light", "Greetings from " +
                "Ashbury Park", R.drawable.greetings_from_ashbury_park_front, R.raw.blinded_by_the_light));
        songs.add(new Music("Bruce Springsteen", "Growin' Up", "Greetings from " +
                "Ashbury Park", R.drawable.greetings_from_ashbury_park_back, R.raw.growin_up));

    }

    @Override
    protected int getActivityId() {
        return R.layout.activity_rock;
    }

    @Override
    protected int getBackgroundColor() {
        return R.color.category_rock;


    }


}
