package com.faculty.interadmin.service.impl;

import com.faculty.interadmin.entity.DocumentEntity;
import com.faculty.interadmin.dao.DocumentDao;
import com.faculty.interadmin.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentSerImpl implements DocumentService {
    @Autowired
    private  DocumentDao documentDao;

    @Override
    public List<DocumentEntity> findAll() {
        return documentDao.findAll();
    }

    @Override
    public DocumentEntity getDocumentEntityByD_no(String d_no) {
        return documentDao.getDocumentEntityByD_no(d_no);
    }

    @Override
    public DocumentEntity getDocumentEntityByD_title(String d_title) {
        return documentDao.getDocumentEntityBydepart_title(d_title);
    }

    @Override
    public void insertDocumentEntity(DocumentEntity documentEntity) {
        documentDao.insertDocumentEntity(documentEntity);
    }

    @Override
    public void updateDocumentEntity(DocumentEntity documentEntity) {
        documentDao.updateDocumentEntity(documentEntity);
    }

    @Override
    public void deleteDocumentEntityByD_no(String d_no) {
        documentDao.deleteDocumentEntity(d_no);
    }
}
