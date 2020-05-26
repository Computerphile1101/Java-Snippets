import java.awt.*;
import java.util.*;

public class Final_Project {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
		DrawingPanel panel = new DrawingPanel(600, 400);
		Graphics g = panel.getGraphics();
        Scanner console = new Scanner(System.in);
        

        System.out.println("Welcome. I heard you were wanting a new home. I am here to help.");
        System.out.println();
        background(g,console);
        walkway(g, console);
        house(g,console);
        chimney(g, console);
        roof(g,console);
        window(g,console);
        door(g,console);
        tree(g,console);
        System.out.println();
        System.out.println("Your house has been built. Enjoy your new home.");
        
        
    }//end main

public static void background(Graphics g, Scanner console) {

	System.out.println("Do you want it to be night or day?");
	String backgroundChoice = console.nextLine();

	if(backgroundChoice.equalsIgnoreCase("night")) {
	
	//Black Sky
	g.fillRect(0, 0, 600, 200);
	//Dark Green Grass
	g.setColor(new Color(7,76,42));
	g.fillRect(0, 200, 600, 200);
	//Random stars
	g.setColor(Color.WHITE);
	for(int i = 1; i<=55; i++) {
		g.fillOval((int)(Math.random()*600),(int)(Math.random()*198), 2, 2);
	}
	//Moon
	g.setColor(Color.GRAY);
	g.fillOval(502, 22, 47, 47);
	g.setColor(new Color(208,238,240));//gray 2
	g.fillOval(504, 24, 40, 40);
	g.setColor(new Color(186,215,217)); //gray3
	g.fillOval(506, 26, 35, 35);
	g.fillOval(528, 27, 10, 10);
	g.fillOval(510, 27, 10, 10);
	g.fillOval(507, 48, 10, 10);
	g.fillOval(515, 48, 15, 15);
	g.fillOval(526, 44, 14, 14);
	g.setColor(new Color(155,167,168));//gray4
	g.fillOval(520, 39, 12, 12);
	g.fillOval(530, 39, 4, 4);
	g.fillOval(518, 54, 8, 8);
	g.fillOval(509, 52, 5, 5);
	g.fillOval(507, 37, 9, 9);
	g.fillOval(532, 52, 6, 6);
	g.fillOval(535, 43, 4, 4);
	g.fillOval(521, 30, 6, 6);
	System.out.println("You picked the night....welcome to the Dark Side my friend....");
	
}


	else if (backgroundChoice.equalsIgnoreCase("day")) {
	//Blue Sky
	g.setColor(new Color(97,228,255));
	g.fillRect(0, 0, 600, 200);
	//Light Green Grass
	g.setColor(new Color(19,181,60));
	g.fillRect(0, 200, 600, 200);
	//Clouds
	g.setColor(Color.WHITE);
	//Starting position for first cloud. Clouds are "assigned" positions. Random clouds looked stupid.
	int cloudX = 40;
	int cloudY = 120;		
	for(int i = 1; i<= 4; i++) {
	//Main body of cloud
	g.fillOval(cloudX, cloudY, 70, 20);
	//"Bumps on cloud"
	g.fillOval(cloudX, cloudY-5, 30, 20);
	g.fillOval(cloudX+20, cloudY-11, 30, 30);
	g.fillOval(cloudX+40, cloudY-6, 30, 20);
	//Checks integer i and "assigns" new cloud positions. Had to use if/else statement since there was no pattern in location.
	if (i==1) {
	cloudX = 105;
	cloudY = 25;
	}
	else if (i==2) {
	cloudX = 305;
	cloudY = 40;			
	}
	else {
	cloudX = 500;
	cloudY = 135;		
	}
	}//end of for loop for clouds
	//Sun Border
	g.setColor(Color.ORANGE);
	g.fillOval(502, 22, 47, 47);
	//Sun Middle
	g.setColor(Color.YELLOW);
	g.fillOval(508, 28, 35, 35);
	System.out.println("You picked the daytime....its been said that the day is a brief respite to the looming darkness of the night. So poetic. I'm welling up with tears over here.");
	
	}
	
	else {
		System.out.println("Invalid character response. Please try again.");
		background(g,console);	
	}
	System.out.println();
	
}


public static void house (Graphics g, Scanner console) {
	System.out.println("Pick a house color; choices are: Tan, Dark Grey, Light Blue, Ivory, Light Brown, Light Grey, Red, Orange, Black, Cyan, Yellow, Green, Purple ");
	String houseChoice =console.nextLine();
	g.setColor(Color.BLACK);
	

	if(houseChoice.equalsIgnoreCase("Red")){
		
		g.fillRect(146, 146, 308, 158);
		g.setColor(new Color(255, 26, 26));
		System.out.println("You picked red. That reminds me of a book I red the other day. Ha...ha...ha.");
		
	}
	else if(houseChoice.equalsIgnoreCase("Light Grey")) {
		
		g.fillRect(146, 146, 308, 158);
		g.setColor(new Color(153, 153, 153));	
		System.out.println("You picked light grey. Fun fact: light grey is lighter than dark grey.");
	
	}
	else if(houseChoice.equalsIgnoreCase("Orange")) {
		g.fillRect(146, 146, 308, 158);
		g.setColor(new Color(255, 193, 77));	
		System.out.println("You picked orange. Orange you glad you didn't pick a different color?");
		
	}
	else if(houseChoice.equalsIgnoreCase("Ivory")) {
		g.fillRect(146, 146, 308, 158);
		g.setColor(new Color(238, 213, 183));	
		System.out.println("You picked ivory. Ivory much like that choice...ha..ha..ha.");
		
	}
	else if(houseChoice.equalsIgnoreCase("Black")) {
		g.fillRect(146, 146, 308, 158);
		g.setColor(new Color(26, 26, 26));
		System.out.println("You picked black. Like my heart.....");
		
	}	
	else if(houseChoice.equalsIgnoreCase("Light Blue")) {
		
		g.fillRect(146, 146, 308, 158);
		g.setColor(new Color(76, 199, 229));
		System.out.println("You picked light blue. That choice just blue me away....");
		
	}
	else if(houseChoice.equalsIgnoreCase("Cyan")) {
		g.fillRect(146, 146, 308, 158);
		g.setColor(new Color(0, 204, 204));
		System.out.println("You picked cyan. Never thought you would.");
		
	}
	else if(houseChoice.equalsIgnoreCase("Yellow")) {
		g.fillRect(146, 146, 308, 158);
		g.setColor(new Color(255, 255, 102));
		System.out.println("You picked yellow. Fun fact: yellow rhymes with Jell-O, which rhymes with mellow, which rhymes with hello, which doesn't rhyme with zebra.");
		
	}
	else if(houseChoice.equalsIgnoreCase("Green")) {
		
		g.fillRect(146, 146, 308, 158);
		g.setColor(new Color(51, 255, 51));
		System.out.println("You picked green. #SavePlanetEarth anyone?");
		
	}	
	else if(houseChoice.equalsIgnoreCase("Purple")) {
		
		g.fillRect(146, 146, 308, 158);
		g.setColor(new Color(117, 26, 255));
		System.out.println("You picked purple.....the same color that your face will turn if you try holding your breath for ten minutes.");
		
	}	
	else if(houseChoice.equalsIgnoreCase("Light Brown")) {
		
		g.fillRect(146, 146, 308, 158);
		g.setColor(new Color(222,184,135));
		System.out.println("You picked light brown. What a boring choice. Your life must not have much spice.");
		
	}	
	else if(houseChoice.equalsIgnoreCase("Tan")) {
		
		g.fillRect(146, 146, 308, 158);
		g.setColor(new Color(219, 195, 164));
		System.out.println("You picked tan. Almost more boring than if you would have picked brown.");
		
	}	
	else if(houseChoice.equalsIgnoreCase("Dark Grey")) {
	
	g.fillRect(146, 146, 308, 158);
	g.setColor(new Color(112, 128, 144));
	System.out.println("You picked dark grey. Fun fact: dark grey is darker than light grey.");
	
	}
	else{
	System.out.println("Invalid character response. Please try again.");
	house(g,console);
	}
	g.fillRect(150, 150, 300, 150);
	System.out.println();
} 


public static void chimney(Graphics g,Scanner console) {
	
	System.out.println("Pick a mystery chimney: chimney1, chimney2, or chimney3.");
	String chimneyChoice = console.nextLine();
	int chimneyX = 380;
	int chimneyY = 35;
	
	if(chimneyChoice.equalsIgnoreCase("chimney1")) {
	
	g.setColor(new Color(255,125,104));	
	
	for(int i = 2; i<=7;i++) {
	g.fillRect(chimneyX, chimneyY, 20, 10);
	
	chimneyY+=10;
	if(i%2==0) {
		g.setColor(new Color(232,219,189));
	}else {
		g.setColor(new Color(255,125,104));	
	}
	}
	System.out.println("You picked Chimney #1. Statistically speaking, there was only a 33.3% chance that you would pick it. Facts.");
	
	}
	

	else if(chimneyChoice.equalsIgnoreCase("chimney2")) {
	
	
	g.setColor(new Color(66,36,17));	
	
	for(int i = 2; i<=6;i++) {
		
	g.fillRect(chimneyX, chimneyY, 4, 60);
	chimneyX+=4;
	
	if(i%2==0) {
		g.setColor(new Color(232,219,189));
	}else {
		g.setColor(new Color(66,36,17));	
	}
	}
	System.out.println("You picked Chimney #2. Guess you're the type of person to settle for being #2.");
	
	}
	
	else if(chimneyChoice.equalsIgnoreCase("chimney3")) {

	g.setColor(new Color(44,7,59));	
	g.fillRect(chimneyX, chimneyY, 20, 60);
	
	for(int i = 1; i<=6;i++) {
	g.setColor(new Color(60,200,200));
	g.drawLine(chimneyX, chimneyY, chimneyX+20, chimneyY+10);
	chimneyY+=10;
	
	}
	System.out.println("You picked Chimney #3. Back in the 18th century, the number 3 was not considered to be a lucky or magical number or anything. It was just the number 3. Like every other number.");
	
	}
	
	else {
		System.out.println("Invalid character response. Please try again.");
		chimney(g,console);	
		
	}
	System.out.println();
	}

public static void roof (Graphics g, Scanner console) {
	System.out.println("Pick a roof color; choices are: Tan, Dark Grey, Light Blue, Slate Grey, Ivory, Light Grey, Light Brown, Red, Orange, Cyan, Yellow, Green, Purple ");
	String roofChoice =console.nextLine();
	g.setColor(Color.BLACK);
	Polygon poly1 = new Polygon();
    poly1.addPoint(97, 154);	//left
    poly1.addPoint(300, 15);    //top
    poly1.addPoint(503, 154);  	//right     
    
	
	if(roofChoice.equalsIgnoreCase("Red")){
	g.fillPolygon(poly1);
	g.setColor(new Color(255, 26, 26));
	System.out.println("You picked red. That reminds me of a book I red the other day. Ha...ha...ha.");
	
	}
	else if(roofChoice.equalsIgnoreCase("Orange")) {
	g.fillPolygon(poly1);
	g.setColor(new Color(255, 193, 77));	
	System.out.println("You picked orange. Orange you glad you didn't pick a different color?");
	
	}
	else if(roofChoice.equalsIgnoreCase("Light Grey")) {
		g.fillPolygon(poly1);
		g.setColor(new Color(153, 153, 153));
		System.out.println("You picked light grey. Fun fact: light grey is lighter than dark grey.");
		
		}	
	else if(roofChoice.equalsIgnoreCase("Dark Grey")) {
	g.fillPolygon(poly1);
	g.setColor(new Color(112, 128, 144));
	System.out.println("You picked dark grey. Fun fact: dark grey is darker than light grey.");
	
	}
	else if(roofChoice.equalsIgnoreCase("Ivory")) {
		g.fillPolygon(poly1);
		g.setColor(new Color(238, 213, 183));
		System.out.println("You picked ivory. Ivory much like that choice...ha..ha..ha.");
		
	}	
	else if(roofChoice.equalsIgnoreCase("Light Blue")) {
	g.fillPolygon(poly1);
	g.setColor(new Color(76, 199, 229));
	System.out.println("You picked light blue. That choice just blue me away....");
	
	}
	else if(roofChoice.equalsIgnoreCase("Cyan")) {
	g.fillPolygon(poly1);
	g.setColor(new Color(0, 204, 204));
	System.out.println("You picked cyan. Never thought you would.");
	
	}
	else if(roofChoice.equalsIgnoreCase("Yellow")) {
	g.fillPolygon(poly1);
	g.setColor(new Color(255, 255, 102));	
	System.out.println("You picked yellow. Fun fact: yellow rhymes with Jell-O, which rhymes with mellow, which rhymes with hello, which doesn't rhyme with zebra.");
	
	}
	else if(roofChoice.equalsIgnoreCase("Green")) {
	g.fillPolygon(poly1);	
	g.setColor(new Color(51, 255, 51));	
	System.out.println("You picked green. #SavePlanetEarth anyone?");
	
	}	
	else if(roofChoice.equalsIgnoreCase("Purple")) {
	g.fillPolygon(poly1);
	g.setColor(new Color(117, 26, 255));	
	System.out.println("You picked purple.....the same color that your face will turn if you try holding your breath for ten minutes.");
	
	}	
	else if(roofChoice.equalsIgnoreCase("Brown")) {
    
	g.fillPolygon(poly1);
	g.setColor(new Color(192, 128, 64));	
	System.out.println("You picked brown. What a boring choice. Your life must not have much spice.");
	
	}	
	else if(roofChoice.equalsIgnoreCase("Tan")) {
	g.fillPolygon(poly1);
	g.setColor(new Color(219, 195, 164));
	System.out.println("You picked tan. Almost more boring than if you would have picked brown.");
	
	}
	else if(roofChoice.equalsIgnoreCase("Light Brown")) {
		g.fillPolygon(poly1);
		g.setColor(new Color(222,184,135));
		System.out.println("You picked light brown. What a boring choice. Your life must not have much spice.");
		
		}	
	else if(roofChoice.equalsIgnoreCase("Slate Grey")) {
		g.fillPolygon(poly1);
		g.setColor(new Color(112, 128, 144));
		System.out.println("You picked slate grey. How modern.");
		
		}
	else{
		System.out.println("Invalid character response. Please try again.");
		roof(g,console);		
	}
	Polygon poly = new Polygon();
    poly.addPoint(110, 150);
    poly.addPoint(300, 20);
    poly.addPoint(490, 150);        
    g.fillPolygon(poly);
    System.out.println();
} 


public static void window(Graphics g,Scanner console) {
	
	System.out.println("What type of windows do you want? Your options are: square, curtains, or circular");
	String windowChoice = console.nextLine();
	
	if(windowChoice.equalsIgnoreCase("square")) {
	//square window

        //first window
        g.setColor(Color.BLACK);
            g.fillRect(181, 161, 58, 58);
            g.setColor(Color.YELLOW);
            g.fillRect(185,165,50,50);
            g.setColor(Color.BLACK);
            g.fillRect(208,165, 4, 50);
            g.fillRect(185,188, 50, 4);          
            //second window
            g.setColor(Color.BLACK);
            g.fillRect(361,161,58,58);
            g.setColor(Color.YELLOW);
            g.fillRect(365,165,50,50);
            g.setColor(Color.BLACK);
            g.fillRect(389, 165, 4, 50);
            g.fillRect(365, 188, 50, 4);           
            //third window
            g.setColor(Color.BLACK);
            g.fillRect(361, 230, 58, 58);
            g.setColor(Color.YELLOW);
            g.fillRect(365,234 ,50,50);
            g.setColor(Color.BLACK);
            g.fillRect( 389, 234, 4,50);
            g.fillRect(365,257, 50, 4);
            //forth window
            g.setColor(Color.BLACK);
            g.fillRect(181, 230, 58, 58);
            g.setColor(Color.YELLOW);
            g.fillRect(185,234,50,50);
            g.setColor(Color.BLACK);
            g.fillRect(208,234, 4, 50);
            g.fillRect(185,257, 50, 4);    
        	System.out.println("You picked square windows. Do you know why squares make great photographers? Because they know all the right angles. Ha...ha...ha.");
        	
	}
	
	else if(windowChoice.equalsIgnoreCase("curtains")) {

		//square window

	        //first window
	        g.setColor(Color.BLACK);
	            g.fillRect(181, 161, 58, 58);
	            g.setColor(Color.YELLOW);
	            g.fillRect(185,165,50,50);
	            
	            g.setColor(new Color(20, 32, 41));
	            g.fillRect(185, 165, 10, 50);
                g.fillRect(225, 165, 10,50);
	            
	            g.setColor(Color.BLACK);
	            g.fillRect(208,165, 4, 50);
	            g.fillRect(185,188, 50, 4); 
	            
	            
	            //second window
	            g.setColor(Color.BLACK);
	            g.fillRect(361,161,58,58);
	            g.setColor(Color.YELLOW);
	            g.fillRect(365,165,50,50);
	            
	            g.setColor(new Color(20, 32, 41));
                g.fillRect(365, 165, 10, 50);
                g.fillRect(405, 165, 10, 50);
	            
	            g.setColor(Color.BLACK);
	            g.fillRect(389, 165, 4, 50);
	            g.fillRect(365, 188, 50, 4);  
	            
	            
	            //third window
	            g.setColor(Color.BLACK);
	            g.fillRect(361, 230, 58, 58);
	            g.setColor(Color.YELLOW);
	            g.fillRect(365,234 ,50,50);
	            
	            g.setColor(new Color(20, 32, 41));
	            g.fillRect(365, 234, 10, 50);
                g.fillRect(405, 234, 10, 50);
	            
	            g.setColor(Color.BLACK);
	            g.fillRect( 389, 234, 4,50);
	            g.fillRect(365,257, 50, 4);
	            
	            
	            
	            //fourth window
	            g.setColor(Color.BLACK);
	            g.fillRect(181, 230, 58, 58);
	            g.setColor(Color.YELLOW);
	            g.fillRect(185,234,50,50);
	            
	            g.setColor(new Color(20, 32, 41));
                g.fillRect(185, 234, 10, 50);
                g.fillRect(225, 234, 10, 50);
	            
	            g.setColor(Color.BLACK);
	            g.fillRect(208,234, 4, 50);
	            g.fillRect(185,257, 50, 4); 	
	        	System.out.println("You picked windows with curtains. Now when you wake up, you won't be able to see the beautiful sunrise. Congrats on ruining one of the few breathtaking moments in life for yourself.");
	        	
	}
	
	
	else if (windowChoice.equalsIgnoreCase("circular")) {
	

	      //circle 
        //first window
    g.setColor(Color.BLACK);
        g.fillOval(181, 161, 58, 58);
        g.setColor(Color.YELLOW);
        g.fillOval(185,165,50,50);
        g.setColor(Color.BLACK);
        g.fillRect(208,165, 4, 50);
        g.fillRect(185,188, 50, 4);          
        //second window
        g.setColor(Color.BLACK);
        g.fillOval(361,161,58,58);
        g.setColor(Color.YELLOW);
        g.fillOval(365,165,50,50);
        g.setColor(Color.BLACK);
        g.fillRect(389, 165, 4, 50);
        g.fillRect(365, 188, 50, 4);           
        //third window
        g.setColor(Color.BLACK);
        g.fillOval(361, 230, 58, 58);
        g.setColor(Color.YELLOW);
        g.fillOval(365,234 ,50,50);
        g.setColor(Color.BLACK);
        g.fillRect( 389, 234, 4,50);
        g.fillRect(365,257, 50, 4);
        //forth window
        g.setColor(Color.BLACK);
        g.fillOval(181, 230, 58, 58);
        g.setColor(Color.YELLOW);
        g.fillOval(185,234,50,50);
        g.setColor(Color.BLACK);
        g.fillRect(208,234, 4, 50);
        g.fillRect(185,257, 50, 4);
    	System.out.println("You picked circular windows. Is it just me or are circles kind of pointless? Ha..ha...ha.");
    	
	}
	
	else {
		System.out.println("Invalid character response. Please try again.");
		window(g,console);	
	}
	System.out.println();
}	


public static void door(Graphics g,Scanner console) {
	
	System.out.println("What kind of door would you prefer? Your choices are: classic, glass, or windowless.");
	String doorChoice = console.nextLine();
	
	if(doorChoice.equalsIgnoreCase("classic")) {
	//door option one. classic

		g.setColor(Color.BLACK);

        g.fillRect(270, 200, 60, 100);

        g.setColor(new Color(112, 6, 11));

           g.fillRect(274, 204, 52, 96);

           g.setColor(Color.BLACK);

           g.fillRect(278,208,44,40);          

           g.setColor(Color.YELLOW);

           g.fillRect(282,212,36,32);          

           g.setColor(Color.BLACK);

           g.fillRect(298,212,4,32);

           g.fillRect(282,226,36,4);          

         

           g.fillOval(314, 250,10,10);

           System.out.println("You picked classic. Classic choice, my friend.");
           System.out.println(); 
           }
	

	else if (doorChoice.equalsIgnoreCase("glass")) {
	//door option two. glass

		g.setColor(Color.BLACK);

        g.fillRect(270, 200, 60, 100);

        g.setColor(new Color(0, 135, 88));

           g.fillRect(274, 204, 52, 96);

           g.setColor(Color.BLACK);

           g.fillRect(278,208,35,88);          

           g.setColor(Color.YELLOW);

           g.fillRect(282,212,27,80);          

           g.setColor(Color.BLACK);

           g.fillRect( 587/2 ,212,4,80 );

           g.fillRect(282,236  ,27  ,4);

           g.fillRect(282, 264, 27, 4);                  

           g.fillOval(314, 250,10,10);

           System.out.println("You picked glass. Looks like nobody will have trouble breaking into your house.");
           
	}
	
	
	else if (doorChoice.equalsIgnoreCase("windowless")) {
	//door option three. Windowless

		g.setColor(Color.BLACK);

        g.fillRect(270, 200, 60, 100);

        g.setColor(new Color(110, 36, 5));

           g.fillRect(274, 204, 52, 96);

           g.setColor(Color.BLACK);

           g.drawRect(278,208,20 ,40 );

           g.drawRect(302, 208, 20, 40);

           g.drawRect(278, 258,20,40);

           g.drawRect(302, 258, 20, 40);

          

           g.drawRect(280, 210, 16, 36);

           g.drawRect(304, 210, 16, 36);

           g.drawRect(280, 260, 16, 36);

           g.drawRect(304, 260, 16, 36);          

           g.fillOval(314, 250,10,10);
       	System.out.println("You picked windowless. Introvert.");
       	
           
	}
	else {
		System.out.println("Invalid character response. Please try again.");
		door(g,console);	
	}
	System.out.println(); 
}



public static void walkway(Graphics g,Scanner console) {
	
	System.out.println("Do you want your walkway to be stone or concrete?");
	String walkwayChoice = console.nextLine();

	
	g.setColor(new Color(133,133,133));
	int stoneX = 267;
	int stoneY = 395;
	if(walkwayChoice.equalsIgnoreCase("stone")) {
	
	//Draws all 6 zigzag stone segments
	for(int i = 1;i<=6;i++) {
	
	//Connects right/left path segments
	for(int j = 1; j<=2;j++) {

	//Winds path segment right
	for(int k = 1; k<= 3; k++) {
	g.fillOval(stoneX,stoneY, 8, 6);
	stoneX += 8;
	stoneY -= 8;
	}
	
	//Winds path segment left
	for(int k = 1; k<= 3; k++) {	
	g.fillOval(stoneX,stoneY, 8, 6);
	stoneX -= 8;
	stoneY -= 8;
	}
	}
	
	stoneX = (10*i)+257;
	stoneY = 395;
	}//end of main for loop
   	System.out.println("You picked the stone walkway. Thanks a lot. Do you know how hard it is for me to draw stones on the panel?");
	} else if (walkwayChoice.equalsIgnoreCase("concrete")){
		//triangular concrete walkway
		Polygon poly2 = new Polygon();
		poly2.addPoint(245,400);
		poly2.addPoint(300,200);
		poly2.addPoint(355,400);
		g.fillPolygon(poly2);
	   	System.out.println("You picked the concrete walkway. Bless your soul, so much easier for me to draw.");
	}
	else {
		System.out.println("Invalid character response. Please try again.");
		walkway(g,console);		
	}	
	System.out.println();
}


public static void tree(Graphics g,Scanner console) {
	
	System.out.println("Would you like apples or oranges on your tree?");
	String fruitChoice = console.nextLine();
	
	
	//Tree trunk
	g.setColor(new Color(129,76,52));
	g.fillPolygon(new int[] {500, 520, 540}, new int[] {370, 250, 370}, 3);
	//Leafy section
	g.setColor(Color.GREEN);
	g.fillOval(429,220, 110, 40);
	g.fillOval(499,220, 110, 40);
	g.fillOval(469,195, 110, 40);
	g.fillOval(489,170, 70, 40);
	
	if(fruitChoice.equalsIgnoreCase("apples")) {
		g.setColor(Color.RED);
	   	System.out.println("You picked apples. Wait for it.......HOW DO YOU LIKE THEM APPLES!!!");
	   	
	}else if(fruitChoice.equalsIgnoreCase("oranges")) {
		g.setColor(Color.ORANGE);
	   	System.out.println("You picked oranges. I sprayed that fruit tree with pesticides by the way. Enjoy.");
	   	
	} 
	else {
		System.out.println("Invalid character response. Please try again.");
		tree(g,console);	
	}
	
	//draw apple/oranges
	int fruitX = 508;
	int fruitY = 180;
	
	for(int i = 1; i<=3; i++) {
		
		fruitX = 524-(i*20);
				
		for (int j = 1; j<=2*i;j++) {
		g.fillOval(fruitX, fruitY, 10, 10);
		fruitX +=20;
		}
		
		fruitY+=28;
	}	
}


}//end class
