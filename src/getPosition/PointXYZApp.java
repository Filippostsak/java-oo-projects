package getPosition;

/**
 * ορίζει ένα σημείο στον χώρο
 * με συντεταγμένες (x, y, z)
 */
public class PointXYZApp {
    public static void main(String[] args) {
        PointXYZ p1 = new PointXYZ(1,2,3);
        PointXYZ p2 = new PointXYZ(5,4,3);


        System.out.println(p1.ConvertToString());
        System.out.println(p2.ConvertToString());
    }
}
