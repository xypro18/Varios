package pt.rumos.projetos;

public class Color {
	public static int BLACK = 0;
	public static int WHITE = 1;
	public static int RED = 2;
	public static int GREEN = 3;
	public static int BLUE = 4;
	public static int YELLOW = 5;
	
	private int color;
	
	public Color(int c) {
		setColor(c);
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

}
