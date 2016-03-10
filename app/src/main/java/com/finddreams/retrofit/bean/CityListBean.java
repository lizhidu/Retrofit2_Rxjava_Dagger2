package com.finddreams.retrofit.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author finddreams
 * @address http://blog.csdn.net/finddreams
 */
public class CityListBean {


    private int errNum;
    private String errMsg;


    private ArrayList<RetDataEntity> retData;

    public void setErrNum(int errNum) {
        this.errNum = errNum;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public void setRetData(ArrayList<RetDataEntity> retData) {
        this.retData = retData;
    }

    public int getErrNum() {
        return errNum;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public ArrayList<RetDataEntity> getRetData() {
        return retData;
    }

    public static class RetDataEntity {
        private String province_cn;
        private String district_cn;
        private String name_cn;
        private String name_en;
        private String area_id;

        public void setProvince_cn(String province_cn) {
            this.province_cn = province_cn;
        }

        public void setDistrict_cn(String district_cn) {
            this.district_cn = district_cn;
        }

        public void setName_cn(String name_cn) {
            this.name_cn = name_cn;
        }

        public void setName_en(String name_en) {
            this.name_en = name_en;
        }

        public void setArea_id(String area_id) {
            this.area_id = area_id;
        }

        public String getProvince_cn() {
            return province_cn;
        }

        public String getDistrict_cn() {
            return district_cn;
        }

        public String getName_cn() {
            return name_cn;
        }

        public String getName_en() {
            return name_en;
        }

        public String getArea_id() {
            return area_id;
        }
    }
}