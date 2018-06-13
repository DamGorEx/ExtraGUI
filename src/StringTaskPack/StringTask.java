package StringTaskPack;

public class StringTask implements Runnable {
	State state;
	String string;
	int i;
	Thread a;

	public StringTask(String string, int i) {
		this.string=string;
		this.i=i;
		this.state=State.CREATED;
	}

	@Override
	public void run() {
		this.state=state.RUNNING;
		for(int a=0;a<this.i;a++) {
			this.string+=this.string.valueOf(0);
		}
		this.state=State.READY;
	}

	public State getState() {
		return this.state;
	}

	public void start() {
		this.a=new Thread(this);
		a.start();
	}

	public boolean isDone() {
		return this.state==State.READY||this.state==State.ABORTED?true:false;
	}

	public String getResult() {
		return this.string;
	}
	public void abort() {
		this.a.interrupt();
		this.state=State.ABORTED;
	}
}

enum State {
	RUNNING, ABORTED, READY, CREATED
}


