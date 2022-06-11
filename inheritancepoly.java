class book {
	private String title;
	private int pages;
	
	public String getTitle() {
		return title;
		}
	public void  setTitle(String title) {
		this.title= title;
		}
 public int getPagenumber() {
	 return pages;
 }
 public void setPagenumber() {
	 this.pages= pages;
	 }
 
 //create a sub class 
 class Textbook extends book {
	 private String grade;
	 public  String getGrade() {
		 return grade;
	 }
	 public void setGrade(String Grade) {
		 this.grade= grade;
		 
	 }
 }
public class inheritancepoly {

	public static void main(String[] args) {
		book t= new book();
		
		
	}

	}

}
