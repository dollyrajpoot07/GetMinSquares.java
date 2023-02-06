// A number can always be represented as a sum of squares of other numbers. 
// Note that 1 is a square and we can always break a number as (1*1 + 1*1 + 1*1 + …). 
// Given a number n, find the minimum number of squares that sum to X.

// Input:  n = 100
// Output: 1
// Explanation:
// 100 can be written as 102. Note that 100 can also be written as 52 + 52 + 52 + 52, 
// but this representation requires 4 squares.

// Input:  n = 6
// Output: 3

import java.util.*;

class GetMinSquares{

static boolean isSquare(int x) {
	int sqRoot = (int)Math.sqrt(x);
	return (sqRoot * sqRoot == x);
}

static int cntSquares(int n) {
	if (isSquare(n)) {
		return 1;
	}

	for (int i = 1; i <= (int)Math.sqrt(n)+1; i++) {
		if (isSquare(n - (i * i))) {
			return 2;
		}
	}

	while (n % 4 == 0) {
		n >>= 2;
	}
	if (n % 8 == 7) {
		return 4;
	}

	return 3;
}

public static void main(String[] args) {
	System.out.print(cntSquares(12) +"\n");
}
}
