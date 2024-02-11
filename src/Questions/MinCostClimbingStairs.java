package Questions;

public class MinCostClimbingStairs {

	public static void main(String[] args) {
		
		int cost[] = {10,15,20};
		 int i,k ;
		if(cost == null || cost.length < 1) {
			System.out.println(0);
		}
		
		if(cost.length == 1) {
			System.out.println(cost[0]);
		}
	    
		for( i=cost.length-2; i<=0; i--) {
			if(i == cost.length-2) {
			cost[i] =Math.min(cost[i], cost[i] + cost[i+1]);
		}
		else {cost[i] = Math.min(cost[i] + cost[i+1], cost[i] + cost[i+2]);
			
		}
	  }
		System.out.println(Math.min(cost[0], cost[1]));
		
	}

}
