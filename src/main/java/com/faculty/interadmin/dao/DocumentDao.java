package com.faculty.interadmin.dao;

import com.faculty.interadmin.Another.Rt_document;
import com.faculty.interadmin.entity.DocumentEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DocumentDao {
    void insertDocument(DocumentEntity documentEntity);
    List<Rt_document> selectDocumentAll();
    List<Rt_document> selectDocumentBytitle(String title);
    List<Rt_document> selectDocumentByuploader(String uploader);
    void updatedocument(DocumentEntity documentEntity);
    void deletedocumentById(String id);
}
