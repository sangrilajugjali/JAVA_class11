package day_9;

 class Rectangle {
    private double breadth;
    private double length;
    private double area;
    private double perimeter;

    Rectangle(double l , double b){
        length=l;
        breadth=b;
    }
       void areaOfRectangle(){
            area = length * breadth;
            System.out.println( "Area of rectangle is : " + area );
        }
       void  perimeterOfRectangle(){
            perimeter = 2 * (length + breadth);
            System.out.println( "Perimeter of rectangle is : " + perimeter);
        }
    
     }
