

import javafx.application.*;
import javafx.stage.Stage;


/**JAVADOC: GUI version of PacMan */
/**
 * 
 * @author Sami
 *
 */
public class FxGame extends Application{
	
	public static void main(String[] args) {
		
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
	
        //Location.initScreenDimensions();
        
      Map map = new Map();
       
       map.generateMap(primaryStage).show();
       
       map.startTimeline();


        
	}
}


