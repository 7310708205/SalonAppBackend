package com.example.salonbackend.Security.Services;

import com.example.salonbackend.Models.Image;
import com.example.salonbackend.Repository.ImageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface ImageService {
    Image saveImage(Image image);

    void deleteImage(long id);
//    Image updateImage(Image image,long id);

    List<Image> getAllImages();
    Image getImageById(int id);
}


