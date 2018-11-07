package pt.rumos.projetos;

import java.time.LocalDateTime;

import pt.rumos.projetos.shapes.Circle;

public class Canvas implements CanvasInterface {
	private int[][] canvas;
	private int w;
	private int h;

	public Canvas(int i, int j) {
		w = i;
		h = j;
		erase();
		
		int a[][] = new int[3][];
		
		
		
		
	}

	@Override
	public void erase() {
		canvas = new int[w][h];		
	}

	public void add(Shape s) {
		
	}
	
	
	
	
	

}
