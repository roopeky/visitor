public class BonusPisteidenJako implements BonusVisitor {
    public void visit(EkaTila ekaTila) {
        int bonusPisteet = ekaTila.getBonusPisteet();
        System.out.println("Hahmo A/B tila 1: " + bonusPisteet + " bonuspistettä");
    }

    public void visit(TokaTila tokaTila) {
        int bonusPisteet = tokaTila.getBonusPisteet();
        System.out.println("Hahmo A/B tila 2: " + bonusPisteet + " bonuspistettä");
    }
}
