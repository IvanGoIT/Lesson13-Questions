import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.Random;

public class Program extends Application {
    private static final Random r = new Random();

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();
        primaryStage.setScene(new Scene(root));

        GridPane grid = new GridPane();
        int size = 5;
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                String url = r.nextBoolean() ?
                        "http://iconclub.ru.images.1c-bitrix-cdn.ru/upload/resize_cache/iblock/46d/680_310_2/46daebb9e3fc5ae03daeaff391b9531d.jpg?1438239740143566" :
                        "https://image.flaticon.com/teams/slug/freepik.jpg";
                ImageView image = new ImageView(url);
                image.setFitHeight(150);
                image.setFitWidth(150);
                image.setPreserveRatio(true);
                grid.add(image, i, j);
            }
        }

        root.getChildren().addAll(grid);
        primaryStage.setWidth(900);
        primaryStage.setHeight(900);
        primaryStage.show();
    }
}
