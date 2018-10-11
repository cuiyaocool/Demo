package package01;

/**
 * https://blog.csdn.net/ljmingcom304/article/details/50328141
 * @author cy
 *
 */
public class Package01 {
	
	private Thing[] bags;
	private int n;
	private int totalWeight;
	// ��һά����ǰ�ڼ�����Ʒ���ڶ�ά����ǰ�ı������أ�ֵ����ǰ��������ֵ
    private int[][] bestValues;
    // ���ձ���������ֵ
    private int bestValue;
    
    public Package01(Thing[] bags, int totalWeight){
    	this.bags = bags;
        this.totalWeight = totalWeight;
        this.n = bags.length;
        if (bestValues == null) {
            // ����0��״̬+1����ֹ����Ǳ�Խ��
            bestValues = new int[n + 1][totalWeight + 1];
        }
    }
    
    public void solve() {
    	// ���������ĳ���
    	for(int i = 0; i <= totalWeight; i++){
    		// ����ָ����Ʒ
    		for(int j = 0; j<=n; j++){
    			if (i == 0 || j == 0) {
					bestValues[j][i] = 0;
				} else {
					if (bags[j-1].getWeight() > i) {
						bestValues[j][i] = bestValues[j-1][i];
					}else {
						int weight = bags[j - 1].getWeight();
                        int value = bags[j - 1].getValue();
                        bestValues[j][i] = Math.max(bestValues[j-1][i], value + bestValues[j-1][i-weight]);
					}
				}
    		}
    	}
    	bestValue = bestValues[n][totalWeight];
    }
    public int getBestValue() {
		return bestValue;
	}
}
