package JavaCodePractice;

public class Encap {
	 private	int acno;
		private String name; // rule no 1 for every variable to private
		private double bal;
		
		public int getAcno() {
			return acno;
		}
		public void setAcno(int acno) {
			this.acno = acno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getBal() {
			return bal;
		}
		public void setBal(double bal) {
			this.bal = bal;
		}	
public static void main(String args[]) {
	   Encap acc=new Encap();
		  
	      acc.setAcno(1852);
	      acc.setBal(5000.30);
	      acc.setName("Anil");
	      
	      System.out.println(acc.getAcno());
	      System.out.println(acc.getBal());
	      System.out.println(acc.getName());
	
}
	
}
