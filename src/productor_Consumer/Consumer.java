package productor_Consumer;

public class Consumer implements Runnable {

	private Storage storage;
    private int num;//ÿ�����Ѷ��ٸ�
 
    public Consumer(Storage sto,int num){
        storage = sto;
        this.num = num;
    }
 
    @Override
    public void run() {
        storage.consume(num);
    }


}
