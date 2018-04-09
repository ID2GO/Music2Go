package eu.id2go.music2go;

public class BluesActivity extends MusicManager {

    @Override
    protected void addMusic() {

        songs.add(new Music("Eric Clapton", "Tears In Heaven", "Tears In Heaven", R
                .drawable.eric_clapton_tears_in_heaven, R.raw.tears_in_heaven));
        songs.add(new Music("Eric Clapton", "Wonderful Tonight", "Wonderful Tonight", R
                .drawable.eric_clapton_wonderful_tonight_single_cover, R.raw.wonderful_tonight));
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
