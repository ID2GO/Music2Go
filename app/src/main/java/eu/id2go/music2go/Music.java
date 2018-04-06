package eu.id2go.music2go;

/**
 * {@Link Music} represents a selection of music in a genre that the user wants to listen to.
 * it contains a list of songs.
 * Created by rob on 30-3-18.
 */

public class Music {

    /**
     * Name of the Artist
     */
    private String mArtist;

    /**
     * Name of the Song
     */
    private String mSongTitle;

    /**
     * Name of the Album
     */
    private String mAlbum;

    /**
     * Name of the AlbumImage
     */
    private int mImageResourceId;

    /**
     * Name of the AudioFile
     */
    private int mAudioResourceId;


    /**
     * Create a new word object
     * @param Artist is the name of the artist
     * @param SongTitle is the name of the song
     * @param Album is the name of the album
     */
    public Music(String Artist, String SongTitle, String Album, int imageResourceId,
                 int audioResourceId) {
        mArtist = Artist;
        mSongTitle = SongTitle;
        mAlbum = Album;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Get the name of the artist
     */
    public String getArtist() {
        return mArtist;
    }

    /**
     * Get the name of the song
     */
    public String getSongTitle() {
        return mSongTitle;
    }

    /**
     * Get the name of the song
     */
    public String getAlbum() {
        return mAlbum;
    }

    /**
     * Get the image of the Album
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Get the audioFile of the song
     */
    public int getAudioResourceId() {
        return mAudioResourceId; }


}
