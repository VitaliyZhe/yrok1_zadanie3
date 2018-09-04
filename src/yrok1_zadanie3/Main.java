package yrok1_zadanie3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Vector3D vector1=new Vector3D(10,20,-15);
   Vector3D vector2=new Vector3D(20,-5,17);
   
   System.out.println("Vector "+vector1.getVector(vector2));
   System.out.println();
   System.out.println("Scalar "+vector1.getScalar(vector2));
   System.out.println("Sum "+vector1.getSumm(vector2));
	}

}
