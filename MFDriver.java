//Team Walking in a Weiner Wongerland (Larry Wong, Joshua Weiner, Eric Wong)
//APCS2 pd8
//L00 -- But What Does the Data Say?
//2018-02-09

public class MFDriver{

    public static void populate(int[][] matrix){
	int i = 0;
	for (int r = 0; r < matrix.length; r++){
	    for (int c = 0; c < matrix.length; c++){
		matrix[r][c] = i;
		i++;
	    }
	}


    } 
    public static void main(String[] args){
	MatrixFinder code = new MatrixFinder();
	int[][] test;
	int size = 1000;
	int ctr = 0;
	int total = 0;
	System.out.println("Size (n) , Time(Milliseconds)");
	
	//warming up
	int n = 1;
	while (n <= 999){
	    
	    test = new int[size][size];
	    populate(test);
	    	    
	    while (ctr < 1000){
		code.Finder(test, size-1);
		ctr ++;
	    }
	    ctr = 0;
	    n += 100;

	}
	
	while (size <= 10000){
	    
	    test = new int[size][size];
	    populate(test);
	    
	    while (ctr < 10000){
		long startTime = System.nanoTime();
		code.Finder(test, size-1);
		long endTime = System.nanoTime() - startTime;
		total += endTime;
		ctr ++;
	    }
	    total /= 10000.0;// avg data
	    System.out.println(size + " , " + total);
	    total = 0;
	    ctr = 0;
	    size += 100;
	}


    }

}
