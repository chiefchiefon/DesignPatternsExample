package OODPE_PKG;

public class ChipsDecorator extends  HamburgerDecorator{

    public ChipsDecorator(Hamburger itsHamburger) {
        super(itsHamburger);
    }

    @Override
    public String serve() {
        return super.serve() + " with chips";
    }
}
