
/**
 * Write a description of class MyPicture here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyPicture
{
    // instance variables - replace the example below with your own
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle tire;
    private Circle tire1;
    private Circle cap;
    private Circle cap1;
    private boolean drawn;

    /**
     * Constructor for objects of class MyPicture
     */
    public MyPicture()
    {
        // initialise instance variables
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        tire = new Circle();
        tire1 = new Circle();
        cap = new Circle();
        cap1 = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            wall.moveHorizontal(-140);
            wall.moveVertical(40);
            wall.changeSize(60);
            wall.changeColor("red");
            wall.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-50);
            window.moveVertical(40);
            window.changeSize(60);
            window.makeVisible();
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(30);
            roof.moveVertical(35);
            roof.makeVisible();
    
            tire.changeColor("black");
            tire.moveHorizontal(80);
            tire.moveVertical(100);
            tire.changeSize(65);
            tire.makeVisible();
            
            tire1.changeColor("black");
            tire1.moveHorizontal(-120);
            tire1.moveVertical(100);
            tire1.changeSize(65);
            tire1.makeVisible();
            
            cap.changeColor("gunmetal");
            cap.moveHorizontal(85);
            cap.moveVertical(105);
            cap.changeSize(55);
            cap.makeVisible();
            
            cap1.changeColor("gunmetal");
            cap1.moveHorizontal(-115);
            cap1.moveVertical(105);
            cap1.changeSize(55);
            cap1.makeVisible();
            drawn = true;
        }
    }
}
