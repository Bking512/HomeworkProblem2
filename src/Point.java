public class Point {

    private int x;
    private int y;

    public Point()
    {
        x=0;
        y=0;
    }

    public Point(int xval, int yval)
    {
        this.x = xval;
        this.y = yval;
    }

    public int getY()
    {
        return this.y;
    }

    public int getX()
    {
        return this.x;
    }

    public void setPoint(int newX, int newY)
    {
        this.x = newX;
        this.y = newY;
    }

    public String toString()
    {
      return "("+ this.x + "," + this.y + ")";
    }

    public double distance(Point pnt)
    {
       double f1 = this.x - pnt.getX();
       double f2 = this.y - pnt.getY();
       return Math.sqrt(Math.pow(f1,2) + Math.pow(f2,2));
    }


}
