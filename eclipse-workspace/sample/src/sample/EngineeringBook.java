package sample;

public class EngineeringBook extends Book {

	
		// TODO Auto-generated method stub
		private String category;
		public String getCategory() {
			return category;
		

	}
		public void setCategory(String category) {
			this.category=category;
		}
		public String toString() {
			return super.toString()+" Category "+ category;
		}

}
