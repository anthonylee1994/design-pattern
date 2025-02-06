package learn.structural.bridge.webpage;

import learn.structural.bridge.theme.Theme;

/**
 * @author anthonylee
 */
public class About extends WebPage {
    public About(Theme theme) {
        super(theme);
    }

    @Override
    public String getContent() {
        return "About page in " + theme.getColor();
    }
}
