package com.example.JobApp.repo;

import com.example.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class JobRepo {
    List<JobPost> jobs = new ArrayList<>();

    // constructor->injecting objects into ArrayList defined above.
    public JobRepo() {

        // Java Developer Job Post
        jobs.add(new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
                List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")));

        // Frontend Developer Job Post
        jobs.add(
                new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
                        3, List.of("HTML", "CSS", "JavaScript", "React")));
    }
    public List<JobPost> returnAllJobPosts() {
        return jobs;
    }

    public void addJobPost(JobPost job) {
        jobs.add(job);
        System.out.println(jobs);
    }
}
