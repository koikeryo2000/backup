package kinou;

public class SmartPhone extends Phone implements Mp3Player,NewFunction {

	@Override
	public void play() {
		System.out.println("再生");

	}

	@Override
	public void stop() {
		System.out.println("停止");

	}

	@Override
	public void next() {
		System.out.println("次へ");

	}

	@Override
	public void back() {
		System.out.println("戻る");

	}

}
