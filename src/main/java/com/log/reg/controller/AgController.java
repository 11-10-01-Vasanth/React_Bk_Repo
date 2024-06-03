package com.log.reg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.log.reg.model.AvailableGames;
import com.log.reg.model.ImageStore;
import com.log.reg.repo.AvgameRepo;
import com.log.reg.service.AvgameService;

@RestController
@RequestMapping("/avgames")
public class AgController {

	@Autowired
	private AvgameRepo avRepo;

	@Autowired
	private AvgameService avService;

	@PostMapping("/setgamedata")
	public ResponseEntity<?> setgamedata(@RequestBody AvailableGames avgames) {
		AvailableGames av = avService.setgamedata(avgames);
		return ResponseEntity.status(HttpStatus.OK).body(av);
	}

	@GetMapping("/getAllGameData")
	public ResponseEntity<?> getAllGameData() {
		List<AvailableGames> savedEntity = avService.getAllGameData();
		return ResponseEntity.status(HttpStatus.OK).body(savedEntity);
	}

//	jwtUtils.verify(authorization);
//    List<AvailableGames> savedEntity = avService.getAllGameData();
//    return ResponseEntity.status(HttpStatus.OK).body(savedEntity);

	@GetMapping("/getAllImagestoredata")
	public ResponseEntity<?> getAllImagestoreData() {
		List<ImageStore> savedEntity = avService.getAllImageStoreData();
		return ResponseEntity.status(HttpStatus.OK).body(savedEntity);
	}

//	@GetMapping("/update/{agid}/{gametitle}/{discount}/{price}/{discountprice}/{imgUrl}")
//	public ResponseEntity<?> updateProduct(@PathVariable int agid, @PathVariable String gametitle, @PathVariable String discount, @PathVariable String price, @PathVariable String discountprice, @PathVariable String imgUrl)
//	{
//		AvailableGames savedEntity = avService.updateProduct(agid, gametitle, discount, price, discountprice, imgUrl);
//		return ResponseEntity.status(HttpStatus.OK).body(savedEntity);
//	}

	@GetMapping("/list/{page}/{size}")
	public ResponseEntity<?> getPostsPage(@PathVariable int page, @PathVariable int size) {
		PageRequest.of(2, 3);

//		List<Post> posts = postRepo.findAll(PageRequest.of(page, size)).toList();
		List<AvailableGames> posts = avRepo.findAll(PageRequest.of(page, size, Sort.by("agid").ascending())).toList();
		return ResponseEntity.status(HttpStatus.OK).body(posts);

	}

	@GetMapping("/delete/{deleteid}")
	public ResponseEntity<?> deleteData(@PathVariable int deleteid) {
		AvailableGames deleteEntity = avService.deleteData(deleteid);
		return ResponseEntity.status(HttpStatus.OK).body(deleteEntity);
	}

}
