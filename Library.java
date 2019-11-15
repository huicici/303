package music;

import java.util.ArrayList;

import java.util.List;
import java.util.*;
 import java.util.Collections;


/**
 * A music library containing multiple songs, that can
 * be organized in different ways.
 */
public abstract class Library implements Cloneable
{
	protected List<Song> aSongs = new ArrayList<>();
	public int Songindex=0;
	private List<Command> command= new ArrayList<>();
	int commandindex=0;
	boolean continuing;
	
	public Library(List<Song> theSongs) {
		this.aSongs=theSongs;
		
	}
	public void takecommand(Command thecommand) {
		command.add(thecommand);
		commandindex++;
	}
	public void add(Song theSong) {
		this.aSongs.add(theSong);
		Songindex++;
	}
	public void shuffle(Library theLibrary) {
		Collections.shuffle(aSongs);
	}
	public void undo() {
		if(command.get(commandindex) instanceof addSong) {
		this.aSongs.remove(Songindex);
		Songindex--;
		}else if(command.get(commandindex) instanceof shufflesong) {
		Songindex--;	
		}
	}
	public void redo() {
		Command newcommand=command.get(commandindex);
		newcommand.execute();
	}
	public void playsongs() {
		Iterator<Song> songiterator=aSongs.iterator();
		while( songiterator.hasNext()&&continuing==true){
			Song currentSong=songiterator.next();
			System.out.println("played"+currentSong);	
		}
	}
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public Song findClassical() {
		Iterator<Song> songiterator=aSongs.iterator();
		while( songiterator.hasNext()){
			Song currentSong=songiterator.next();
			if (currentSong.getGenre()==Genre.CLASSICAL) {
			return currentSong;
		}
	}
		return null;
}
	
}
