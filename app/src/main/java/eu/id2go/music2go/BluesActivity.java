package eu.id2go.music2go;

public class BluesActivity extends MusicManager {

    @Override
    protected void addMusic() {
        songs.add(new Music("U2", "Every Breaking Wave", "Songs of Innocence", R.drawable
                .u2_october_front, R.raw.october));
    }

    @Override
    protected int getActivityId() {
        return R.layout.activity_blues;
    }

    @Override
    protected int getBackgroundColor() {
        return R.color.category_blues;


    }
}
