package org.example.controllers;

import com.auth.service.UserService;
import jakarta.xml.ws.Response;
import org.example.dtos.GroupDto;
import org.example.services.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/group")
public class GroupController {
    @Autowired
    private GroupService groupService;

    @Autowired
    private UserService service;
    @PostMapping("/createGroup")
    public ResponseEntity<?> createGroup(@RequestBody GroupDto group){
        return ResponseEntity.ok(groupService.createGroup(group));
    }
}
