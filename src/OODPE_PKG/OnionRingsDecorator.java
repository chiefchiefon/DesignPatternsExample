package OODPE_PKG;

public class OnionRingsDecorator extends HamburgerDecorator{
    public OnionRingsDecorator(Hamburger itsHamburger) {
        super(itsHamburger);
    }

    @Override
    public String serve() {
        return super.serve() + " with onion rings";
    }
}
