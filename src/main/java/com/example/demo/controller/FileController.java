package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Data;
import com.example.demo.entity.repo.FileRepo;
@RestController
public class FileController {
	
	@Autowired
	FileRepo fileRepo;
	
	@PostMapping
    public Data saveData(@RequestBody Data data) {
        return fileRepo.save(data);
    }


}
