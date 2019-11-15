package music;

import java.util.List;

public class NeverEndingLibrary extends Library
{
	boolean continuing=true;
	public NeverEndingLibrary(List<Song> theSongs)
	{
		super(theSongs);
		// TODO Auto-generated constructor stub
	}
	public void add(Song theSong)  {
		if (!(this.Songindex>10)) {
		this.aSongs.add(theSong);
		Songindex++;
	}
	}

}
