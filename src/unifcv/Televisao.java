package unifcv;

public class Televisao {
	private int volume;
	private int canal;
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	public void trocarVolume(char aumentarVolume) {	
		
		if(aumentarVolume == '+'){
			volume = volume + 1;
		}else {
			volume = volume - 1;
		}
		
	}
	public void trocarCanal(char aumentarCanal) {
		if(aumentarCanal == '+'){
			canal = canal + 1;
		}else {
			canal = canal - 1;
		}
	}
	public void info() {
		System.out.println("O volume eh: " + volume);
		System.out.println("O canal eh: " + canal);
	}
	public void canalIndicado(int indicado) {
		canal = indicado;
		
	}

}
