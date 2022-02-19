
public class LeetCodeGame2Jump {

	public void main(String[] args) {
		int[] arry = new int[10];
		// TODO Auto-generated method stub
		jump(arry);
	}
	public int jump(int nums[]) {
		int jumps = 0, currentJumped=0, farthest=0;
		for(int i =0; i<nums.length-1;i++) {
			farthest= Math.max(farthest, i+nums[i]);
			if(i==currentJumped) {
				jumps++;
				currentJumped = farthest;
			}
		}
		return jumps;
	}

}
