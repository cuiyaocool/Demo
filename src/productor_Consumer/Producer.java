package productor_Consumer;


public class Producer implements Runnable {
	private Storage storage;
    private int num;//ÿ���������ٸ�
 
    public Producer(Storage sto,int num){
        storage = sto;
        this.num = num;
    }
 
    @Override
    public void run() {
        storage.product(num);
    }

}
