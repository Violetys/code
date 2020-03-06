package something1;

interface Playable {
	void play();
}
interface Bounceable {
	void play();
}
interface Rollable extends Playable, Bounceable {
	Ball ball = new Ball("PingPang");
}
class Ball implements Rollable {
	private String name;
	public String getName() {
		return name;
	}
	public Ball(String name) {
		this.name =name;
	}
	public void play() {
//		ball = new Ball("Football");     //这句改变了ball的引用，报错
		System.out.println(ball.getName());
	}
}

