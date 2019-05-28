
public class Cube {
	int length;
	int breadth;
	int height;
	Cube(){
		length = 10;
		breadth = 20;
		height = 30;
	}
	Cube(int length, int breadth, int height){
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	public int getcubeVolume() {
		return(length * breadth * height);
	}
}
