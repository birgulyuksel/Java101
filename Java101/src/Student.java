public class Student {
    String name;
    int stuNo;
    String classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int stuNo, String classes, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.avarage=calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }
    void addVerbalNote(int matVerbalNote, int fizikVerbalNote, int kimyaVerbalNote) {

		if (matVerbalNote >= 0 && matVerbalNote <= 100) {
			this.mat.verbalNote = matVerbalNote;
		}
		if (fizikVerbalNote >= 0 && fizikVerbalNote <= 100) {
			this.fizik.verbalNote = fizikVerbalNote;
		}
		if (kimyaVerbalNote >= 0 && kimyaVerbalNote <= 100) {
			this.kimya.verbalNote = kimyaVerbalNote;
		}
	}

    public void isPass() {
		calcAvarage();
		if (this.avarage >= 55) {
			System.out.println("Sınıfı geçtiniz. " + " Ortalamanız : " + this.avarage);
			isPass = true;
		} else {
			System.out.println("Sınıfta kaldınız. " + " Ortalamanız : " + this.avarage);
			isPass = false;
		}
	}
    

    double calcAvarage() {
    	double matNote = (this.mat.note * 0.80) + (this.mat.verbalNote * 0.20);
		double fizikNote = (this.fizik.note * 0.80) + (this.fizik.verbalNote * 0.20);
		double kimyaNote = (this.kimya.note * 0.80) + (this.kimya.verbalNote * 0.20);
		return this.avarage = (matNote + fizikNote + kimyaNote) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
		System.out.println("------------------");
		System.out.println("Öğrenci : " + this.name);
		System.out.println("Matematik notu : " + this.mat.note + "  Matematik sözlü notu : " + this.mat.verbalNote);
		System.out.println("Kimya notu : " + this.kimya.note + "  Kimya sözlü notu : " + this.kimya.verbalNote);
		System.out.println("Fizik notu : " + this.fizik.note + "  Fizik sözlü notu : " + this.fizik.verbalNote);
		System.out.println("Ortalama : " + this.avarage);
    }

}