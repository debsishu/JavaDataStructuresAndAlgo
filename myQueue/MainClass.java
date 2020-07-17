package myQueue;

public class MainClass {

	public static void main(String[] args) {

		QueueMyImplemented <Integer> mq = new QueueMyImplemented <Integer>();
		mq.enqueue(12);
		mq.enqueue(13);
		mq.enqueue(14);
		mq.enqueue(22);
		
		System.out.println(mq.dequeue());


	}

}
