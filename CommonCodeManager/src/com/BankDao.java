package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankDao implements CommonCodeDaoInterface{
    public List<BankModel> selectList() {
        List<BankModel> list = new ArrayList<BankModel>();

        list.add(new BankModel("0", "국민은행", "kb"));
        list.add(new BankModel("1", "신한은행", "shin"));
        list.add(new BankModel("2", "카카오뱅크", "kakaobank"));

        return list;
    }

    @Override
    public Map<String, List<CommonCodeModel>> getCodeList() {
        Map<String, List<CommonCodeModel>> listMap = new HashMap<>();
        List<BankModel> bankList = this.selectList();

        listMap.put("BankNameList", new ArrayList<>());
        listMap.put("BankEnNameList", new ArrayList<>());
        
        for (BankModel bankModel : bankList) {
            listMap.get("BankNameList").add(new CommonCodeModel(bankModel.getCode(), bankModel.getKoName()));
        }
        
        for (BankModel bankModel : bankList) {
            listMap.get("BankEnNameList").add(new CommonCodeModel(bankModel.getCode(), bankModel.getEnName()));
        }

        return listMap;
    }

}
