package Practice;

public class Bed {
	private String style;
	private int pillow;
	private int sheet;
	private int height;
	private int quilt;
	
	public Bed(String style, int pillow, int sheet, int height, int quilt) {
		this.style = style;
		this.pillow = pillow;
		this.sheet = sheet;
		this.height = height;
		this.quilt = quilt;
	}
	
	public void Make() {
		System.out.println("The bed has been made.");
	}

	public String getStyle() {
		return style;
	}

	public int getPillow() {
		return pillow;
	}

	public int getSheet() {
		return sheet;
	}

	public int getHeight() {
		return height;
	}

	public int getQuilt() {
		return quilt;
	}
	
	

}
