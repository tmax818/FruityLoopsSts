package tylermaxwell;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//... imports (Use shift+ctrl+O or shift+cmd+O to import as you code)
@Controller
public class ItemController {
 
 @RequestMapping("/")
 public String index(Model model) {
     
     ArrayList<Item> fruits = new ArrayList<Item>();
     fruits.add(new Item("Kiwi", 1.50));
     fruits.add(new Item("Mango", 2.00));
     fruits.add(new Item("Goji Berries", 4.00));
     fruits.add(new Item("Guava", 0.75));
     
     // Add fruits your view model here
     model.addAttribute("fruits", fruits);
     
     return "index.jsp";
 }
}

