package com;

import java.util.List;

public class CommonCodeService {
    CommonCodeDao commonCodeDao = new CommonCodeDao();

    public List<CommonCodeModel> selectUserLevelList() {
        return commonCodeDao.selectUserLevelList();
    }
}
