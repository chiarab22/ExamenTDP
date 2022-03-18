import computer.*;
import director.Director;
import builder.*;
public class Main {
    public static void main(String[] args) {

        Director director = new Director();

        ComputerBuilder builder = new ComputerBuilder();

        director.constructComputer(builder);

        Computer computer = builder.getComputer();

       System.out.println("Creación computer:\n" + computer);

        ComputerManualBuilder manualComputer = new ComputerManualBuilder();

        director.constructComputer(manualComputer);
        Manual computerManual = manualComputer.getComputer();
        System.out.println("\nComputer manual built:\n" + computerManual.print());

    }
}