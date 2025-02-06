package learn.structural.bridge.webpage;

import learn.structural.bridge.theme.Theme;

/**
 * @author anthonylee
 */
public class Careers implements WebPage {
    private final Theme theme;

    public Careers(Theme theme) {
        this.theme = theme;
    }

    @Override
    public String getContent() {
        return "Careers page in " + theme.getColor();
    }
}
