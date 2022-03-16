package dao;

public class DaoImpl implements IDao{
    @Override
    public double getData() {
        /*
        Se connecter a la BD pur recuperer la temperature
         */
        System.out.println("version base de donnees");
        double temp=Math.random()*50;
        return temp;
    }
}
