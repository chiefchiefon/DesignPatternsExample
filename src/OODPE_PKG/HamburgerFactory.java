package OODPE_PKG;

public class HamburgerFactory {
    public static Hamburger createHamburger(String code){
        //DONE: fix
        Hamburger hamburger = null;
        switch (code) {
            case "cl":
                hamburger = new ClassicHamburger();
                break;
            case "sp":
                hamburger = new SpicyHamburger();
                break;
            case "la":
                hamburger = new LambHamburger();
                break;
            case "hla":
                hamburger = new HomemadeHamburger();
                break;

            default:
                throw new RuntimeException("wrong Hamburger");
        }
        return hamburger;
    }
}

