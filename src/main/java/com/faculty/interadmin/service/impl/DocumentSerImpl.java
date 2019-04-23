package com.faculty.interadmin.service.impl;

import com.faculty.interadmin.Another.Rt_document;
import com.faculty.interadmin.Another.Rt_sign;
import com.faculty.interadmin.dao.DocumentDao;
import com.faculty.interadmin.entity.DocumentEntity;
import com.faculty.interadmin.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DocumentSerImpl implements DocumentService {
    @Autowired
    private DocumentDao documentDao;

    @Override
    public void addDocument(DocumentEntity documentEntity) {
        this.documentDao.insertDocument(documentEntity);
    }

    @Override
    public List<Rt_document> findDocumentAll() {
        System.out.println(this.documentDao.selectDocumentAll());
        return  this.documentDao.selectDocumentAll();
    }

    @Override
    public List<Rt_document> findDocumentByUploader(String uploader) {
        return this.documentDao.selectDocumentByuploader(uploader);
    }

    @Override
    public List<Rt_document> findDocumentByTitle(String title) {
        return this.documentDao.selectDocumentBytitle(title);
    }

    @Override
    public void updateDocument(DocumentEntity documentEntity) {
        this.documentDao.updatedocument(documentEntity);
    }

    @Override
    public void deleteDocumentinById(String document_id) {
        this.documentDao.deletedocumentById(document_id);
    }
}
