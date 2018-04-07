package eu.id2go.music2go;

public class PopActivity extends MusicManager {

    @Override
    protected void addMusic() {

        songs.add(new Music("U2", "Gloria", "U2 - October", R.drawable
                .u2_october_front, R.raw.gloria));
//        songs.add(new Music("U2", "I Fall Down", "U2 - October", R.drawable
//                .u2_october_front, R.raw.i_fall_down));
//        songs.add(new Music("U2", "I Threw A Brick Through A Window", "U2 - October", R.drawable
//                .u2_october_front, R.raw.i_threw_a_brick_through_a_window));
//        songs.add(new Music("U2", "Rejoice", "U2 - October", R.drawable
//                .u2_october_front, R.raw.rejoice));
//        songs.add(new Music("U2", "Fire", "U2 - October", R.drawable
//                .u2_october_front, R.raw.fire));
//        songs.add(new Music("U2", "Tomorrow", "U2 - October", R.drawable
//                .u2_october_front, R.raw.tomorrow));
//        songs.add(new Music("U2", "October", "U2 - October", R.drawable
//                .u2_october_front, R.raw.october));
//        songs.add(new Music("U2", "08 - With A Shout (Jerusalem)", "U2 - October", R.drawable
//                .u2_october_front, R.raw.with_a_shout_jerusalem));
//        songs.add(new Music("U2", "Stranger In A Strange Land", "U2 - October", R.drawable
//                .u2_october_front, R.raw.stranger_in_a_strange_land));
//        songs.add(new Music("U2", "Scarlet", "U2 - October", R.drawable
//                .u2_october_front, R.raw.scarlet));
//        songs.add(new Music("U2", "Is That All ", "U2 - October", R.drawable
//                .u2_october_front, R.raw.is_that_all));
    }

    @Override
    protected int getActivityId() {
        return R.layout.activity_pop;
    }

    @Override
    protected int getBackgroundColor() {
        return R.color.category_pop;
    }


}
