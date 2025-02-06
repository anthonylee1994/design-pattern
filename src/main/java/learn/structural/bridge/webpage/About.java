package learn.structural.bridge.webpage;

import learn.structural.bridge.theme.Theme;

/**
 * @author anthonylee
 */
public class About implements WebPage {
    private final Theme theme;

    public About(Theme theme) {
        this.theme = theme;
    }

    @Override
    public String getContent() {
        return "About page in " + theme.getColor();
    }
}
