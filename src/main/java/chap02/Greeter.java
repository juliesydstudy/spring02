/*
 * 콘솔에 간단한 메시지를 출력하는 자바 클래스 
 * 2019-6-16, 스프링스터디 2주차 과제 
 * 이수빈 
 */
 
package chap02; 

public class Greeter {
	
	private String format; 
	
	// String의 문자열 포맷을 이용해서 새로운 문자열을 생성
	public String greet(String guest) {
		return String.format(format,  guest);
	}
	
	public void setFormat(String format) {
		this.format = format; 
	}
	
}