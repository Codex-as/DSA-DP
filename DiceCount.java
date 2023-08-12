package dp;

public class DiceCount {

//	Recursion
	static int countWaysRec(int current, int target) {
        // Positive base case
        if(current == target) {
            return 1;
        }
        // Negative base case
        if(current > target) {
            return 0;
        }
        int count = 0;
        for(int dice = 1; dice <= 6; dice++) {
            count = count + countWaysRec(current+dice, target);
        }
        return count;
    }
	
//	Memoisation
	static int countWaysMemo(int current, int target, int cache[]) {
        // Positive base case
        if(current == target) {
            return 1;
        }
        // Negative base case
        if(current > target) {
            return 0;
        }
        if(cache[current] != 0) {
            return cache[current];
        }
        int count = 0;
        for(int dice = 1; dice <= 6; dice++) {
            count = count + countWaysMemo(current+dice, target, cache);
        }
        cache[current] = count;
        return count;
    }

//  Tabulation,
	static int countWaysTab(int target) {
		int cache[] = new int[target+1];
		cache[0] = 1;
        for(int i =1;i<=target;i++) {
        	cache[i]=0;
        	for(int dice = 1; dice <= 6; dice++) {
        		if(i-dice>=0) {
        			cache[i]+=cache[i-dice];
        		}
        	}
        }
        return cache[target];
    }
	
    public static void main(String[] args) {
    	int target = 10;
        int res = countWaysRec(0, target);
        System.out.println(res);
        int cache[] = new int[target+1];
        System.out.println(countWaysMemo(0,target,cache));
        System.out.println(countWaysTab(target));
    }
    
}
