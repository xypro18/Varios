package pt.rumos.projetos.constructors;

public class Line {
	private Point p1;
	private Point p2;
	
	Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	Line(int x1, int y1, int x2, int y2) {
		p1 = new Point(x1, y1);
		p2 = new Point(x2, y2);
	}

}
