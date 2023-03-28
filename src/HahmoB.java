public class HahmoB implements Pelihahmo {
    private PelihahmoTila tila;

    public HahmoB() {
        this.tila = new EkaTila();
    }

    public void setTila(PelihahmoTila tila) {
        this.tila = tila;
    }

    public void accept(BonusVisitor visitor) {
        tila.otaVastaanBonus(visitor);
    }
}
