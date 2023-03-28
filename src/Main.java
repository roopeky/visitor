import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pelihahmo> pelihahmot = new ArrayList<>();

        HahmoA hahmoA = new HahmoA();
        pelihahmot.add(hahmoA);

        HahmoB hahmoB = new HahmoB();
        pelihahmot.add(hahmoB);

        hahmoA.setTila(new EkaTila());
        hahmoB.setTila(new TokaTila());

        BonusVisitor bonusVisitor = new BonusPisteidenJako();

        for (Pelihahmo hahmo : pelihahmot) {
            hahmo.accept(bonusVisitor);
        }

    }
}