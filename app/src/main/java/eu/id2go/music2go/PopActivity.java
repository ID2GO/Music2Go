package eu.id2go.music2go;

public class PopActivity extends MusicManager {

    @Override
    protected void addMusic() {

        songs.add(new Music("U2", "Gloria", "U2 - October", R.drawable
                .u2_october_front, R.raw.gloria));
        songs.add(new Music("U2", "I Fall Down", "U2 - October", R.drawable
                .u2_october_front, R.raw.i_fall_down));

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
