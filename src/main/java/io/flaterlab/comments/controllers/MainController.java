package io.flaterlab.comments.controllers;

import io.flaterlab.comments.data.repo.CommentRepository;
import io.flaterlab.comments.data.repo.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.flaterlab.comments.data.models.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {
    @Autowired
    CommentRepository commentRepository;
    @Autowired
    PageRepository pageRepository;

    @GetMapping("/")
    public Api index(){
        return new Api("1.0");
    }

    @CrossOrigin
    @RequestMapping(value = "/api/{link}", method = RequestMethod.GET)
    public List<Comment> getComment(@PathVariable String link){
        Page page = pageRepository.findByLink(link);
        if (page == null){
            return new ArrayList<Comment>();
        }
        return commentRepository.findByPageId(page.getId());
    }

    @CrossOrigin
    @RequestMapping(value = "/api/{link}", method = RequestMethod.POST)
    public Comment postComment(@PathVariable String link, @RequestBody FrontComment frontComment){
        Page page = pageRepository.findByLink(link);
        if (page == null){
            page = new Page();
            page.setLink(link);
            pageRepository.save(page);
        }

        Comment comment = new Comment();

        comment.setComment(frontComment.getComment());
        comment.setUsername(frontComment.getName());
        comment.setPageId(page.getId());

        commentRepository.save(comment);

        return comment;
    }

}
