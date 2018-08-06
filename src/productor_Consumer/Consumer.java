package productor_Consumer;

public class Consumer implements Runnable {

	private Storage storage;
    private int num;//每次消费多少个
 
    public Consumer(Storage sto,int num){
        storage = sto;
        this.num = num;
    }
 
    @Override
    public void run() {
        storage.consume(num);
    }


}
