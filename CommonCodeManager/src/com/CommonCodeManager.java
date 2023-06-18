package com;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonCodeManager {
    // static
    private static CommonCodeManager commonCodeManager = null;

    public static CommonCodeManager getInstance() {
        if (commonCodeManager == null) commonCodeManager = new CommonCodeManager();
        return commonCodeManager;
    }

     // instance
    CommonCodeDao commonCodeDao = new CommonCodeDao();
    Map<String, List<CommonCodeModel>> commonCodeListMap;
    Map<String, Map<String, String>> commonCodeMap;

    private CommonCodeManager() {
        this.refresh();
    }

    public List<CommonCodeModel> getCommonCodeList(String commonCodeKey) {
        return this.commonCodeListMap.get(commonCodeKey);
    }

    public String getCommonCodeText(String commonCodeKey, String code) {
        return this.commonCodeMap.get(commonCodeKey).get(code);
    }

    public void refresh() {
        this.commonCodeListMap = new HashMap<>();
        this.commonCodeMap = new HashMap<>();
        // enum이 늘어나면 계속 추가해주어야 한다. -> ITS BAD
        // 자동 enum 처리 및 자동 db 처리가 필요
        refreshCommonDao(); // 자동 common dao 처리
        refreshEtcDao(); // 자동 기타 dao 처리
    }

    public void refreshCommonDao() {
        this.putMap("UserLevel", commonCodeDao.selectUserLevelList());
        this.putMap("AdminLevel", commonCodeDao.selectAdminLevelList());
    }

    public void refreshEtcDao() {
        Map<String, List<CommonCodeModel>> listMap = new HashMap<>();
    
        for(Map.Entry<String, List<CommonCodeModel>> elem : listMap.entrySet()) {
            this.commonCodeListMap.put(elem.getKey(), elem.getValue());
        }
    }

    private Map<String, String> listToMap(List<CommonCodeModel> list) {
        Map<String, String> map = new HashMap<>();

        for (CommonCodeModel model : list) {
            map.put(model.getCode(), model.getText());
        }

        return map;
    }

    private void putMap(String key, List<CommonCodeModel> list) {
        this.commonCodeListMap.put(key, list);
        this.commonCodeMap.put(key, listToMap(list));
    }
}

/*
 * todo
 *  - enum을 찾아서 자동으로 추가해줘야한다. -> reflection (아직 안배움.)
 *  - dao에서 code 읽어서 자동으로 추가 처리 해야함.
 */