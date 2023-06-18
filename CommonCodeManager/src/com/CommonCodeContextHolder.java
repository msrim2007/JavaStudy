package com;

import java.util.List;

public class CommonCodeContextHolder {
    private static CommonCodeManager commonCodeManager = CommonCodeManager.getInstance();
    
    public static CommonCodeManager getCommonCodeManager() {
        return commonCodeManager;
    }   

    public static List<CommonCodeModel> getCodeList(String commonCodeKey) {
        return commonCodeManager.getCommonCodeList(commonCodeKey);
    }

    public static String getCommonCodeText(String commonCodeKey, String code) {
        return commonCodeManager.getCommonCodeText(commonCodeKey, code);
    }
}