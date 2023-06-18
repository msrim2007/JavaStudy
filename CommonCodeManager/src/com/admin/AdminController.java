package com.admin;

import java.util.List;

import com.CommonCodeManager;
import com.CommonCodeModel;

public class AdminController {
    // Autowire or Generator Injection in Spring
    CommonCodeManager commonCodeManager;

    public AdminController(CommonCodeManager commonCodeManager) {
        this.commonCodeManager = commonCodeManager;
    }

    public List<CommonCodeModel> selectAdminLevelList() {
        return commonCodeManager.getCommonCodeList("AdminLevel");
    }
}
