



         
         
         
         
package my;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;  
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.RED;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.util.Duration;
import javax.swing.JSlider;


public class  My_project_ok  extends Application{
   
    
       Stage stage1=new Stage();
       //  Rectangle r = new  Rectangle(5,5,80,75);
           Rectangle r_s = new  Rectangle(5,5,80,75);
           Circle circle_s =new Circle(50, 30, 30);
        Circle circle1=new Circle(50, 30, 30);
         Circle circle2=new Circle(30, 150, 30);
          Circle circle3=new Circle(170, 50, 30);
            Pane cpane = new Pane();
             Pane rpane = new Pane();
             JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);  
             //Timeline loop_c,loop_r;
           Scene  scene;
       @Override
    public void start(Stage primaryStage)  {
   // FlowPane a = new FlowPane();   GridPane a = new GridPane(10,10,3,3);
        VBox a=new VBox();


 
    
    Text t1=new Text(10,10, "Click triangle to saw a triangle  ");
     Button bt1 = new Button("show triangle"); 
    Text t2=new Text(10,10, "Click rectangle to saw a rectangle");
    Button bt2 = new Button("show rectangle"); 
     Text t3=new Text(10,10, "Click circle to saw a circle     ");
     Button bt3 = new Button("show circle"); 
      Button next = new Button("NEXT"); 
     
     Text t4=new Text(10,10, "Increasing size of rectangle     ");
      Button bt4 = new Button("Button 1"); 
     Text t5=new Text(10,10, "Increasing size of circle        ");
      Button bt5 = new Button("Button 2"); 
     
      Text t6=new Text(10,10, "moving circle                   ");
       Text t7=new Text(10,10, "moving rectangle               ");
       
    Button brec = new Button("moving RECTANGLE");
    Button bcrcl = new Button(" moving CIRCLE"); 
       Text start1=new Text(10,10, "Welcome !!  ");
       Text start2=new Text(10,10, "Project on software devolopment  ");
       Text start3=new Text(10,10, "Prepared by MD :ASIKUL ISLAM  ");
       Text start4=new Text(10,10, " Department Of CSE ( Roll :133064)  ");
       Button start5=new Button("ok");
      VBox startbox=new VBox();
      startbox.getChildren().addAll(start1,start2,start3,start4,start5);
   
     t1.setStroke(RED);
     t2.setStroke(Color.BLUE);
      t3.setStroke(Color.DARKMAGENTA);
    a.getChildren().addAll(t1,bt1,t2,bt2,t3,bt3,next);//);
     Button next1 = new Button("NEXT"); 
     Button home = new Button("home"); 
     Button game = new Button("Game"); 
next.setOnAction(e-> { 
  
   VBox b=new VBox();
   b.getChildren().addAll(t4,bt4,t5,bt5,next1);
   primaryStage.setScene(new Scene(b));
   
   
   });
   
   
next1.setOnAction(e-> {
        
    VBox c=new VBox();
    c.getChildren().addAll(t6,brec,t7,bcrcl,home,game);
    primaryStage.setScene(new Scene(c));          
    });
    
home.setOnAction(e-> { 
   primaryStage.setScene(scene);
   });


game.setOnAction(e-> { 
   Tennis s1 = new Tennis(); 
   });


    
    
    
    bt1.setOnAction(e-> { triangle(); });
    bt3.setOnAction(e-> {show_circle(); });
    bt2.setOnAction(e-> { show_rectangle(); });
    brec.setOnAction(e->{rectangle();});
    bcrcl.setOnAction(e->{circle();});
    bt4.setOnAction(e->{increase_rectangle();});
    bt5.setOnAction(e->{increase_circle();});
    
    
   // Scene
            scene=new Scene(a,300,677);
    primaryStage.setScene(scene);
    primaryStage.show();
    primaryStage.setTitle("primary stage");
    primaryStage.setX(150);
      primaryStage.setY(150);
    primaryStage.setHeight(500);
    primaryStage.setWidth(300);
    
    
    }

   public static void main (String args[]){
      
      Application.launch(args);
      
  }
       


    public void triangle(){
   
      Pane pane = new FlowPane();
       Polyline polyline = new Polyline();
       polyline.getPoints().addAll(new Double[]{
    20.0, 200.0,
    150.0, 20.0,
    280.0, 200.0 });
    polyline.setFill(Color.DARKORANGE);
   
    pane.getChildren().add(polyline);

 Scene scene1=new Scene(pane);
   stage1.setScene(scene1);
//if(!stage1.isShowing()){
   stage1.setTitle("1st stage");
   stage1.setWidth(300);
   stage1.setHeight(300);
   stage1.show();

//}
   
  
    }
    
    
  public void rectangle(){  
   Rectangle r = new  Rectangle(50,5,80,75);
    Rectangle r1 = new  Rectangle(100,59,83,76);
     Rectangle r2 = new  Rectangle(1,100,84,77);
   r.setFill(Color.BLUE);
   rpane.getChildren().addAll(r,r1,r2);
  Scene scene2=new Scene(rpane);
   stage1.setScene(scene2);
   
  // if(!stage1.isShowing()){
   stage1.setTitle("1st stage");
   stage1.setWidth(300);
   stage1.setHeight(300);
   stage1.show();//}
  
   rmoving(r);
     rmoving(r1);
       rmoving(r2);
   
  
 //loop_r.stop();
    }
    
  public void rmoving(Rectangle r){
    Timeline loop_r;
 //loop_c.stop();
  loop_r = new Timeline(new KeyFrame(Duration.millis(10), new EventHandler<ActionEvent>() {
            double deltaX = 1;
            double deltaY = 1;
            @Override
            public void handle( ActionEvent t) {
                r.setX(r.getX()+deltaX);
                  r.setY(r.getY()+deltaY);
               //System.out.println( r.getX()+rpane.getWidth());
             Bounds bounds = rpane.getBoundsInLocal();
              boolean atRightBorder = r.getX()+r.getWidth() >= rpane.getWidth();
              boolean atLeftBorder = r.getX() <= 0;
               boolean atBottomBorder = r.getY()+r.getHeight() >= (rpane.getHeight() );
               boolean atTopBorder =r.getY() <= 0;
                  if (atRightBorder || atLeftBorder) {
                   deltaX *= -1;
               }
               if (atBottomBorder || atTopBorder) {
                   deltaY *= -1;
               }
              
               
               }}));
        loop_r.setCycleCount(Timeline.INDEFINITE);
        loop_r.play();
        
        
        
      
}
    
    
   public void circle(){

         
     cpane=new Pane();
       
        circle1.setFill(RED);
   
         
       cpane.getChildren().addAll(circle1,circle2,circle3);
    
 Scene scene3=new Scene(cpane);
   stage1.setScene(scene3); 
   //if(!stage1.isShowing()){
   stage1.setTitle("1st stage");
  stage1.setWidth(300);
  stage1.setHeight(300);
   stage1.show();
  
   //}
   cmoving(circle1);
    cmoving(circle2);
    cmoving(circle3);
    
   }
   
public void cmoving( Circle circle){
    Timeline loop_c;
 
     //loop_r.stop();
      loop_c = new Timeline(new KeyFrame(Duration.millis(10), new EventHandler<ActionEvent>() {
            double deltaX = 1;
            double deltaY = 1;
            @Override
            public void handle( ActionEvent t) {
               circle.setCenterX(circle.getCenterX() + deltaX);
              circle.setCenterY(deltaY + circle.getCenterY());
               
               Bounds bounds = cpane.getBoundsInLocal();
               boolean atRightBorder = circle.getCenterX() >= (cpane.getWidth() - circle.getRadius());
               boolean atLeftBorder = circle.getCenterX() <= (cpane.getMinWidth() + circle.getRadius());
               boolean atBottomBorder = circle.getCenterY() >= (cpane.getHeight() - circle.getRadius());
               boolean atTopBorder = circle.getCenterY() <= (cpane.getMinHeight() + circle.getRadius());
               
              if (atRightBorder || atLeftBorder) {
                   deltaX *= -1;
               }
               if (atBottomBorder || atTopBorder) {
                   deltaY *= -1;
               }
            
            }}));
        loop_c.setCycleCount(1000);
       
        loop_c.play();
      
 
}



public void show_rectangle()
{
   Pane pane_s=new Pane();
   r_s.setFill(Color.RED);
   pane_s.getChildren().add(r_s);
   Scene scene1=new Scene(pane_s,900,300);
   stage1.setScene(scene1);
   stage1.setTitle("1st stage");
   stage1.setWidth(300);
   stage1.setHeight(300);
   stage1.show();

}
public void show_circle()
{
 FlowPane pane_s=new FlowPane();
   circle_s.setFill(Color.RED);
   pane_s.getChildren().add(circle_s);

   Scene scene1=new Scene(pane_s,900,900);
   stage1.setScene(scene1);
   stage1.setTitle("1st stage");
   stage1.setWidth(300);
   stage1.setHeight(300);
   stage1.show();
}
public void increase_rectangle()
{
    show_rectangle();
r_s.setWidth(r_s.getWidth()+1);
r_s.setHeight(r_s.getWidth()+1);
}
public void increase_circle()
{
    show_circle();
circle_s.setRadius(circle_s.getRadius()+2);
}





}//main class

   
 
  
    
   
 

    
 

  
  