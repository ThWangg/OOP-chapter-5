public class LineSub extends Point{
     Point end;

     public LineSub(int beginX, int beginY, int endX, int endY) {
          super(beginX, beginY);
          this.end = new Point(endX, endY);
     }
   
     public LineSub (Point begin, Point end){
          super(begin.getX(), begin.getY());
          this.end = end;
     }

     public String toString(){
          return "Line(" + getX() + ", " + getY() + ");(" + end.getX() + ", " + end.getY() + ")";
     }

     public Point getBegin(){
          return new Point(getX(), getY());
     }


     public Point getEnd(){
          return end;
     }

     public void setBegin(Point begin){
          setX(begin.getX());
          setY(begin.getY());
     }

     public void setEnd(Point end){
          this.end = end;
     }

     public int getBeginX(){
          return getX();
     }

     public int getBeginY(){
          return getY();
     }

     public int getEndX(){
          return end.getX();
     }

     public int getEndY(){
          return end.getY();
     }

     public void setBeginX(int beginX){
          setX(beginX);
     }

     public void setBeginY(int beginY){
          setY(beginY);
     }

     public void setBeginXY(int beginX, int beginY){
          setX(beginX);
          setY(beginY);
     }


     public void setEndX(int endX){
          end.setX(endX);
     }

     public void setEndY(int endY){
          end.setY(endY);
     }

     public void setEndXY(int endX, int endY){
          end.setX(endX);
          end.setY(endY);
     }

     public int getLength(){
          int xDiff = end.getX() - getX();
          int yDiff = end.getY() - getY();
          return (int)Math.sqrt(xDiff*xDiff + yDiff*yDiff);
     }

     public double getGradient(){
          int xDiff = end.getX() - getX();
          int yDiff = end.getY() - getY();
          return Math.atan2(yDiff, xDiff);
     }
}