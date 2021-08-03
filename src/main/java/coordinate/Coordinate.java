package coordinate;

public class Coordinate {
    public PointsGenerator getPoints() {
        while(true) {
            try {
                InputView inputView = new InputView();
                return new PointsGenerator(inputView.getInputForFigure());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void run() throws Exception {
        PointsGenerator pointsGenerator = getPoints();

        FigureFactory figureFactory = new FigureFactory();
        Figure figure = figureFactory.create(pointsGenerator.getPointsList());

        ResultView resultView = new ResultView();
        resultView.printMeasure(figure.getName(), figure.measure());
    }

    public static void main(String[] args) throws Exception {
        Coordinate coordinate = new Coordinate();
        coordinate.run();
    }
}
