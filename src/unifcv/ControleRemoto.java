package unifcv;

public class ControleRemoto {
	public static void main(String[] args) {
		Televisao tv = new Televisao();
		
		tv.setCanal(4);
		tv.setVolume(20);
		tv.trocarCanal('+');
		tv.trocarVolume('-');
		tv.info();
		tv.canalIndicado(8);
		tv.info();
	}
}
