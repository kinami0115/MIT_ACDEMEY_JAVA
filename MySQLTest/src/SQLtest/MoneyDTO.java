package SQLtest;

public class MoneyDTO {
	  private int no;
	   private String date;
	   private String category;
	   private String particulars;
	   private int money;
	   
	   public int getNo() {
	      return no;
	   }
	   public void setNo(int no) {
	      this.no = no;
	   }
	   public String getDate() {
	      return date;
	   }
	   public void setDate(String date) {
	      this.date = date;
	   }
	   public String getCategory() {
	      return category;
	   }
	   public void setCategory(String category) {
	      this.category = category;
	   }
	   public String getParticulars() {
	      return particulars;
	   }
	   public void setParticulars(String particulars) {
	      this.particulars = particulars;
	   }
	   public int getMoney() {
	      return money;
	   }
	   public void setMoney(int money) {
	      this.money = money;
	   }
	   public MoneyDTO() {
	      
	   }
	   
	   public MoneyDTO(int no, String date, String category, String particulars, int money) {
	      super();
	      this.no = no;
	      this.date = date;
	      this.category = category;
	      this.particulars = particulars;
	      this.money = money;
	   }
	   
	   
	}

