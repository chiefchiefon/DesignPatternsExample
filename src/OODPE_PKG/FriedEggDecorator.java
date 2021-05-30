package OODPE_PKG;

public class FriedEggDecorator extends HamburgerDecorator {
    public FriedEggDecorator(Hamburger itsHamburger) {
        super(itsHamburger);
    }

    @Override
    public String serve() {
        return super.serve() + " with fried egg";
    }
}
