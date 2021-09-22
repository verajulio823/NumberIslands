import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


class Solution {
	
	 public int numIslands(char[][] grid) {
		 int resultIslands=0;
	        for( int i=0; i< grid.length; i++) {
	        	for(int j=0; j< grid[i].length; j++) {
	        		if(grid[i][j]=='1') {
	        			dfs(grid, i, j);
	        			resultIslands++;
	        		}
	        	}
	        }
			
	        return resultIslands;	        
	 }
	 
	 void dfs(char[][] grid, int row, int col){
			Stack<Pair<Integer,Integer>> stack = new Stack();
			stack.push(new Pair(row, col));
			grid[row][col]='2';
			
			while(!stack.isEmpty()) {
				Pair<Integer, Integer> current = stack.pop();
				if(current==null)
					continue;
				
				List<Pair<Integer, Integer>> listNeighbors= neighbors(grid, current);
				for(Pair<Integer,Integer> l : listNeighbors) 
					stack.push(l);
				
			}
		}
	 
	 List<Pair<Integer,Integer>> neighbors(char[][] grid, Pair current) {
			int row = (int) current.key;
			int col = (int) current.value;
			List<Pair<Integer,Integer>> result = new ArrayList<Pair<Integer,Integer>>();
			int maxrow=grid.length;
			int maxcol= grid[0].length;
			
			if(row+1<maxrow && grid[row+1][col] =='1' ) { 
				result.add(new Pair(row+1, col));
				grid[row+1][col] ='2';
			}
			if( row-1>=0 && grid[row-1][col] =='1') { 
				result.add(new Pair(row-1, col));
				grid[row-1][col] ='2';
			}
			
			if(col+1< maxcol && grid[row][col+1] =='1' ) { 
				result.add(new Pair(row, col+1));
				grid[row][col+1] ='2';
			}
			if(col-1 >=0 && grid[row][col-1] =='1') { 
				result.add(new Pair(row, col-1));
				grid[row][col-1] ='2';
			}
				
		
			return result;
		}
	    
	 
	 class Pair<T,K>{
			T key;
			K value;
			public Pair(T key, K value) {
				this.key=key;
				this.value=value;
			}		
	}
	    

}
