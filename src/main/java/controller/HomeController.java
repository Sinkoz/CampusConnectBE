package controller;

import Repositories.PostRepository;
import model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/economics", method = RequestMethod.GET)
    public String economics(Model model) {
        return "forumEconomics";
    }

    @RequestMapping(value = "/topicsMain", method = RequestMethod.GET)
    public String topicsMain(Model model) {
        return "topicsMain";
    }

    @RequestMapping(value = "/thread", method = RequestMethod.GET)
    public String thread(Model model) {
        return "forumThread";
    }

    @GetMapping(value = "/savePost")
    public String createPost(Model model) {
        model.addAttribute("post", new Post(1));
        return "createPost";
    }

    @PostMapping("/savePost")
    public String submitPost(@ModelAttribute Post post) {
        postRepository.save(post);
        return "postSuccess";
    }
}
