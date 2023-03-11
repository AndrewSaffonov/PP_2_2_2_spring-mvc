package web.Dao;

import org.springframework.stereotype.Component;
import web.Dao.CarDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {
    private final List<Car> carList;

    public CarDaoImpl() {
        carList = new ArrayList<>();

        carList.add(new Car("Lada Priora", "White", 2007));
        carList.add(new Car("Moskvich 412", "red", 1980));
        carList.add(new Car("Volga", "black", 1990));
        carList.add(new Car("Zaz-968M", "green", 1967));
        carList.add(new Car("Audi 80", "grey", 1986));
    }

    @Override
    public List<Car> getCarsList(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }

}
