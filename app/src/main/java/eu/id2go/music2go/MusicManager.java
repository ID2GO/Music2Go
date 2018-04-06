package eu.id2go.music2go;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import java.util.ArrayList;

/**
 * {@link MusicManager} is an {@link } that can provide the layout for each list
 * based on a data source, which is a list of {@link Music} objects.
 * Created by rob on 30-3-18.
 */
public abstract class MusicManager extends AppCompatActivity {

    public ArrayList<Music> songs = new ArrayList<>();
    protected MediaPlayer mMediaPlayer;
    private AudioManager mAudioManager;
    private AudioManager.OnAudioFocusChangeListener mAudioFocusChange = new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public void onAudioFocusChange(int focusChange) {
            switch (focusChange) {
                case AudioManager.AUDIOFOCUS_LOSS_TRANSIENT:
                case AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK:
                    if (mMediaPlayer != null) {
                        mMediaPlayer.pause();
                        mMediaPlayer.seekTo(0);
                    }
                    break;
                case AudioManager.AUDIOFOCUS_GAIN:
                    if (mMediaPlayer != null) {
                        mMediaPlayer.start();
                    }
                    break;
                case AudioManager.AUDIOFOCUS_LOSS:
                    releaseMediaPlayer();
                    break;
            }
        }
    };
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            // Now that the sound file has finished playing, release the media player resources.
            releaseMediaPlayer();
        }
    };

    protected abstract void addMusic();

    protected abstract int getActivityId();

    protected abstract int getBackgroundColor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getActivityId());

        addMusic();

        MusicAdapter itemsAdapter = new MusicAdapter(this, songs);

        mAudioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

        itemsAdapter.setBackgroundColor(getBackgroundColor());

        ListView listView = findViewById(R.id.list);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                releaseMediaPlayer();
                int result = mAudioManager.requestAudioFocus(mAudioFocusChange, AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
                if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
                    mMediaPlayer = MediaPlayer.create(MusicManager.this, songs.get(position)
                            .getAudioResourceId());
                    mMediaPlayer.start();
                    mMediaPlayer.setOnCompletionListener(mCompletionListener);
                }
            }
        });

        listView.setAdapter(itemsAdapter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }

    /**
     * Release media player when exist
     */
    protected void releaseMediaPlayer() {
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;
            mAudioManager.abandonAudioFocus(mAudioFocusChange);
        }
    }
}

