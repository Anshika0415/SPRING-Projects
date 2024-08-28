package com.example.JobApp.controller;

import com.example.JobApp.model.JobPost;
import com.example.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {
@Autowired
    JobService serv;
    @GetMapping({"/","home"})
    public String home()
    { //this is name of your jsp page
        return "home";
    }
    @GetMapping("addjob")
    public String addJob()
    { //this is name of your jsp page
        return "addjob";
    }
    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost,Model model)
    {   model.addAttribute("jobPost", jobPost);
        serv.addJobPost(jobPost);
        return "success";
    }
    @GetMapping("/viewalljobs")
    public String viewJobs(Model model) {

        List<JobPost> jobPosts = serv.returnAllJobPosts();
        model.addAttribute("jobPosts", jobPosts);
        return "viewalljobs";
    }

}
