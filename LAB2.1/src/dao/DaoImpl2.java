package dao;

public class DaoImpl2 implements IDao2 {
    @Override
    public double getValue() {
        System.out.println("Version DAO2");
        return 20;
    }
}
