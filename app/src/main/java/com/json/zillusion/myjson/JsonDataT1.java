package com.json.zillusion.myjson;

import com.google.firebase.database.Exclude;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

public class JsonDataT1 {

    private String NameCH,NameEN,NameJP;
    public JsonDataT1(String nameCH,String nameEN,String nameJP) {
        this.NameCH=nameCH;
        this.NameEN=nameEN;
        this.NameJP=nameJP;
    }



    public JsonDataT1()
    {

    }

    //region Set Value region
    public void setNameCH(String nameCH)
    {
        this.NameCH=nameCH;
    }
    public void setNameEN(String nameEN)
    {
        this.NameEN=nameEN;
    }
    public  void setNameJP(String nameJP)
    {
        this.NameJP=nameJP;
    }
    //endregion

    //region get value
    public String getNameCH()
    {
        return this.NameCH;
    }
    public String getNameEN()
    {
        return this.NameEN;
    }
    public String getNameJP()
    {
        return this.NameJP;
    }
    //endregion
    @Exclude
    public Map<String,Object> toMap(){
        HashMap<String,Object> result=new HashMap<>();
        result.put("NameCH",NameCH);
        result.put("NameEN",NameEN);
        result.put("NameJP",NameJP);
        return result;
    }
}
