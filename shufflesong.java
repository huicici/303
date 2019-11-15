package music;

public class shufflesong implements Command
{
	Library theSongs;
	public shufflesong(Library tempSongs) {
		this.theSongs=tempSongs;
	}
	@Override
	public void execute()
	{
		// TODO Auto-generated method stub
		theSongs.shuffle();
	}
	
}
