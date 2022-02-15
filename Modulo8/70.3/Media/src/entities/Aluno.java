package entities;

public class Aluno {
	public String name;
	public double note1;
	public double note2;
	public double note3;
	
	public double CalcMedia() {
		return note1+note2+note3;
	}
	
	public String media() {
		 if (this.CalcMedia()>60) {
			 return "PASS";
		 }else {
			 return "FAILED "
				   +"MISSING "
				   +String.format("%.2f",60-this.CalcMedia())
				   +" POINTS";
		 }
	}
}
