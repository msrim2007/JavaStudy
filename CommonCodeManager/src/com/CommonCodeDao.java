package com;

import java.util.ArrayList;
import java.util.List;

public class CommonCodeDao {
    public List<CommonCodeModel> selectUserLevelList() {
        List<CommonCodeModel> list = new ArrayList<CommonCodeModel>();

        list.add(new CommonCodeModel("0", "무료회원"));
        list.add(new CommonCodeModel("1", "유료회원"));
        list.add(new CommonCodeModel("2", "VIP회원"));

        return list;
    }

    public List<CommonCodeModel> selectAdminLevelList() {
        List<CommonCodeModel> list = new ArrayList<CommonCodeModel>();

        list.add(new CommonCodeModel("a", "일반관리자"));
        list.add(new CommonCodeModel("b", "그룹관리자"));
        list.add(new CommonCodeModel("c", "최고관리자"));

        return list;
    }
}
