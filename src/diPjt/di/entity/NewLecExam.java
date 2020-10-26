package diPjt.di.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public class NewLecExam implements Exam {
	@Value("200")
	private int kor;
	@Value("300")
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
		// TODO Auto-generated method stub
		return kor+eng+math+com;
	}

	@Override
	public float avg() {
		// TODO Autoㄴ-generated method stub
		return total() / 4.0f ;
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
