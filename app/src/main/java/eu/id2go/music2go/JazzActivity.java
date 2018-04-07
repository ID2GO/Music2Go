package eu.id2go.music2go;

public class JazzActivity extends MusicManager {

    @Override
    protected void addMusic() {
        songs.add(new Music("U2", "Every Breaking Wave", "Songs of Innocence", R.drawable
                .u2_october_front, R.raw.i_fall_down));
    }

    @Override
    protected int getActivityId() {
        return R.layout.activity_jazz;
    }

    @Override
    protected int getBackgroundColor() {
        return R.color.category_jazz;
    }

}
