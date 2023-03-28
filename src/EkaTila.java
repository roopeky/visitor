public class EkaTila implements PelihahmoTila {
    public void otaVastaanBonus(BonusVisitor visitor) {
        visitor.visit(this);
    }

    public int getBonusPisteet() {
        return 10;
    }
}
