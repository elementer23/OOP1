public class Book {
	
	//Robin van Dijk
	//5018927
	
	private String title;
	private String author;
	private boolean hasHardcover;
	private double purchasePrice;
	private int amountOfPages;
	private double timesBookHasBeenRead;
	
	public Book(String title, String author, boolean hasHardcover, double purchasePrice, int amountOfPages, double timesBookHasBeenRead) {
		setTitle(title);
		setAuthor(author);
		setHardCover(hasHardcover);
		setPurchasePrice(purchasePrice);
		setAmountOfPages(amountOfPages);
		setTimesBookHasBeenRead(timesBookHasBeenRead);
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public boolean isHardCover() {
		return this.hasHardcover;
	}
	
	public void setHardCover(boolean hasHardcover) {
		this.hasHardcover = hasHardcover;
	}
	
	public double getPurchasePrice() {
		return this.purchasePrice;
	}
	
	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	
	public int getAmountOfPages() {
		return this.amountOfPages;
	}
	
	public void setAmountOfPages(int amountOfPages) {
		this.amountOfPages = amountOfPages;
	}
	
	public double getTimesBookHasBeenRead() {
		return this.timesBookHasBeenRead;
	}
	
	public void setTimesBookHasBeenRead(double timesBookHasBeenRead) {
		this.timesBookHasBeenRead = timesBookHasBeenRead;
	}
	
	public void incrementAmountBookHasBeenRead() {
		setTimesBookHasBeenRead(getTimesBookHasBeenRead + 1);
	}
	
	public double getAverageReadingTimeInMinutes() {
		return getAmountOfPages() / 0.8;
	}
	
	public String getMessageDependedOnReadingTime() {
		
		String message = null;
		
		if (getAverageReadingTimeInMinutes() < 61) {
			message = "Dit kan je prima lezen.";
		} else if (getAverageReadingTimeInMinutes() >= 60 && getAverageReadingTimeInMinutes() <= 240) {
			message = "Weet je het zeker dat je dit nu wilt gaan lezen?";
		} else if (getAverageReadingTimeInMinutes() > 240) {
			message = "Dit kun je beter niet meer gaan lezen";
		} else {
			message = null;
		}
		
		return message;
	}
	
}