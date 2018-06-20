public class TVUser{
	public static void main(String[] args) {
		TV lg = new TV();
		
		//TV.Remote remote = new TV.Remote();
		//Syntax not very widely used
		
		TV.Remote lgRemote = lg.new Remote();
		lgRemote.increaseVolume();
	}
}