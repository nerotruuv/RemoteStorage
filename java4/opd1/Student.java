class Student{

	public Student(int num, String nam, int lef, String ges){
		studentNummer = num;
		naam = nam;
		leeftijd = lef;
		geslacht = ges;
	}
	
	public void PrintStudent(){
		System.out.println("Studentnummer: " + studentNummer);
		System.out.println("Naam:          " + naam);
		System.out.println("Leeftijd:      " + leeftijd);
		System.out.println("Geslacht:      " + geslacht);
	}

	public String ToString(){
		
	}

	public int GetStudentNummer(){
		return studentNummer;
	}
	
	public void SetStudentNummer(int num){
		studentNummer = num;
	}
	
	public String GetNaam(){
		return naam;
	}
	
	public void SetNaam(String nam){
		naam = nam;
	}
	
	public int GetLeeftijd(){
		return leeftijd;
	}
	
	public void SetLeeftijd(int lef){
		leeftijd = lef;
	}
	
	public String GetGeslacht(){
		return geslacht;
	}
	
	public void SetGeslacht(String Ges){
		if(ges == "M" || ges == "m" || ges == "V" || ges == "v"/){
			geslacht = ges;
		}else System.out.println("Geslacht format was onjuist, geef een v,V,m,M als waarde op");
	}
	
	private int studentNummer;
	private String naam;
	private int leeftijd;
	private String geslacht;
	
}