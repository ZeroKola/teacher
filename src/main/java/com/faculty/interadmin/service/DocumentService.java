package com.faculty.interadmin.service;

import com.faculty.interadmin.entity.DocumentEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Mapper
public interface DocumentService {
    //获取所有文件
    List<DocumentEntity> findDAll();
    //根据d_no查询一条记录
    DocumentEntity getDocumentEntityByD_no(String d_no);
    //根据d_no查询一条记录
    DocumentEntity getDocumentEntityByD_title(String d_title);
    //增加一条记录
    void insertDocumentEntity(DocumentEntity documentEntity);
    //更新一条记录
    void updateDocumentEntity(DocumentEntity documentEntity);
    //删除一条记录
    void deleteDocumentEntityByD_no(String d_no);
}
