package hijava.practice;

public class Num {

	public static void main(String[] args) {
//		byte b = 1;
//		short s = 1;
//		long i = 2147483648;
// 		error : 자바의 숫자는 무조건 int로 인식하게 되는데 
//		int의 범위를 초과한 숫자이기 때문이다.
//		뒤에 L을 붙여서 8바이트를 사용하라고 명시하면 에러가 사라진다.
//		long l = 1;

		System.out.println("0.1+0.2= " + (0.1 + 0.2));
//		비트 세계에서 소수점을 계산하는 방식이 정해져있기 때문에 
//		반올림하는 방법을 쓸수 밖에 없어서 정확한 0.3으로 출력되지 않음

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);

//		최근에는 var와 같이 자료형의 선언 없이 변수 초기화가 가능하지만
//		이 자체가 혼란을 초래할 수 있다. 
//		가령 var i = 10 이라고 할당 하면 컴파일하면서 int i= 10이라고 
//		해석할텐데 후에 이 값에 대해 i = 2.34 를 대입하면 
//		에러가 나게 된다.(from Java 10)
	}

}
