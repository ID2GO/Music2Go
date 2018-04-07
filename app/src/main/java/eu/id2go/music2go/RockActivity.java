package eu.id2go.music2go;

public class RockActivity extends MusicManager {

    @Override
    protected void addMusic() {
          /*Creation of ArrayList:
          /*This is how elements should be added to the array list*/

        songs.add(new Music("Bruce Springsteen", "Blinded By The Light", "Greetings from " +
                "Ashbury Park", R.drawable.greetings_from_ashbury_park_front, R.raw.blinded_by_the_light));
//        songs.add(new Music("Bruce Springsteen", "Growin' Up", "Greetings from " +
//                "Ashbury Park", R.drawable.greetings_from_ashbury_park_back, R.raw.growin_up));
//        songs.add(new Music("Bruce Springsteen", "Mary Queen Of Arkansas", "Greetings from " +
//                "Ashbury Park", R.drawable.greetings_from_ashbury_park_front, R.raw.mary_queen_of_arkansas));
//        songs.add(new Music("Bruce Springsteen", "Does This Bus Stop At 82nd Street", "Greetings from " +
//                "Ashbury Park", R.drawable.greetings_from_ashbury_park_back, R.raw.does_this_bus_stop_at_82nd_street));
//        songs.add(new Music("Bruce Springsteen", "Lost In The Flood", "Greetings from " +
//                "Ashbury Park", R.drawable.greetings_from_ashbury_park_front, R.raw.does_this_bus_stop_at_82nd_street));
//        songs.add(new Music("Bruce Springsteen", "The Angel", "Greetings from " +
//                "Ashbury Park", R.drawable.greetings_from_ashbury_park_back, R.raw.the_angel));
//        songs.add(new Music("Bruce Springsteen", "For You", "Greetings from " +
//                "Ashbury Park", R.drawable.greetings_from_ashbury_park_front, R.raw.for_you));
//        songs.add(new Music("Bruce Springsteen", "Spirit In The Night", "Greetings from " +
//                "Ashbury Park", R.drawable.greetings_from_ashbury_park_back, R.raw
//                .spirit_in_the_night));
//        songs.add(new Music("Bruce Springsteen", "09-It's Hard To Be A Saint In The City", "Greetings from " +
//                "Ashbury Park", R.drawable.greetings_from_ashbury_park_front, R.raw
//                .its_hard_to_be_a_saint_in_the_city));

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
