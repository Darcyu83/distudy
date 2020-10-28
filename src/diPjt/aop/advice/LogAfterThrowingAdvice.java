package diPjt.aop.advice;

import org.springframework.aop.ThrowsAdvice;

public class LogAfterThrowingAdvice implements ThrowsAdvice{

	
	public void afterThrowing(IllegalArgumentException e ) throws Throwable{		
		//execption 타입이 너무 많기 때문에 상황에 따라서 설정한다. 예제는 부적절한 매개변수 오류를 유발함.
		
		System.out.println("예외가 발생됨. : " + e.getMessage());
		
	}
	
}
