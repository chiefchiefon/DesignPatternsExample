package OODPE_PKG;

public class ToppingFactory {
    public static Hamburger topHamburger(String code, Hamburger hamburger) {
        switch (code) {
            case "ch":
                hamburger = new ChipsDecorator(hamburger);
                break;
            case "or":
                hamburger = new OnionRingsDecorator(hamburger);
                break;
            case "sa":
                hamburger = new SaladDecorator(hamburger);
                break;
            case "fe":
                hamburger = new FriedEggDecorator(hamburger);
                break;

            default:
                throw new RuntimeException("wrong Topping");
        }
        return hamburger;
    }
}
