package eu.id2go.music2go;

/**
 * {@Link Music} represents a selection of music in a genre that the user wants to listen to.
 * it contains a list of songs.
 * Created by rob on 30-3-18.
 */

public class Music {

    /** Default translation for the word*/
//    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mSongTitle;

    /**
     * Create a new word object
     * @param DefaultTranslation is the word in the users language
     * @param SongTitle is the word in the Miwok language
     */
    public Music(String SongTitle) {
//    public Word(String DefaultTranslation, String SongTitle) {
//        mDefaultTranslation = DefaultTranslation;
        mSongTitle = SongTitle;
    }

    /**
     * Get the default translation of the word
     */
//    public String getDefaultTranslation() {
//        return mDefaultTranslation;
//    }

    /**
     * Get the Miwok translation of the word
     */
    public String getSongTitle() {
        return mSongTitle;
    }
}
