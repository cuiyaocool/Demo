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
	// 第一维：当前第几个物品；第二维：当前的背包承重；值：当前背包最大价值
    private int[][] bestValues;
    // 最终背包中最大价值
    private int bestValue;
    
    public Package01(Thing[] bags, int totalWeight){
    	this.bags = bags;
        this.totalWeight = totalWeight;
        this.n = bags.length;
        if (bestValues == null) {
            // 考虑0的状态+1，防止数组角标越界
            bestValues = new int[n + 1][totalWeight + 1];
        }
    }
    
    public void solve() {
    	// 遍历背包的承重
    	for(int i = 0; i <= totalWeight; i++){
    		// 遍历指定物品
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
