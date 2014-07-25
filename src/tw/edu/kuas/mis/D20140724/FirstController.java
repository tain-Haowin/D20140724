package tw.edu.kuas.mis.D20140724;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class FirstController {
	

    @RequestMapping("/User/{Name}/{Year}/{Month}/{Day}")
    public String helloWorld(Model model,@PathVariable("Name") String Name,@PathVariable("Year") String Year,
    		@PathVariable("Month") String Month,@PathVariable("Day") String Day
    		) {
        model.addAttribute("UserName", Name);
        model.addAttribute("Year",Year);
        model.addAttribute("Month",Month);
        model.addAttribute("Day",Day);
        System.out.println("GG");
        return "helloWorld";
    }

}
