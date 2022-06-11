class square {
	float height,width,surfacearea ;
	void computesurfacearea(int height, int width) {
		
		System.out.println("Surface Area=" + square();
	}}
	class cube extends square {
		void computesurfacearea(int height, int width, int depth) {
			int cube= height*width*depth;
			System.out.println("Surface area of a cube=" + cube);
		}
		}

public class inheritancepoly_2 {

	public static void main(String[] args) {
	 square S= new square();
	 S.computesurfacearea( 16,16);
	 cube c= new cube();
	 c.computesurfacearea(2,2, 2);
	}
	 
}