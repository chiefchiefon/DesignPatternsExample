package OODPE_PKG;

public class HamburgerDecorator implements Hamburger{
    Hamburger itsHamburger = null;

    public HamburgerDecorator(Hamburger itsHamburger) {
        this.itsHamburger = itsHamburger;
    }

    @Override
    public String serve() {
        return itsHamburger.serve();
    }
}
