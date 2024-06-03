package com.log.reg.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.log.reg.model.AvailableGames;
import com.log.reg.model.ImageStore;
import com.log.reg.repo.AvgameRepo;
import com.log.reg.repo.ImageRepo;
import com.log.reg.service.AvgameService;

@Service
public class AvgameServiceImpl implements AvgameService{

	@Autowired
	private AvgameRepo avRepo; 
	
	@Autowired
	private ImageRepo imageRepo;
	
	@Override
	public AvailableGames setgamedata(AvailableGames avgames) {
		AvailableGames savedEntity = avRepo.save(avgames);
		return savedEntity;
	}

	@Override
	public List<AvailableGames> getAllGameData(){
		List<AvailableGames> savedEntity = avRepo.findAll();
		return savedEntity;
	}

	@Override
	public AvailableGames updateProduct(int agid, String gametitle, String discount, String price, String discountprice, String imgUrl) {
		AvailableGames avgame = avRepo.findById(agid).get();
		avgame.setDiscount(discountprice);
		avgame.setDiscountprice(discountprice);
		avgame.setGametitle(gametitle);
		avgame.setImgUrl(imgUrl);
		avgame.setPrice(price);
		AvailableGames updateEntity = avRepo.saveAndFlush(avgame);
		return updateEntity;
	}

	@Override
	public AvailableGames deleteData(int deleteid) {
		AvailableGames avgame = avRepo.findById(deleteid).get();
		avRepo.delete(avgame);
		return avgame;
	}

	@Override
	public List<ImageStore> getAllImageStoreData() {
		List<ImageStore> savedEntity = imageRepo.findAll();
		return savedEntity;
	}
	
}
