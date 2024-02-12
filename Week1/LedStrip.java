public class LedStrip {
	
	//Robin van Dijk
	//5018927
	
	private int valueRed;
	private int valueGreen;
	private int valueBlue;
	private int dimmerValue;
	
	public LedStrip() {}
	
	public int getValueRed() {
		return this.valueRed;
	}
	
	public void setValueRed(int valueRed) {
		if (valueRed >= 0 && valueRed <= 255) {
			this.valueRed = valueRed;
		}
	}
	
	public int getValueGreen() {
		return this.valueGreen;
	}
	
	public void setValueGreen(int valueGreen) {
		if (valueGreen >= 0 && valueGreen <= 255) {
			this.valueGreen = valueGreen;
		}
	}
	
	public int getValueBlue() {
		return this.valueBlue;
	}
	
	public void setValueBlue(int valueBlue) {
		if (valueBlue >= 0 && valueBlue <= 255) {
			this.valueBlue = valueBlue;
		}
	}
	
	public int getDimmerValue() {
		return this.dimmerValue;
	}
	
	public void setDimmerValue(int dimmerValue) {
		if (dimmerValue >= 0 && dimmerValue <= 255) {
			this.dimmerValue = dimmerValue;
		}
	}
	
	public void setLedColorByName(String color) {
		
		if (isValidColor(color)) {
			
			switch(color) {
				case "red":
					setValueRed(255);
					setValueGreen(0);
					setValueBlue(0);
				break;
				case "green":
					setValueRed(0);
					setValueGreen(255);
					setValueBlue(0);
				break;
				case "blue":
					setValueRed(0);
					setValueGreen(0);
					setValueBlue(255);
				break;
				case "purple":
					setValueRed(255);
					setValueGreen(0);
					setValueBlue(255);
				break;
				case "orange":
					setValueRed(255);
					setValueGreen(165);
					setValueBlue(0);
				break;
				case "sun":
					setValueRed(201);
					setValueGreen(141);
					setValueBlue(38);
				break;
				default:
					setValueRed(0);
					setValueGreen(0);
					setValueBlue(0);
				
			}
			
		}
		
	}
	
	public String setLedColorByColorValue(int valueRed, int valueGreen, int valueBlue) {
		
		String colorName = null;
		
		if (valueRed = 255 && valueGreen = 0 && valueBlue = 0) {
			colorName = "red";
		} else if (valueRed = 0 && valueGreen = 255 && valueBlue = 0) {
			colorName = "green";
		} else if (valueRed = 0 && valueGreen = 0 && valueBlue = 255) {
			colorName = "blue";
		} else if (valueRed = 255 && valueGreen = 0 && valueBlue = 255) {
			colorName = "purple";
		} else if (valueRed = 255 && valueGreen = 165 && valueBlue = 0) {
			colorName = "orange";
		} else if (valueRed = 201 && valueGreen = 141 && valueBlue = 38) {
			colorName = "sun";
		} else {
			colorName = "invalid values given";
		}
		
		return colorName;
		
	}
	
	public boolean isValidColor(String color) {
		
		boolean isColorValid = false;
		String[] validColors = new String[]{"red", "green", "blue", "purple", "orange", "sun"};
		List<String> list = Arrays.asList(validColors);
		
		if (list.contains(color)) {
			isColorValid = true;
		}
		
		return isColorValid;
	}
	
	public int changeDimmerByPercentage(int percentageAmount) {
		
		int dimmerPercentage = 0;
		
		if (percentageAmount >= 0 && percentageAmount <= 100) {
			
			dimmerPercentage = percentageAmount / 100 * 255;
			
		}
		
		return dimmerPercentage;
		
	}
	
}