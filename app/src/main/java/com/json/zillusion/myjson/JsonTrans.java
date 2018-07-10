package com.json.zillusion.myjson;

public class JsonTrans {
    String NO;
    String  NameEN;
    String  NameJP;
    String  NameCH;

    public JsonTrans(String NO, String EN, String JP, String CH) {
        this.NO = NO;
        this.NameEN = EN;
        this.NameJP = JP;
        this.NameCH = CH;
    }
    public JsonTrans()
    {

    }


//region Get Region
    public String getNO()
    {
        return NO;
    }
    public  String getNameEN()
    {
        return NameEN;
    }
    public String getNameJP()
    {
        return NameJP;
    }
    public String getNameCH()
    {
        return NameCH;
    }
//endregion
    //Set Region
    public void SetNo(String NO)
    {
        this.NO=NO;
    }

    public void SetEN(String EN)
    {
        this.NameEN=EN;
    }

    public void SetJP(String JP)
    {
        this.NameJP=JP;
    }
    public void SetCH(String CH)
    {
        this.NameCH=CH;
    }
    //endregion
}
