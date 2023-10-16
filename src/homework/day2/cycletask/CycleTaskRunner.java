package homework.day2.cycletask;

public class CycleTaskRunner {
    public static void main(String[] args) {
        PrintNumbers printNumbers = new PrintNumbers();
        printNumbers.printNum();

        PrintOddNumbers printOddNumbers=new PrintOddNumbers();
        printOddNumbers.printOddNum();

        int[] numbers=new int[7];
        CreateMass createMass = new CreateMass(numbers);
        createMass.setElements();

        PrintElements printElements=new PrintElements();
        printElements.printElements(numbers);

        PrintElementsReverse printElemRev = new PrintElementsReverse();
        printElemRev.printElementsRev(numbers);

        MultipleElements multipleElements = new MultipleElements();
        multipleElements.multipleElem(numbers);

        SquareElements squareElements = new SquareElements();
        squareElements.squareElem(numbers);

        MinElement minElement = new MinElement();
        minElement.minElement(numbers);

        ChangeElements changeElements =new ChangeElements();
        changeElements.changeElements(numbers);

        SortElements sortElements = new SortElements();
        sortElements.sortElements(numbers);
    }
}
