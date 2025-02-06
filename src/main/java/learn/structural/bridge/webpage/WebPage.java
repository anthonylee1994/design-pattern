package learn.structural.bridge.webpage;

import learn.structural.bridge.theme.Theme;

/**
 * @author anthonylee
 */
public abstract class WebPage {
    protected Theme theme;

    public WebPage(Theme theme) {
        this.theme = theme;
    }

    public abstract String getContent();
}
