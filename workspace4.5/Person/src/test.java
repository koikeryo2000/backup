
public class test {

	public static void main(String[] args) {

		Person taro = new Person();

		taro.name="山田太郎";
		taro.age=20;

		System.out.println("私の名前は"+ taro.name+"です年齢は"+taro.age+"です");


		Person kimura = new Person();

		kimura.name="木村次郎";
		kimura.age=18;

		System.out.println("俺の名前は"+kimura.name+"だ"+"年齢は"+kimura.age+"だ");

		Person suzuki= new Person();

		suzuki.name="鈴木花子";
		suzuki.age=16;

		System.out.println("私の名前は"+suzuki.name+"です"+"年齢は"+suzuki.age+"です");

		taro.talk();
		taro.walk();
		taro.run();



	}

}
