package gastroCompany;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class RegisterController {

    @GetMapping("/rejestracja")
    public String get(Model model){
        User user = new User("Jan","Nowak","janNowak@gmail.pl");
        User user2 = new User("Darek","Zięba","");
        User user3 = new User("Marek","Marecki","DotarSojat@gmail.pl");
        List<User> users = Arrays.asList(user,user2,user3);
        model.addAttribute("user",user);
        model.addAttribute("pracownik","Dorota");

        return "register";
    }
}
