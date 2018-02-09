//Team Walking in a Weiner Wongerland (Larry Wong, Joshua Weiner, Eric Wong)
//APCS2 pd8
//L00 -- But What Does the Data Say?
//2018-02-09

/*
  First, we check the three corner values. We check if our target value CAN exist
  by checking if our target value is greater than or equal to the value at the top left and if our target is less than or equal to the value at the bottom. If our target does not lie within that range, we can return -1 without having to iterate through the array to find a value which cannot exist within it.

  Then, if we have found that the target is in the array, we begin our
  algorithm at the the lower left. If the value at this location is
  lower than the target, we check the value to the right of it (towards the larger
  values). If the value at this location is higher than the target, we check the
  value above it (towards the smaller values). This process continues until the
  target is found or the indices go out of bounds (meaning, the value does not
  exist in the array).
*/
public class MatrixFinder
{
 
    
    public static String Finder(int[][] array, int target) {
	
	int nRows = array.length;
	int nCols = array[0].length;
	int curRow = nRows - 1;
	int curCol = 0;
	String retStr = "(";
	//checks if the value is within the boundaries of the array
	if(array[nRows-1][nCols-1] < target || array[0][0] > target) {
	    return "(-1,-1)";
	}else {
	    while (curRow >= 0 && curCol < nCols) {
		/*Print statements for debugging --
		  System.out.println(nRows);
		  System.out.println(nCols);
		  System.out.println(curRow);
		  System.out.println(curCol);*/

		//checks if value at current postion is equal to the target
		if (array[curRow][curCol] == target) {
		    retStr += curRow + "," + curCol + ")";
		    return retStr;
		}
		//if current value is smaller than target, move to the right 1 unit
		else if(array[curRow][curCol] < target){
		    curCol += 1;
		}
		//if current value is bigger than target, move up one unit
		else {
		    curRow -= 1;
		}
	    }
	}
	//will only return (-1, -1) if the search finishes and did not find the target within
	//the matrix. Thus, the target is not in the matrix.
	return "(-1,-1)";
    }
    
    public static void main(String[] args) {

	

    }}
