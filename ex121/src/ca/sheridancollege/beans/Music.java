package ca.sheridancollege.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Music {

	private String instrument;
	private boolean songWriter;
	private String genre;
	private String[] genres;
	
	public Music(String instrument, boolean songWriter, String genre) {
		this.instrument = instrument;
		this.songWriter = songWriter;
		this.genre = genre;
		this.genres = new String[]{"Pop", "Indie", "Spoken Word", "Electronic", "Classical", "the Dead"};
	}
	public Music() {
		this.genres = new String[]{"Pop", "Indie", "Spoken Word", "Electronic", "Classical", "the Dead"};
	}
	
	public String getInstrument() {
		return instrument;
	}
	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}
	public boolean isSongWriter() {
		return songWriter;
	}
	public void setSongWriter(boolean songWriter) {
		this.songWriter = songWriter;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "Music [instrument=" + instrument + ", songWriter=" + songWriter + ", genre=" + genre + "]";
	}
	public String[] getGenres() {
		return genres;
	}
	public void setGenres(String[] genres) {
		this.genres = genres;
	}
	
}
