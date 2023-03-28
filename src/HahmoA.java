public class HahmoA implements Pelihahmo {
    private PelihahmoTila tila;

    public HahmoA() {
        this.tila = new EkaTila();
    }

    public void setTila(PelihahmoTila tila) {
        this.tila = tila;
    }

    public void accept(BonusVisitor visitor) {
        tila.otaVastaanBonus(visitor);
    }
}
