package eu.id2go.music2go;

public class JazzActivity extends MusicManager {

    @Override
    protected void addMusic() {

        songs.add(new Music("Van Morrison", "I Just Wanna Make Love To You", "The Genuine Philosophers stone", R
                .drawable.van_morrison_the_genuine_philosopers_stone, R.raw.van_morrison_i_just_wanna_make_love_to_you));
        songs.add(new Music("Van Morrison", "redwood_tree", "The Genuine Philosophers stone", R
                .drawable.van_morrison_the_genuine_philosopers_stone, R.raw.van_morrison_redwood_tree));
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
