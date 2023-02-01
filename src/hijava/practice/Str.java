package hijava.practice;

public class Str {
	public static void main(String[] args) {
		// char c = '한'; // cf. char c = 65; or char c = '\uD55C';
		byte b = 'A';
//		System.out.println(c);
//		System.out.println((int) c); // cf. (char)c or (char)b
		System.out.println(b);

		String str = "AB";
		System.out.println(str);
		System.out.println("AB".getBytes().length);
		System.out.println("AB한".getBytes().length);
		// System.out.println("한".getBytes().length);

		// 한글이 2바이트(char)로 표현이 가능한데 왜 3바이트를 할당하는가?
		// 한글이 Unicode 이기때문이다.
		// 자바는 utf-16을 기본적으로 사용하지만 영어가 아닌 문자가 오면
		// uft-8을 사용해 해석하려 한다.

		// 영어가 아닌문자(한글,한자,일본어)에 대해 바이트 계산 이후 메모리를 할당하는 것이 아니기 때문에
		// 먼저 3바이트를 할당시킨다. 2바이트를 할당시키고 오버플로우를 감지하는 것보다 효율적이다.

	}
}
