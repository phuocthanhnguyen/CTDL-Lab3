package Task1;

public class MyArray {
	private int[] array;

	public MyArray(int[] array) {
		this.array = array;
	}
		public int iterativeLinearSearch(int target) {
		for (int i = 0; i < array.length; i++) {
			if (target == array[i]) {
				return i;
			}
		}
		return -1;
	}

	
	public int help(int taget, int index) {
		if (index >= array.length) {
			return -1;
		}
		if (array[index] == taget) {
			return index;
		}

		return help(taget, index+1);
	}

	public int recursiveLinearSearch(int target) {
		return help(target, 0);
	}
	
	public int iterativeBinarySearch(int target) {
	    int left = 0;
	    int right = array.length - 1;
	    while (left <= right) {
	        int mid = left + (right - left) / 2;
	        if (array[mid] == target) {
	            return mid;
	        } else if (array[mid] < target) {
	            left = mid + 1;
	        } else {
	            right = mid - 1;
	        }
	    }
	    return -1;
	}
	
	public int recursiveBinarySearch(int target) {
	    return recursiveBinarySearchHelp(target, 0, array.length - 1);
	}

	private int recursiveBinarySearchHelp(int target, int left, int right) {
	    if (left > right) {
	        return -1;
	    }
	    int mid = left + (right - left) / 2;
	    if (array[mid] == target) {
	        return mid;
	    } else if (array[mid] < target) {
	        return recursiveBinarySearchHelp(target, mid + 1, right);
	    } else {
	        return recursiveBinarySearchHelp(target, left, mid - 1);
	    }
	}

	
	public static void main(String[] args) {

		int[] a1 = { 12, 10, 9, 45, 2, 10, 10, 45 };
		
		MyArray m1 = new MyArray(a1);
		
		System.out.println(m1.iterativeLinearSearch(45));
		System.out.println(m1.recursiveLinearSearch(15));
		System.out.println(m1.iterativeBinarySearch(13));
		System.out.println(m1.recursiveBinarySearch(10));
		
	}
}
