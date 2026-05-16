package com.mullen.nebulaforge.services;

import com.mullen.nebulaforge.repository.ContentRepository;
import org.springframework.stereotype.Service;

@Service
public class ContentService {

    private final ContentRepository contentRepository;

    public ContentService(ContentRepository contentRepository) {
        this.contentRepository = contentRepository;
    }

    public void save() {
        
    }
}
