package com.eugene.javacore.practic.repository.repositoryIO;

import java.util.ArrayList;
import java.util.List;

public  class IOUtils {
    private static int maxValue = 1;
    private static List<String> listId = new ArrayList<>();

    public static IOUtils listIdAndMaxVal(List<String> listReg) {

        for (String str : listReg) {
            String strArray[] = str.split(",");
            listId.add(strArray[0]);
            if (maxValue < Integer.parseInt(strArray[0])) {
                maxValue = Integer.parseInt(strArray[0]);
            }
        }
        return new IOUtils(maxValue,listId);
    }

    public IOUtils(int maxValue, List<String> listId) {
        this.maxValue = maxValue;
        this.listId = listId;
    }

    public static int getMaxValue() {
        return maxValue;
    }

    public static List<String> getListId() {
        return listId;
    }
}
