package learn.structural.bridge;

import learn.structural.bridge.theme.DarkTheme;
import learn.structural.bridge.theme.LightTheme;
import learn.structural.bridge.theme.Theme;
import learn.structural.bridge.webpage.About;
import learn.structural.bridge.webpage.Careers;
import learn.structural.bridge.webpage.WebPage;

/**
 * @author anthonylee
 */
public class BridgeDemo {
    public static void main(String[] args) {
        Theme darkTheme = new DarkTheme();
        Theme lightTheme = new LightTheme();

        WebPage about = new About(darkTheme);
        WebPage careers = new Careers(lightTheme);

        System.out.println(about.getContent());  // About page in Dark Black
        System.out.println(careers.getContent()); // Careers page in Off White
    }
}
