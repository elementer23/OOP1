public class Television {
	
	//Robin van Dijk
	//5018927
	
	private String brand;
	private String model;
	private int currentVolume;
	private int currentChannel;
	private int childLockCode;
	
	public Television(String brand, String model, int currentVolume, int currentChannel, int childLockCode) {
		setBrand(brand);
		setModel(model);
		setCurrentVolume(currentVolume);
		setCurrentChannel(currentChannel);
		setChildLockCode(childLockCode);
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getCurrentVolume() {
		return this.currentVolume;
	}
	
	public void setCurrentVolume(int currentVolume) {
		if (currentVolume < 100 && currentVolume > 0) {
			this.currentVolume  = currentVolume;
		}
	}
	
	public int getCurrentChannel() {
		return this.currentChannel;
	}
	
	public void setCurrentChannel(int currentChannel) {
		if (currentChannel < 75 && currentChannel > 0) {
			this.currentChannel = currentChannel;
		}
	}
	
	public void incrementVolume() {
		setCurrentVolume(this.currentVolume++);
	}
	
	public void incrementChannel() {
		setCurrentChannel(this.currentChannel++);
	}
	
	public int getChildLockCode() {
		return this.childLockCode;
	}
	
	public void setChildLockCode(int childLockCode) {
		
		int childLockCodeLength = String.valueOf(childLockCode).length();
		
		if (childLockCodeLength > 4 && childLockCodeLength < 5) {
			this.childLockCode = childLockCode;
		}
	}
	
	public boolean isChildLocked(boolean lockUnlock) {
		return lockUnlock;
	}
	
	public void setChildLock(int childLockCode) {
		
		boolean hasChildLock = false;
		
		if (hasChildLock) {
			if (childLockCode = getChildLockCode()) {
				hasChildLock = false;
			}
		} else {
			if (childLockCode = getChildLockCode()) {
				hasChildLock = true;
			}
		}
		
		isChildLocked(hasChildLock);
			
	}
	
}