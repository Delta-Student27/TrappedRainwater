package Radhe;

public class RainWater {
	private static int[] heigth;
	public static void trappedRainWater(int height[]) {
		int n= height.length;
		int leftMax[]=new int[n];
		leftMax[0]=height[0];
		for(int i=1;i<n;i++) {
			leftMax[i]=Math.max(height[i], leftMax[i-1]);
		}
		int rightMax[]=new int[n];
		rightMax[n-1]=height[n-1];
		for(int i=n-2;i>=0;i--) {
			rightMax[i]=Math.max(heigth[i],rightMax[i+1]);
		}
		int trappedWater=0;
		for(int i=0;i<n;i++) {
			int waterLevel=Math.min(leftMax[i],rightMax[i]);
			int waterlevel = 0;
			trappedWater+= waterlevel-height[i];
		}
		 return;
		}
	public static void main(String args[]) {
		int[] height= {4,2,0,6,3,2,5};
		System.out.print(trappedRainWater(height));
	} 
}