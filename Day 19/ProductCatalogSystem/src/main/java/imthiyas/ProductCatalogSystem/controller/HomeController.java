package imthiyas.ProductCatalogSystem.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String homePage() {
        return "home"; // This will return home.html located in src/main/resources/templates
    }
}
