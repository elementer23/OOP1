public class Photo {
	
	//Robin van Dijk
	//5018927
	
	private int length;
	private int width;
	private String description;
	private int amountOfPeopleOnPicture;
	private int dpi; 
	
	public Photo(int length, int width, String description, int amountOfPeopleOnPicture, int dpi) {
		setLength(length);
		setWidth(width);
		setDescription(description);
		setAmountOfPeopleInPicture(amountOfPeopleOnPicture);
		setDpi(dpi);
	}
	
	public int getLength() {
		return this.length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getAmountOfPeopleInPicture() {
		return this.getAmountOfPeopleInPicture;
	}
	
	public void setAmountOfPeopleInPicture(int amountOfPeopleOnPicture) {
		this.amountOfPeopleOnPicture = amountOfPeopleOnPicture;
	}
	
	public int getDpi() {
		return this.dpi;
	}
	
	public void setDpi(int dpi) {
		this.dpi = dpi;
	}
	
	public boolean isPhotoPrintable() {
		
		boolean isPrintable = false;
		
		if (getLength() >= 585 && getWidth() >= 878 && getDpi() >= 150) {
			isPrintable = true;
		}
		
		return isPrintable;
	}
	
	public boolean isGroupPhoto() {
		
		boolean isGroup = false;
		
		if (getAmountOfPeopleInPicture() > 1) {
			isGroup = true;
		}
		
		return isGroup;
	}
	
}