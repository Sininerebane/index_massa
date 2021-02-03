public class IndexMassaService {
    public double calculate (double body_mass , double growth ){
        double indexmassa = (body_mass /(growth*growth));
        return indexmassa;
    }
}