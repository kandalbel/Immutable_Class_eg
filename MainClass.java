
final class Student {
   private final Id id;
   private final String ders;
   private final int not;
   public Student(Id id, String ders, int not) {
      super();
      this.id = id;
      this.ders = ders;
      this.not = not;
   }
   public String getDers() {
      return ders;
   }
   public int getNot() {
      return not;
   }
   public Id getId() throws CloneNotSupportedException {
      return (Id) id.clone();
   }

   
}
class Id implements Cloneable {
   public String ad;
   public String soyad;
   public int num;
 
   public Id(String ad, String soyad, int num) {
      super();
      this.ad = ad;
      this.soyad = soyad;
      this.num = num;
   }

   public String getAd() {
	return ad;
}
   
public void setAd(String ad) {
	this.ad = ad;
}

public String getSoyad() {
	return soyad;
}

public void setSoyad(String soyad) {
	this.soyad = soyad;
}

public int getNum() {
	return num;
}

public void setNum(int num) {
	this.num = num;
}

public Object clone() throws CloneNotSupportedException {
      return super.clone();
   }

   @Override
   public String toString() {
      return "Adı : "+ad+", Soyadı :"+soyad+", Öğrenci Numara: "+num;
   }
}

public class MainClass {
   public static void main(String[] args) throws Exception {
      Student s1 = new Student(new Id ("Albert", "Kandi", 180304105), "NYP", 80);
      Id id= s1.getId();
      System.out.println(id);
      id.setAd("Belier");
      id.setNum(368974);
      id.setSoyad("Jewe");
      System.out.println(s1.getId());
   }
}