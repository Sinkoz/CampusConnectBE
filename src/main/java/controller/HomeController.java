package controller;

import Repositories.PostRepository;
import model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @Autowired
    private PostRepository postRepository;

    @RequestMapping("/save")
    public String save(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        postRepository.save(new Post(1));
        return "index";
    }

    @RequestMapping(value = "/", method= RequestMethod.GET)
    public String home(Model model) {
        return "index";
    }

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}
