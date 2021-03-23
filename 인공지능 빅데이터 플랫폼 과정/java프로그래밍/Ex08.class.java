
public class Ex08 {
	public static void main(String[] args) {
		StringBuilder st = new StringBuilder("울산시"); //  문자열 "울산시"가 저장된  stringBuilder 메모리공간 생성
		st.append(" 서생면"); //문자열 내용을 추가
		System.out.println(st);
		System.out.println(st.toString());// 저장된 문자열의 내용을 담은 string 인스턴스가 생성 밒 반환
		String test = st.toString();
		System.out.println(test); // st2변수에 toString로 새 인스턴스가 생성되고  참조값을 반환
		
		st.insert(3, " 울주군"); //insert메소드로 인덱스 3번 자리에 문자열"울주군"을 추가
		System.out.println(st.toString());
		
		StringBuilder st2= new StringBuilder("해맞이로 1330 주택입니다");
		st2.replace(5, 9, "1375-24");
		System.out.println(st2.toString());
		String st3= st2.substring(13);
		System.out.println(st3);
//		st3.reverse();
//		System.out.println("주택입니다".reverse());//reverse 메소드는 저당된 문자열(StringBuilder에 저장된 문자열)을 뒤집는다
		st.reverse();	
		System.out.println(st);//StringBuilder 메모리공간을 가리키는 st변수로 호출한 reverse메소드로 저장된 문자열을 뒤집는다
		st.reverse(); //다시 원상태로 뒤집기
		String a = st.toString();
		String b = st2.toString();
//		String address = st.concat(st3);
		String address = a.concat(b);
		System.out.println("주소1: "+address);
		StringBuilder address2= new StringBuilder(st.append(st2).toString());
		System.out.println("주소2: "+address2);
		
		}

}
