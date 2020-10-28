package diPjt.aop.entity;

public class NewLecExam implements Exam {
	private int kor;
	private int eng;
	private int math;
	private int com;
	
	public NewLecExam() {
	}
	
	
	
	
	
	public NewLecExam(int kor, int eng, int math, int com) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
	}
	
	public NewLecExam(float kor, float eng, float math, float com) {
		super();
		this.kor = (int)kor+1;
		this.eng = (int) eng+1;
		this.math =  (int)math+1;
		this.com =  (int)com+1;
	}




	@Override
	public int total() {
		
		// 속도 측정 코드  aop 적용 전 
		
		//long start = System.currentTimeMillis();		
		
		
		if(kor >100 )throw new IllegalArgumentException("유효하지 않은 숫자");
		
		int result =  kor+eng+math+com;
		
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		//long end = System.currentTimeMillis();
		//String message = (end - start) + "ms 시간이 걸림";
		//System.out.println(message);
		
		
		return result ;
	}

	@Override
	public float avg() {
		
		float result = total() / 4.0f ;
		
		
		return result ;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}





	@Override
	public String toString() {
		return "NewLecExam [kor=" + kor + ", eng=" + eng + ", math=" + math + ", com=" + com + "]";
	}
	
	
	
	

}
