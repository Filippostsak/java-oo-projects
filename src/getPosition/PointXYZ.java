package getPosition;

public class PointXYZ {
    private double x;
    private double y;
    private double z;

    public PointXYZ(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String ConvertToString(){
        return "( " + x + ", " + y + ", " + z + " )";
    }
}
