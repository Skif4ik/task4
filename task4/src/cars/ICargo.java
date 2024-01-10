package cars;

public interface ICargo {
    double getMaxCargoWeight();

    //классы, реализующие этот интерфейс не обязаны
    //переопредялять default метод
    default int getMaxCapacity(){
        return 0;
    }
}