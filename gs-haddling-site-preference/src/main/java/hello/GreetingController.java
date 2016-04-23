package hello;

import org.springframework.mobile.device.site.SitePreference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    @RequestMapping("/site-preference")
    public @ResponseBody
    String home(SitePreference sitePreference) {
        if (sitePreference != null) {
            return "Hello " + sitePreference.name() + " site preference!";
        } else {
            return "SitePreference is not configured.";
        }
    }

}
