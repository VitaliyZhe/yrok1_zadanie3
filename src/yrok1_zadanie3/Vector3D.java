package yrok1_zadanie3;

public class Vector3D {
private float x,y,z;

public Vector3D(float x, float y, float z) {
	super();
	this.x = x;
	this.y = y;
	this.z = z;
}

public Vector3D() {
	super();
}
public Vector3D getVector(Vector3D vector) {
	Vector3D result=new Vector3D(y * vector.z - z * vector.y, z * vector.x - x * vector.z, x * vector.y - y * vector.x);
	return result;
    //return new Vector3D(y * vector.z - z * vector.y, z * vector.x - x * vector.z, x * vector.y - y * vector.x);
}
public float getScalar(Vector3D vector) {
    return x * vector.x + y * vector.y + z * vector.z;
}
public Vector3D getSumm(Vector3D vector) {
    return new Vector3D(x + vector.x, y + vector.y, z + vector.z);
}

@Override
public String toString() {
	return "[x=" + x + ", y=" + y + ", z=" + z + "]";
}


}
