package metier;

import dao.IDao2;

public class MetierImpl2 implements IMetier2 {
    private IDao2 dao;

    // Injection par setter
    public void setDao(IDao2 dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double value = dao.getValue();
        return value * 1000;
    }
}
