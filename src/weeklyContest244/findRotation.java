package weeklyContest244;

public class findRotation {
	private static boolean isEqual(int[][] mat, int[][] target) {
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[0].length; j++) {
				if(mat[i][j] != target[i][j])return false;
			}
		}
		return true;
	}
	private static void rotate(int[][] mat) {
		int x = mat.length;
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < mat[0].length/2; j++) {
				int y = mat[j][i];
				mat[j][i] = mat[x-j-1][i];
				mat[x-j-1][i] = y;
				
			}
		}
		for(int i = 0; i < mat.length; i++) {
			for(int j = i+1; j < mat[0].length; j++) {
				int y = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = y;
				
			}}
		
	}
	public static void main(String[] args) {
		int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
		int[][] target = {{1,1,1},{0,1,0},{0,0,0}};
		boolean ans = false;
		if(isEqual(mat, target))ans = true;
		for(int i = 0; i < 3; i++) {
			rotate(mat);
			if(isEqual(mat, target)) {
				System.out.println(i);
				ans = true;
				break;
			}
		}
		System.out.println(ans);
	}
}
