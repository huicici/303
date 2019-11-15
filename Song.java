package music;

/**
 * Represents an audio file and its meta-data.
 */
public class Song
{
	private String aName;
	private AudioFormat aFormat;
	private int aBpm;
	private Genre aGenre;
	
	public Genre getGenre() {
		return this.aGenre;
	}
	public int getbpm() {
		return this.aBpm;
	}
}
