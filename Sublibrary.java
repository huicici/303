package music;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sublibrary extends Library
{

	public Sublibrary(List<Song> theSongs)
	{
		super(theSongs);
		// TODO Auto-generated constructor stub
	}
	public Song findClassical() {
		Iterator<Song> songiterator=aSongs.iterator();
		int currentbpm=0;
		Song classSong = null;
		List<Song> currentSong=new ArrayList<Song>();
		while( songiterator.hasNext()){
			if (songiterator.next().getGenre()==Genre.CLASSICAL) {
				currentSong.add(songiterator.next());
		}
		for(int i=0; i<currentSong.size();i++) {
			if(currentSong.get(i).getbpm()>currentbpm) currentbpm=currentSong.get(i).getbpm();
			classSong=currentSong.get(i);
		}
	}
		return classSong;
}
	//against the rule cause now the superclass can not return any claasical song, but can only return the one with highest bpm.
}
