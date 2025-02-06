package learn.structural.bridge.webpage;

import learn.structural.bridge.theme.Theme;

/**
 * @author anthonylee
 */
public class Careers extends WebPage {
    public Careers(Theme theme) {
        super(theme);
    }

    @Override
    public String getContent() {
        return "Careers page in " + theme.getColor();
    }
}
