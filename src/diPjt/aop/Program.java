package diPjt.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import diPjt.aop.entity.Exam;
import diPjt.aop.entity.NewLecExam;

public class Program {

	public static void main(String[] args) {

		
		//ApplicationContext context = new AnnotationConfigApplicationContext();
		ApplicationContext context = new ClassPathXmlApplicationContext("diPjt/aop/setting.xml");
		
		
		
	
		Exam exam = (Exam) context.getBean("exam");
		
		System.out.printf("total is %d\n ", exam.total());
		System.out.printf("avg is %f\n ", exam.avg());
		
		/*
		Exam proxyExam= (Exam) Proxy.newProxyInstance(NewLecExam.class.getClassLoader(), 
				new Class[] {Exam.class}, 
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

						long start = System.currentTimeMillis();		
						
						Object result = method.invoke(exam, args );
						
						long end = System.currentTimeMillis();
						String message = (end - start) + "ms 시간이 걸림";
						System.out.println(message);
						
						
						return result;
					}
				});
		*/
		
	
	
	}

}
