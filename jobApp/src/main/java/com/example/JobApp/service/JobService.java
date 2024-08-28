package com.example.JobApp.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.JobApp.model.JobPost;
import com.example.JobApp.repo.JobRepo;

    @Service
    public class JobService {
        @Autowired
        public JobRepo repo;



        //method to return all JobPosts
        public List<JobPost> returnAllJobPosts() {
            return repo.returnAllJobPosts();


        }

        public void addJobPost(JobPost jobPost) {
            repo.addJobPost(jobPost);

        }



}
