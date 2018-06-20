public class TV{
	private int volume;
	
	public void increaseVolume(){
		volume++;
	}
	public void decreaseVolume(){
		volume--;
	}
	
	class Remote{
		public void increaseVolume(){
			volume++;
		}
		public void decreaseVolume(){
			volume--;
		}
	}
}