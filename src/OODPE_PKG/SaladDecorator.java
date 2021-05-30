package OODPE_PKG;

public class SaladDecorator extends HamburgerDecorator{
    public SaladDecorator(Hamburger itsHamburger) {
        super(itsHamburger);
    }

    @Override
    public String serve() {
        return super.serve() + " with salad";
    }
}
