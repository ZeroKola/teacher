package com.faculty.interadmin.service.impl;

import com.faculty.interadmin.dao.DocumentDao;
import com.faculty.interadmin.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentSerImpl implements DocumentService {
    @Autowired

    @Override
<<<<<<< HEAD
    public List<DocumentEntity> findAll() {
        return documentDao.findDAll();
    }

    @Override
    public List<DocumentEntity> findDAll() {
        return null;
<<<<<<< HEAD
=======
>>>>>>> dev-wujy
    }

    @Override
=======
    }

    @Override
    public DocumentEntity getDocumentEntityByD_no(String d_no) {
        return documentDao.getDocumentEntityByD_no(d_no);
>>>>>>> dev-fengw
    }

    @Override
    }

    @Override
    }

    @Override
    }

    @Override
    }
}
