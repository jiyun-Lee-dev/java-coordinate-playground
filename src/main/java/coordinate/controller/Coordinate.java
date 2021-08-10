package coordinate.controller;

import coordinate.model.Figure;
import coordinate.view.InputView;
import coordinate.view.ResultView;

public class Coordinate {
    public void run() {
        Figure figure = InputView.inputPoints();
        ResultView.printAreaInfo(figure.getAreaInfo());
    }
}
