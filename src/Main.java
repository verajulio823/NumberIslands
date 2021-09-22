import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;


public class Main {

	
	/*static char[][] gridtest = { 
	        {'1','1','1','1','0'},
			{'1','1','0','1','0'},
			{'1','1','0','0','0'},
			{'0','0','0','0','0'}
			};
	*/
	static char[][] gridtest= {
			{'1','1','0','0','0'},
			{'1','1','0','0','0'},
			{'0','0','1','0','0'},
			{'0','0','0','1','1'}
			
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		int result= solution.numIslands(gridtest);
		System.out.println(result);

	}
	


}
