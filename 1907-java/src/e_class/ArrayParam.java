package e_class;

public class ArrayParam {
	ArrayParam(int[] s) {
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}
	int arraySum(int[]s) {
		int sum = 0;
		for(int i = 0 ; i<s.length; i++) {
			sum+=s[i];			
		}
		return sum;
	}
	//전달받은 배열에서 최대값을 구하여 리턴
    int arrayMax(int [] s) {
    	int max = s[0];
    	
    	for(int i = 0 ; i<s.length ;i++) {
    		if(max < s[i]) { 
    			max = s[i];
    		}
    	}
    	return max;
    }
    //전달받은 배열에서 최소값을 구하여 리턴
    int arrayMin(int[]s) {
    	int min = s[0];
    	for(int i = 0; i < s.length; i++) { 
    		
    		if(min > s[i]) {
    			min = s[i];
    		}
    	}
    	return min;		
    }
    
    //하나의 메소드에서 최대값과 최소값을 동시에 반환하고싶을때
    //배열을 리턴값으로 하면 됨. 배열을 추가함.
    int[] maxMin(int[] s) {
    	int[] m = new int[2];
    	m[0] = s[0];//max
    	m[1] = s[0];//min
    	for(int i = 0; i <s.length; i++) {
    		if(m[0] < s[i]) {
    			m[0] = s[i];
    		}else if(m[1] > s[i]) {
    			m[1] = s[i];
    		}
    	}
    	
    	return m;
    }

	public static void main(String[] args) {
		int[] abc = { 1, 2, 3, 4, 5, 515, 7, 8, 9, 10 };
		ArrayParam ap1 = new ArrayParam(abc);
        int hap = ap1.arraySum(abc);
        System.out.println(hap);
        int m = ap1.arrayMax(abc);
        System.out.println("최대값 : " + m);
        int n = ap1.arrayMin(abc);
        System.out.println("최소값 : " + n);
        int []a = ap1.maxMin(abc);
        System.out.println("최소값 : " + a[0]);
        System.out.println("최대값 : " + a[1]);

	}

}
