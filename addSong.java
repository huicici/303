package music;

public class addSong implements Command
{
	Library theSongs;
	Song newSong;
	public addSong(Library tempSongs,Song tempSong) {
		this.theSongs=tempSongs;
		this.newSong=tempSong;
	}
	@Override
	public void execute()
	{
		theSongs.add(newSong);
		
	}

}
