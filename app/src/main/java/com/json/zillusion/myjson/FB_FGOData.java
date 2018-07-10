package com.json.zillusion.myjson;

import com.google.firebase.database.Exclude;

import java.util.HashMap;
import java.util.Map;

public class FB_FGOData {
    //region Define Valuable
    private String NameCH,NameEN,NameJP,NameChina;
    private int Rarity,Class,StatusATKLV1,Status_HPLV1,StatusATKFinal,Status_HPFinal,StatusATKLV100,Status_HPLV100,COST,MAX_LV;
    private String Class_Describe1,Class_Describe2,Class_Describe3,Class_Describe4;
    private int Command_Buster,Command_Arts,Command_Quick;
    private String Skill_Describe1,Skill_Describe2,Skill_Describe3,Skill_Describe4,Skill_Describe5,Skill_Describe6;
    private String Skill_1_Effect1,Skill_1_Effect2,Skill_1_Effect3,Skill_1_Effect4,Skill_1_Effect5,Skill_1_Effect6,Skill_1_Effect7,Skill_1_Effect8,Skill_1_Effect9,Skill_1_Effect10;
    private String Skill_2_Effect1,Skill_2_Effect2,Skill_2_Effect3,Skill_2_Effect4,Skill_2_Effect5,Skill_2_Effect6,Skill_2_Effect7,Skill_2_Effect8,Skill_2_Effect9,Skill_2_Effect10;
    private String Skill_3_Effect1,Skill_3_Effect2,Skill_3_Effect3,Skill_3_Effect4,Skill_3_Effect5,Skill_3_Effect6,Skill_3_Effect7,Skill_3_Effect8,Skill_3_Effect9,Skill_3_Effect10;
    private int NP_CardColor;private String NP_Name1, NP_Describe,NP_Describe_Rank1, NP_Describe_Target,NP_1_Effect1,NP_1_Effect2,NP_1_Effect3,NP_1_Effect4,NP_1_Effect5,
    NP_Name2,NP_Rank2,NP_2_Effect1,NP_2_Effect2,NP_2_Effect3,NP_2_Effect4,NP_2_Effect5;
    //region Level Required Material
    private String LevelMaterial_11,LevelMaterial_12,LevelMaterial_13,LevelMaterial_14;
    private int RequireQuantity11,RequireQuantity12,RequireQuantity13,RequireQuantity14;
    private String LevelMaterial_21,LevelMaterial_22,LevelMaterial_23,LevelMaterial_24;
    private int RequireQuantity21,RequireQuantity22,RequireQuantity23,RequireQuantity24;
    private String LevelMaterial_31,LevelMaterial_32,LevelMaterial_33,LevelMaterial_34;
    private int RequireQuantity31,RequireQuantity32,RequireQuantity33,RequireQuantity34;
    private String LevelMaterial_41,LevelMaterial_42,LevelMaterial_43,LevelMaterial_44;
    private int RequireQuantity41,RequireQuantity42,RequireQuantity43,RequireQuantity44;
    private String LevelMaterialQP_1,LevelMaterialQP_2,LevelMaterialQP_3,LevelMaterialQP_4;
    //endregion

    //endregion

    public FB_FGOData() {
    }
    public FB_FGOData(String namech,String nameen,String namejp,String namechina){
        this.NameCH=namech;
        this.NameEN=nameen;
        this.NameJP=namejp;
        this.NameChina=namechina;

    }//Servant_Name

    public FB_FGOData(String namech,String nameen,String namejp,String namechina,int rarity,int Class,int StatusATKLV1,int Status_HPLV1,
                      int StatusATKFinal,int Status_HPFinal,int StatusATKLV100,int Status_HPLV100,int Cost,int max_LV){
        // Define Line 2.
        this.NameCH=namech;
        this.NameEN=nameen;
        this.NameJP=namejp;
        this.NameChina=namechina;
        //int
        this.Rarity=rarity;
        this.Class=Class;
        this.StatusATKLV1=StatusATKLV1;
        this.Status_HPLV1=Status_HPLV1;

        this.StatusATKFinal=StatusATKFinal;
        this.Status_HPFinal=Status_HPFinal;

        this.StatusATKLV100=StatusATKLV100;
        this.Status_HPLV100=Status_HPLV100;
        this.COST=Cost;
        this.MAX_LV=max_LV;
    }//Servant_Name + Servant_Rarity & Information Status

    public FB_FGOData(String namech,String nameen,String namejp,String namechina,int rarity,int Class,int StatusATKLV1,int Status_HPLV1,
                      int StatusATKFinal,int Status_HPFinal,int StatusATKLV100,int Status_HPLV100,int Cost,int max_LV,
                      String class_describe1,String class_describe2,String class_describe3,String class_describe4
    ){
        // Define Line 2.
        this.NameCH=namech;
        this.NameEN=nameen;
        this.NameJP=namejp;
        this.NameChina=namechina;
        //int
        this.Rarity=rarity;
        this.Class=Class;
        this.StatusATKLV1=StatusATKLV1;
        this.Status_HPLV1=Status_HPLV1;
        this.StatusATKFinal=StatusATKFinal;
        this.Status_HPFinal=Status_HPFinal;
        this.StatusATKLV100=StatusATKLV100;
        this.Status_HPLV100=Status_HPLV100;
        this.COST=Cost;
        this.MAX_LV=max_LV;
        //Class Describe
        this.Class_Describe1=class_describe1;
        this.Class_Describe2=class_describe2;
        this.Class_Describe3=class_describe3;
        this.Class_Describe4=class_describe4;

    }//Servant_Name + Servant_Rarity & Information Status + Class Describe(1-4)

    public FB_FGOData(String namech,String nameen,String namejp,String namechina,int rarity,int Class,int StatusATKLV1,int Status_HPLV1,
                      int StatusATKFinal,int Status_HPFinal,int StatusATKLV100,int Status_HPLV100,int Cost,int max_LV,
                      String class_describe1,String class_describe2,String class_describe3,String class_describe4,
                      int Command_Buster,int Command_Arts,int Command_Quick
    ){
        // Define Line 2.
        this.NameCH=namech;
        this.NameEN=nameen;
        this.NameJP=namejp;
        this.NameChina=namechina;
        //int
        this.Rarity=rarity;
        this.Class=Class;
        this.StatusATKLV1=StatusATKLV1;
        this.Status_HPLV1=Status_HPLV1;
        this.StatusATKFinal=StatusATKFinal;
        this.Status_HPFinal=Status_HPFinal;
        this.StatusATKLV100=StatusATKLV100;
        this.Status_HPLV100=Status_HPLV100;
        this.COST=Cost;
        this.MAX_LV=max_LV;
        //Class Describe
        this.Class_Describe1=class_describe1;
        this.Class_Describe2=class_describe2;
        this.Class_Describe3=class_describe3;
        this.Class_Describe4=class_describe4;
        //CommandCard
        this.Command_Buster=Command_Buster;
        this.Command_Arts=Command_Arts;
        this.Command_Quick=Command_Quick;


    }//Servant_Name + Servant_Rarity & Information Status + Class Describe(1-4) + CommandCard

    public FB_FGOData(String namech,String nameen,String namejp,String namechina,int rarity,int Class,int StatusATKLV1,int Status_HPLV1,
                      int StatusATKFinal,int Status_HPFinal,int StatusATKLV100,int Status_HPLV100,int Cost,int max_LV,
                      String class_describe1,String class_describe2,String class_describe3,String class_describe4,
                      int Command_Buster,int Command_Arts,int Command_Quick,
                      String Skill_Describe1,String Skill_Describe2,String Skill_Describe3,String Skill_Describe4,String Skill_Describe5,String Skill_Describe6
    ){
        // Define Line 2.
        this.NameCH=namech;
        this.NameEN=nameen;
        this.NameJP=namejp;
        this.NameChina=namechina;
        //int
        this.Rarity=rarity;
        this.Class=Class;
        this.StatusATKLV1=StatusATKLV1;
        this.Status_HPLV1=Status_HPLV1;
        this.StatusATKFinal=StatusATKFinal;
        this.Status_HPFinal=Status_HPFinal;
        this.StatusATKLV100=StatusATKLV100;
        this.Status_HPLV100=Status_HPLV100;
        this.COST=Cost;
        this.MAX_LV=max_LV;
        //Class Describe
        this.Class_Describe1=class_describe1;
        this.Class_Describe2=class_describe2;
        this.Class_Describe3=class_describe3;
        this.Class_Describe4=class_describe4;
        //CommandCard
        this.Command_Buster=Command_Buster;
        this.Command_Arts=Command_Arts;
        this.Command_Quick=Command_Quick;
        //Skill Describe
        this.Skill_Describe1=Skill_Describe1;
        this.Skill_Describe2=Skill_Describe2;
        this.Skill_Describe3=Skill_Describe3;
        this.Skill_Describe4=Skill_Describe4;
        this.Skill_Describe5=Skill_Describe5;
        this.Skill_Describe6=Skill_Describe6;

    }//Servant_Name + Servant_Rarity & Information Status + Class Describe(1-4) + CommandCard + SkillDescribe

    public FB_FGOData(String namech,String nameen,String namejp,String namechina,int rarity,int Class,int StatusATKLV1,int Status_HPLV1,
                      int StatusATKFinal,int Status_HPFinal,int StatusATKLV100,int Status_HPLV100,int Cost,int max_LV,
                      String class_describe1,String class_describe2,String class_describe3,String class_describe4,
                      int Command_Buster,int Command_Arts,int Command_Quick,
                      String Skill_Describe1,String Skill_Describe2,String Skill_Describe3,String Skill_Describe4,String Skill_Describe5,String Skill_Describe6,
                      String Skill_1_Effect1,String Skill_1_Effect2,String Skill_1_Effect3,String Skill_1_Effect4,String Skill_1_Effect5,String Skill_1_Effect6,
                      String Skill_1_Effect7,String Skill_1_Effect8,String Skill_1_Effect9,String Skill_1_Effect10,
                      String Skill_2_Effect1,String Skill_2_Effect2,String Skill_2_Effect3,String Skill_2_Effect4,String Skill_2_Effect5,String Skill_2_Effect6,
                      String Skill_2_Effect7,String Skill_2_Effect8,String Skill_2_Effect9,String Skill_2_Effect10,
                      String Skill_3_Effect1,String Skill_3_Effect2,String Skill_3_Effect3,String Skill_3_Effect4,String Skill_3_Effect5,String Skill_3_Effect6,
                      String Skill_3_Effect7,String Skill_3_Effect8,String Skill_3_Effect9,String Skill_3_Effect10
    ){
        // Define Line 2.
        this.NameCH=namech;
        this.NameEN=nameen;
        this.NameJP=namejp;
        this.NameChina=namechina;
        //int
        this.Rarity=rarity;
        this.Class=Class;
        this.StatusATKLV1=StatusATKLV1;
        this.Status_HPLV1=Status_HPLV1;
        this.StatusATKFinal=StatusATKFinal;
        this.Status_HPFinal=Status_HPFinal;
        this.StatusATKLV100=StatusATKLV100;
        this.Status_HPLV100=Status_HPLV100;
        this.COST=Cost;
        this.MAX_LV=max_LV;
        //Class Describe
        this.Class_Describe1=class_describe1;
        this.Class_Describe2=class_describe2;
        this.Class_Describe3=class_describe3;
        this.Class_Describe4=class_describe4;
        //CommandCard
        this.Command_Buster=Command_Buster;
        this.Command_Arts=Command_Arts;
        this.Command_Quick=Command_Quick;
        //Skill Describe
        this.Skill_Describe1=Skill_Describe1;
        this.Skill_Describe2=Skill_Describe2;
        this.Skill_Describe3=Skill_Describe3;
        this.Skill_Describe4=Skill_Describe4;
        this.Skill_Describe5=Skill_Describe5;
        this.Skill_Describe6=Skill_Describe6;
        //Skill Effect
        this.Skill_1_Effect1=Skill_1_Effect1;
        this.Skill_1_Effect2=Skill_1_Effect2;
        this.Skill_1_Effect3=Skill_1_Effect3;
        this.Skill_1_Effect4=Skill_1_Effect4;
        this.Skill_1_Effect5=Skill_1_Effect5;
        this.Skill_1_Effect6=Skill_1_Effect6;
        this.Skill_1_Effect7=Skill_1_Effect7;
        this.Skill_1_Effect8=Skill_1_Effect8;
        this.Skill_1_Effect9=Skill_1_Effect9;
        this.Skill_1_Effect10=Skill_1_Effect10;
        this.Skill_2_Effect1=Skill_2_Effect1;
        this.Skill_2_Effect2=Skill_2_Effect2;
        this.Skill_2_Effect3=Skill_2_Effect3;
        this.Skill_2_Effect4=Skill_2_Effect4;
        this.Skill_2_Effect5=Skill_2_Effect5;
        this.Skill_2_Effect6=Skill_2_Effect6;
        this.Skill_2_Effect7=Skill_2_Effect7;
        this.Skill_2_Effect8=Skill_2_Effect8;
        this.Skill_2_Effect9=Skill_2_Effect9;
        this.Skill_2_Effect10=Skill_2_Effect10;
        this.Skill_3_Effect1=Skill_3_Effect1;
        this.Skill_3_Effect2=Skill_3_Effect2;
        this.Skill_3_Effect3=Skill_3_Effect3;
        this.Skill_3_Effect4=Skill_3_Effect4;
        this.Skill_3_Effect5=Skill_3_Effect5;
        this.Skill_3_Effect6=Skill_3_Effect6;
        this.Skill_3_Effect7=Skill_3_Effect7;
        this.Skill_3_Effect8=Skill_3_Effect8;
        this.Skill_3_Effect9=Skill_3_Effect9;
        this.Skill_3_Effect10=Skill_3_Effect10;

    }//Servant_Name + Servant_Rarity & Information Status + Class Describe(1-4) + CommandCard + SkillDescribe + Skill_Effect

    public FB_FGOData(String namech,String nameen,String namejp,String namechina,int rarity,int Class,int StatusATKLV1,int Status_HPLV1,
                      int StatusATKFinal,int Status_HPFinal,int StatusATKLV100,int Status_HPLV100,int Cost,int max_LV,
                      String class_describe1,String class_describe2,String class_describe3,String class_describe4,
                      int Command_Buster,int Command_Arts,int Command_Quick,
                      String Skill_Describe1,String Skill_Describe2,String Skill_Describe3,String Skill_Describe4,String Skill_Describe5,String Skill_Describe6,
                      String Skill_1_Effect1,String Skill_1_Effect2,String Skill_1_Effect3,String Skill_1_Effect4,String Skill_1_Effect5,String Skill_1_Effect6,
                      String Skill_1_Effect7,String Skill_1_Effect8,String Skill_1_Effect9,String Skill_1_Effect10,
                      String Skill_2_Effect1,String Skill_2_Effect2,String Skill_2_Effect3,String Skill_2_Effect4,String Skill_2_Effect5,String Skill_2_Effect6,
                      String Skill_2_Effect7,String Skill_2_Effect8,String Skill_2_Effect9,String Skill_2_Effect10,
                      String Skill_3_Effect1,String Skill_3_Effect2,String Skill_3_Effect3,String Skill_3_Effect4,String Skill_3_Effect5,String Skill_3_Effect6,
                      String Skill_3_Effect7,String Skill_3_Effect8,String Skill_3_Effect9,String Skill_3_Effect10,
                      int NP_CardColor,String NP_Name1,String NP_Describe,String NP_Describe_Rank1,String NP_Describe_Target,String NP_1_Effect1,
                      String NP_1_Effect2,String NP_1_Effect3,String NP_1_Effect4,String NP_1_Effect5,String NP_Name2,String NP_Rank2,
                      String NP_2_Effect1,String NP_2_Effect2,String NP_2_Effect3,String NP_2_Effect4,String NP_2_Effect5

    ){
        //region Compelete
        // Define Line 2.
        this.NameCH=namech;
        this.NameEN=nameen;
        this.NameJP=namejp;
        this.NameChina=namechina;
        //int
        this.Rarity=rarity;
        this.Class=Class;
        this.StatusATKLV1=StatusATKLV1;
        this.Status_HPLV1=Status_HPLV1;
        this.StatusATKFinal=StatusATKFinal;
        this.Status_HPFinal=Status_HPFinal;
        this.StatusATKLV100=StatusATKLV100;
        this.Status_HPLV100=Status_HPLV100;
        this.COST=Cost;
        this.MAX_LV=max_LV;
        //Class Describe
        this.Class_Describe1=class_describe1;
        this.Class_Describe2=class_describe2;
        this.Class_Describe3=class_describe3;
        this.Class_Describe4=class_describe4;
        //CommandCard
        this.Command_Buster=Command_Buster;
        this.Command_Arts=Command_Arts;
        this.Command_Quick=Command_Quick;
        //Skill Describe
        this.Skill_Describe1=Skill_Describe1;
        this.Skill_Describe2=Skill_Describe2;
        this.Skill_Describe3=Skill_Describe3;
        this.Skill_Describe4=Skill_Describe4;
        this.Skill_Describe5=Skill_Describe5;
        this.Skill_Describe6=Skill_Describe6;
        //Skill Effect
        this.Skill_1_Effect1=Skill_1_Effect1;
        this.Skill_1_Effect2=Skill_1_Effect2;
        this.Skill_1_Effect3=Skill_1_Effect3;
        this.Skill_1_Effect4=Skill_1_Effect4;
        this.Skill_1_Effect5=Skill_1_Effect5;
        this.Skill_1_Effect6=Skill_1_Effect6;
        this.Skill_1_Effect7=Skill_1_Effect7;
        this.Skill_1_Effect8=Skill_1_Effect8;
        this.Skill_1_Effect9=Skill_1_Effect9;
        this.Skill_1_Effect10=Skill_1_Effect10;
        this.Skill_2_Effect1=Skill_2_Effect1;
        this.Skill_2_Effect2=Skill_2_Effect2;
        this.Skill_2_Effect3=Skill_2_Effect3;
        this.Skill_2_Effect4=Skill_2_Effect4;
        this.Skill_2_Effect5=Skill_2_Effect5;
        this.Skill_2_Effect6=Skill_2_Effect6;
        this.Skill_2_Effect7=Skill_2_Effect7;
        this.Skill_2_Effect8=Skill_2_Effect8;
        this.Skill_2_Effect9=Skill_2_Effect9;
        this.Skill_2_Effect10=Skill_2_Effect10;
        this.Skill_3_Effect1=Skill_3_Effect1;
        this.Skill_3_Effect2=Skill_3_Effect2;
        this.Skill_3_Effect3=Skill_3_Effect3;
        this.Skill_3_Effect4=Skill_3_Effect4;
        this.Skill_3_Effect5=Skill_3_Effect5;
        this.Skill_3_Effect6=Skill_3_Effect6;
        this.Skill_3_Effect7=Skill_3_Effect7;
        this.Skill_3_Effect8=Skill_3_Effect8;
        this.Skill_3_Effect9=Skill_3_Effect9;
        this.Skill_3_Effect10=Skill_3_Effect10;
        //endregion

        //region NP Describe
        this.NP_CardColor=NP_CardColor;
        this.NP_Name1=NP_Name1;
        this.NP_Describe=NP_Describe;
        this.NP_Describe_Rank1=NP_Describe_Rank1;
        this.NP_Describe_Target=NP_Describe_Target;
        this.NP_1_Effect1=NP_1_Effect1;
        this.NP_1_Effect2=NP_1_Effect2;
        this.NP_1_Effect3=NP_1_Effect3;
        this.NP_1_Effect4=NP_1_Effect4;
        this.NP_1_Effect5=NP_1_Effect5;
        this.NP_Name2=NP_Name2;
        this.NP_Rank2=NP_Rank2;
        this.NP_2_Effect1=NP_2_Effect1;
        this.NP_2_Effect2=NP_2_Effect2;
        this.NP_2_Effect3=NP_2_Effect3;
        this.NP_2_Effect4=NP_2_Effect4;
        this.NP_2_Effect5=NP_2_Effect5;
        //endregion

    }//Servant_Name + Servant_Rarity & Information Status + Class Describe(1-4) + CommandCard + SkillDescribe + Skill_Effect+
     //NP_Describe

    public FB_FGOData(String namech,String nameen,String namejp,String namechina,int rarity,int Class,int StatusATKLV1,int Status_HPLV1,
                      int StatusATKFinal,int Status_HPFinal,int StatusATKLV100,int Status_HPLV100,int Cost,int max_LV,
                      String class_describe1,String class_describe2,String class_describe3,String class_describe4,
                      int Command_Buster,int Command_Arts,int Command_Quick,
                      String Skill_Describe1,String Skill_Describe2,String Skill_Describe3,String Skill_Describe4,String Skill_Describe5,String Skill_Describe6,
                      String Skill_1_Effect1,String Skill_1_Effect2,String Skill_1_Effect3,String Skill_1_Effect4,String Skill_1_Effect5,String Skill_1_Effect6,
                      String Skill_1_Effect7,String Skill_1_Effect8,String Skill_1_Effect9,String Skill_1_Effect10,
                      String Skill_2_Effect1,String Skill_2_Effect2,String Skill_2_Effect3,String Skill_2_Effect4,String Skill_2_Effect5,String Skill_2_Effect6,
                      String Skill_2_Effect7,String Skill_2_Effect8,String Skill_2_Effect9,String Skill_2_Effect10,
                      String Skill_3_Effect1,String Skill_3_Effect2,String Skill_3_Effect3,String Skill_3_Effect4,String Skill_3_Effect5,String Skill_3_Effect6,
                      String Skill_3_Effect7,String Skill_3_Effect8,String Skill_3_Effect9,String Skill_3_Effect10,
                      int NP_CardColor,String NP_Name1,String NP_Describe,String NP_Describe_Rank1,String NP_Describe_Target,String NP_1_Effect1,
                      String NP_1_Effect2,String NP_1_Effect3,String NP_1_Effect4,String NP_1_Effect5,String NP_Name2,String NP_Rank2,
                      String NP_2_Effect1,String NP_2_Effect2,String NP_2_Effect3,String NP_2_Effect4,String NP_2_Effect5,
                      String LevelMaterialQP_1,String LevelMaterial_11,int RequireQuantity11,String LevelMaterial_12,int RequireQuantity12,String LevelMaterial_13,int RequireQuantity13,String LevelMaterial_14,int RequireQuantity14,
                      String LevelMaterialQP_2,String LevelMaterial_21,int RequireQuantity21,String LevelMaterial_22,int RequireQuantity22,String LevelMaterial_23,int RequireQuantity23,String LevelMaterial_24,int RequireQuantity24,
                      String LevelMaterialQP_3,String LevelMaterial_31,int RequireQuantity31,String LevelMaterial_32,int RequireQuantity32,String LevelMaterial_33,int RequireQuantity33,String LevelMaterial_34,int RequireQuantity34,
                      String LevelMaterialQP_4,String LevelMaterial_41,int RequireQuantity41,String LevelMaterial_42,int RequireQuantity42,String LevelMaterial_43,int RequireQuantity43,String LevelMaterial_44,int RequireQuantity44

    ){
        //region Compelete
        // Define Line 2.
        this.NameCH=namech;
        this.NameEN=nameen;
        this.NameJP=namejp;
        this.NameChina=namechina;
        //int
        this.Rarity=rarity;
        this.Class=Class;
        this.StatusATKLV1=StatusATKLV1;
        this.Status_HPLV1=Status_HPLV1;
        this.StatusATKFinal=StatusATKFinal;
        this.Status_HPFinal=Status_HPFinal;
        this.StatusATKLV100=StatusATKLV100;
        this.Status_HPLV100=Status_HPLV100;
        this.COST=Cost;
        this.MAX_LV=max_LV;
        //Class Describe
        this.Class_Describe1=class_describe1;
        this.Class_Describe2=class_describe2;
        this.Class_Describe3=class_describe3;
        this.Class_Describe4=class_describe4;
        //CommandCard
        this.Command_Buster=Command_Buster;
        this.Command_Arts=Command_Arts;
        this.Command_Quick=Command_Quick;
        //Skill Describe
        this.Skill_Describe1=Skill_Describe1;
        this.Skill_Describe2=Skill_Describe2;
        this.Skill_Describe3=Skill_Describe3;
        this.Skill_Describe4=Skill_Describe4;
        this.Skill_Describe5=Skill_Describe5;
        this.Skill_Describe6=Skill_Describe6;
        //Skill Effect
        this.Skill_1_Effect1=Skill_1_Effect1;
        this.Skill_1_Effect2=Skill_1_Effect2;
        this.Skill_1_Effect3=Skill_1_Effect3;
        this.Skill_1_Effect4=Skill_1_Effect4;
        this.Skill_1_Effect5=Skill_1_Effect5;
        this.Skill_1_Effect6=Skill_1_Effect6;
        this.Skill_1_Effect7=Skill_1_Effect7;
        this.Skill_1_Effect8=Skill_1_Effect8;
        this.Skill_1_Effect9=Skill_1_Effect9;
        this.Skill_1_Effect10=Skill_1_Effect10;
        this.Skill_2_Effect1=Skill_2_Effect1;
        this.Skill_2_Effect2=Skill_2_Effect2;
        this.Skill_2_Effect3=Skill_2_Effect3;
        this.Skill_2_Effect4=Skill_2_Effect4;
        this.Skill_2_Effect5=Skill_2_Effect5;
        this.Skill_2_Effect6=Skill_2_Effect6;
        this.Skill_2_Effect7=Skill_2_Effect7;
        this.Skill_2_Effect8=Skill_2_Effect8;
        this.Skill_2_Effect9=Skill_2_Effect9;
        this.Skill_2_Effect10=Skill_2_Effect10;
        this.Skill_3_Effect1=Skill_3_Effect1;
        this.Skill_3_Effect2=Skill_3_Effect2;
        this.Skill_3_Effect3=Skill_3_Effect3;
        this.Skill_3_Effect4=Skill_3_Effect4;
        this.Skill_3_Effect5=Skill_3_Effect5;
        this.Skill_3_Effect6=Skill_3_Effect6;
        this.Skill_3_Effect7=Skill_3_Effect7;
        this.Skill_3_Effect8=Skill_3_Effect8;
        this.Skill_3_Effect9=Skill_3_Effect9;
        this.Skill_3_Effect10=Skill_3_Effect10;
        //endregion

        //region NP Describe
        this.NP_CardColor=NP_CardColor;
        this.NP_Name1=NP_Name1;
        this.NP_Describe=NP_Describe;
        this.NP_Describe_Rank1=NP_Describe_Rank1;
        this.NP_Describe_Target=NP_Describe_Target;
        this.NP_1_Effect1=NP_1_Effect1;
        this.NP_1_Effect2=NP_1_Effect2;
        this.NP_1_Effect3=NP_1_Effect3;
        this.NP_1_Effect4=NP_1_Effect4;
        this.NP_1_Effect5=NP_1_Effect5;
        this.NP_Name2=NP_Name2;
        this.NP_Rank2=NP_Rank2;
        this.NP_2_Effect1=NP_2_Effect1;
        this.NP_2_Effect2=NP_2_Effect2;
        this.NP_2_Effect3=NP_2_Effect3;
        this.NP_2_Effect4=NP_2_Effect4;
        this.NP_2_Effect5=NP_2_Effect5;
        //endregion

        //region Level Required Material
        this.LevelMaterialQP_1=LevelMaterialQP_1;this.LevelMaterialQP_2=LevelMaterialQP_2;this.LevelMaterialQP_3=LevelMaterialQP_3;this.LevelMaterialQP_4=LevelMaterialQP_4;
        this.LevelMaterial_11=LevelMaterial_11;this.LevelMaterial_12=LevelMaterial_12;this.LevelMaterial_13=LevelMaterial_13;this.LevelMaterial_14=LevelMaterial_14;
        this.RequireQuantity11=RequireQuantity11;this.RequireQuantity12=RequireQuantity12;this.RequireQuantity13=RequireQuantity13;this.RequireQuantity14=RequireQuantity14;
        this.LevelMaterial_21=LevelMaterial_21;this.LevelMaterial_22=LevelMaterial_22;this.LevelMaterial_23=LevelMaterial_23;this.LevelMaterial_24=LevelMaterial_24;
        this.RequireQuantity21=RequireQuantity21;this.RequireQuantity22=RequireQuantity22;this.RequireQuantity23=RequireQuantity23;this.RequireQuantity24=RequireQuantity24;
        this.LevelMaterial_31=LevelMaterial_31;this.LevelMaterial_32=LevelMaterial_32;this.LevelMaterial_33=LevelMaterial_33;this.LevelMaterial_34=LevelMaterial_34;
        this.RequireQuantity31=RequireQuantity31;this.RequireQuantity32=RequireQuantity32;this.RequireQuantity23=RequireQuantity33;this.RequireQuantity24=RequireQuantity34;
        this.LevelMaterial_41=LevelMaterial_41;this.LevelMaterial_42=LevelMaterial_42;this.LevelMaterial_43=LevelMaterial_43;this.LevelMaterial_44=LevelMaterial_44;
        this.RequireQuantity41=RequireQuantity41;this.RequireQuantity42=RequireQuantity42;this.RequireQuantity43=RequireQuantity43;this.RequireQuantity44=RequireQuantity44;

        //endregion
    }//Servant_Name + Servant_Rarity & Information Status + Class Describe(1-4) + CommandCard + SkillDescribe + Skill_Effect+
    //NP_Describe


    //region GetValue
    /*
    public String getAllData()
    {
        String Data;
        Data=   this.NameCH+"/"+this.NameEN+"/"+this.NameJP+"/"+this.NameChina+"/"+"Rarity-"+
                String.valueOf(this.Rarity)+"/Class-"+String.valueOf(this.Class)+"/Cost-"+String.valueOf(this.COST)+"/MaxLV-"+String.valueOf(this.MAX_LV)
                +"/ATK_LV1-"+String.valueOf(this.StatusATKLV1)+"/HP_LV1-"+String.valueOf(Status_HPLV1)
                +"/ATK_LvMax-"+String.valueOf(StatusATKFinal)+"/HP_LvMax-"+String.valueOf(Status_HPFinal)+
                "/ATK_LV100-"+String.valueOf(StatusATKLV100)+"/HP_Lv100-"+String.valueOf(Status_HPLV100);

        return Data;
    }*/
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
    public String getNameChina()
    {
        return this.NameChina;
    }
    //getINT
    public int getRarity()
    {
        return this.Rarity;
    }
    public int getServantClass()
    {
        return this.Class;
    }
    public int getStatusATKLV1()
    {
        return this.StatusATKLV1;
    }
    public int getStatus_HPLV1(){
        return this.Status_HPLV1;
    }
    public int getStatusATKFinal(){
        return this.StatusATKFinal;
    }
    public int getStatus_HPFinal(){
        return this.Status_HPFinal;
    }
    public int getStatusATKLV100(){
        return this.StatusATKLV100;
    }
    public int getStatus_HPLV100(){
        return this.Status_HPLV100;
    }
    public int getCOST(){
        return this.COST;
    }
    public int getMAX_LV(){
        return this.MAX_LV;
    }
    //region Class Describe
    public String getClass_Describe1(){
        return this.Class_Describe1;
    }
    public String getClass_Describe2(){
        return this.Class_Describe2;
    }
    public String getClass_Describe3(){
        return this.Class_Describe3;
    }
    public String getClass_Describe4(){
        return this.Class_Describe4;
    }
    //endregion

    //region Skill Describe
    public String getSkill_Describe1(){
        return this.Skill_Describe1;
    }
    public String getSkill_Describe2(){
        return this.Skill_Describe2;
    }
    public String getSkill_Describe3(){
        return this.Skill_Describe3;
    }
    public String getSkill_Describe4(){
        return this.Skill_Describe4;
    }
    public String getSkill_Describe5(){
        return this.Skill_Describe5;
    }
    public String getSkill_Describe6(){
        return this.Skill_Describe6;
    }
    //rendregion

    //region CommandCard
    public int getCommand_Buster(){
        return this.Command_Buster;
    }
    public int getCommand_Arts(){
        return this.Command_Arts;
    }
    public int getCommand_Quick(){
        return this.Command_Quick;
    }
    //endregion

    //region NP_Describe
    public int getNP_CardColor(){return this.NP_CardColor;}
    public String getNP_Name1(){return this.NP_Name1;}
    public String getNP_Describe(){return this.NP_Describe;}
    public String getNP_Describe_Rank1(){return this.NP_Describe_Rank1;}
    public String getNP_Describe_Target(){return this.NP_Describe_Target;}
    public String getNP_1_Effect1(){return this.NP_1_Effect1;}
    public String getNP_1_Effect2(){return this.NP_1_Effect2;}
    public String getNP_1_Effect3(){return this.NP_1_Effect3;}
    public String getNP_1_Effect4(){return this.NP_1_Effect4;}
    public String getNP_1_Effect5(){return this.NP_1_Effect5;}
    public String getNP_Name2(){return this.NP_Name2;}
    public String getNP_Rank2(){return this.NP_Rank2;}
    public String getNP_2_Effect1(){return this.NP_2_Effect1;}
    public String getNP_2_Effect2(){return this.NP_2_Effect2;}
    public String getNP_2_Effect3(){return this.NP_2_Effect3;}
    public String getNP_2_Effect4(){return this.NP_2_Effect4;}
    public String getNP_2_Effect5(){return this.NP_2_Effect5;}


    //endregion

    //region Skill_Effect Info
    public String getSkill_1_Effect1(){return this.Skill_1_Effect1;}
    public String getSkill_1_Effect2(){return this.Skill_1_Effect2;}
    public String getSkill_1_Effect3(){return this.Skill_1_Effect3;}
    public String getSkill_1_Effect4(){return this.Skill_1_Effect4;}
    public String getSkill_1_Effect5(){return this.Skill_1_Effect5;}
    public String getSkill_1_Effect6(){return this.Skill_1_Effect6;}
    public String getSkill_1_Effect7(){return this.Skill_1_Effect7;}
    public String getSkill_1_Effect8(){return this.Skill_1_Effect8;}
    public String getSkill_1_Effect9(){return this.Skill_1_Effect9;}
    public String getSkill_1_Effect10(){return this.Skill_1_Effect10;}
    //2
    public String getSkill_2_Effect1(){return this.Skill_2_Effect1;}
    public String getSkill_2_Effect2(){return this.Skill_2_Effect2;}
    public String getSkill_2_Effect3(){return this.Skill_2_Effect3;}
    public String getSkill_2_Effect4(){return this.Skill_2_Effect4;}
    public String getSkill_2_Effect5(){return this.Skill_2_Effect5;}
    public String getSkill_2_Effect6(){return this.Skill_2_Effect6;}
    public String getSkill_2_Effect7(){return this.Skill_2_Effect7;}
    public String getSkill_2_Effect8(){return this.Skill_2_Effect8;}
    public String getSkill_2_Effect9(){return this.Skill_2_Effect9;}
    public String getSkill_2_Effect10(){return this.Skill_2_Effect10;}
    //3
    public String getSkill_3_Effect1(){return this.Skill_3_Effect1;}
    public String getSkill_3_Effect2(){return this.Skill_3_Effect2;}
    public String getSkill_3_Effect3(){return this.Skill_3_Effect3;}
    public String getSkill_3_Effect4(){return this.Skill_3_Effect4;}
    public String getSkill_3_Effect5(){return this.Skill_3_Effect5;}
    public String getSkill_3_Effect6(){return this.Skill_3_Effect6;}
    public String getSkill_3_Effect7(){return this.Skill_3_Effect7;}
    public String getSkill_3_Effect8(){return this.Skill_3_Effect8;}
    public String getSkill_3_Effect9(){return this.Skill_3_Effect9;}
    public String getSkill_3_Effect10(){return this.Skill_3_Effect10;}
    //endregion

    //region Level Required Material

    public int getRequireQuantity11() {
        return this.RequireQuantity11;
    }

    public int getRequireQuantity12() {
        return this.RequireQuantity12;
    }

    public int getRequireQuantity13() {
        return this.RequireQuantity13;
    }

    public int getRequireQuantity14() {
        return this.RequireQuantity14;
    }

    public int getRequireQuantity21() {
        return this.RequireQuantity21;
    }

    public int getRequireQuantity22() {
        return this.RequireQuantity22;
    }

    public int getRequireQuantity23() {
        return this.RequireQuantity23;
    }

    public int getRequireQuantity24() {
        return this.RequireQuantity24;
    }

    public int getRequireQuantity31() {
        return this.RequireQuantity31;
    }

    public int getRequireQuantity32() {
        return this.RequireQuantity32;
    }

    public int getRequireQuantity33() {
        return this.RequireQuantity33;
    }

    public int getRequireQuantity34() {
        return this.RequireQuantity34;
    }

    public int getRequireQuantity41() {
        return this.RequireQuantity41;
    }

    public int getRequireQuantity42() {
        return this.RequireQuantity42;
    }

    public int getRequireQuantity43() {
        return this.RequireQuantity43;
    }

    public int getRequireQuantity44() {
        return this.RequireQuantity44;
    }

    public String getLevelMaterial_11() {
        return this.LevelMaterial_11;
    }

    public String getLevelMaterial_12() {
        return this.LevelMaterial_12;
    }

    public String getLevelMaterial_13() {
        return this.LevelMaterial_13;
    }

    public String getLevelMaterial_14() {
        return this.LevelMaterial_14;
    }

    public String getLevelMaterial_21() {
        return this.LevelMaterial_21;
    }

    public String getLevelMaterial_22() {
        return this.LevelMaterial_22;
    }

    public String getLevelMaterial_23() {
        return this.LevelMaterial_23;
    }

    public String getLevelMaterial_24() {
        return this.LevelMaterial_24;
    }

    public String getLevelMaterial_31() {
        return this.LevelMaterial_31;
    }

    public String getLevelMaterial_32() {
        return this.LevelMaterial_32;
    }

    public String getLevelMaterial_33() {
        return this.LevelMaterial_33;
    }

    public String getLevelMaterial_34() {
        return this.LevelMaterial_34;
    }

    public String getLevelMaterial_41() {
        return this.LevelMaterial_41;
    }

    public String getLevelMaterial_42() {
        return this.LevelMaterial_42;
    }

    public String getLevelMaterial_43() {
        return this.LevelMaterial_43;
    }

    public String getLevelMaterial_44() {
        return this.LevelMaterial_44;
    }

    public String getLevelMaterialQP_1() {
        return this.LevelMaterialQP_1;
    }

    public String getLevelMaterialQP_2() {
        return this.LevelMaterialQP_2;
    }

    public String getLevelMaterialQP_3() {
        return this.LevelMaterialQP_3;
    }

    public String getLevelMaterialQP_4() {
        return this.LevelMaterialQP_4;
    }

//endregion





    //endregion

    //region SetValue
    public void setNameCH(String NameCH)
    {
        this.NameCH=NameCH;
    }
    public void setNameEN(String NameEN)
    {
        this.NameEN=NameEN;
    }
    public void setNameJP(String NameJP)
    {
        this.NameJP=NameJP;
    }
    public void setNameChina(String NameChina)
    {
        this.NameChina=NameChina;
    }

    public void setRarity(int Rarity)
    {
        this.Rarity=Rarity;
    }
    public void setServantClass(int ServantClass)
    {
        this.Class=ServantClass;
    }
    public void setStatusATKLV1(int Status_ATK_LV1)
    {
        this.StatusATKLV1=Status_ATK_LV1;
    }
    public void setStatus_HPLV1(int Status_HPLV1)
    {
        this.Status_HPLV1=Status_HPLV1;
    }
    public void setStatusATKFinal(int StatusATKFinal)
    {
        this.StatusATKFinal=StatusATKFinal;
    }
    public void setStatus_HPFinal(int Status_HPFinal)
    {
        this.Status_HPFinal=Status_HPFinal;
    }
    public void setStatusATKLV100(int StatusATKLV100)
    {
        this.StatusATKLV100=StatusATKLV100;
    }
    public void  setStatus_HPLV100(int Status_HPLV100)
    {
        this.Status_HPLV100=Status_HPLV100;
    }
    public void setCOST(int cost)
    {
        this.COST=cost;
    }

    public void setMAX_LV(int max_lv)
    {
        this.MAX_LV=max_lv;
    }
    public void setClass_Describe1(String D1)
    {
        this.Class_Describe1=D1;
    }
    public void setClass_Describe2(String D2)
    {
        this.Class_Describe2=D2;
    }
    public void setClass_Describe3(String D3)
    {
        this.Class_Describe3=D3;
    }
    public void setClass_Describe4(String D4)
    {
        this.Class_Describe4=D4;
    }
    public void setCommand_Buster(int CommandBuster)
    {
        this.Command_Buster=CommandBuster;
    }
    public void setCommand_Arts(int CommandArts)
    {
        this.Command_Arts=CommandArts;
    }
    public void setCommand_Quick(int CommandQuick)
    {
        this.Command_Quick=CommandQuick;
    }
    public void setSkill_Describe1(String Skill_Describe1){
        this.Skill_Describe1=Skill_Describe1;
    }
    public void setSkill_Describe2(String Skill_Describe2){
        this.Skill_Describe2=Skill_Describe2;
    }
    public void setSkill_Describe3(String Skill_Describe3){
        this.Skill_Describe3=Skill_Describe3;
    }
    public void setSkill_Describe4(String Skill_Describe4){
        this.Skill_Describe4=Skill_Describe4;
    }
    public void setSkill_Describe5(String Skill_Describe5){
        this.Skill_Describe5=Skill_Describe5;
    }
    public void setSkill_Describe6(String Skill_Describe6){
        this.Skill_Describe6=Skill_Describe6;
    }

    //region Set Skill Effect
    public void setSkill_1_Effect1(String SkillEffect1){this.Skill_1_Effect1=SkillEffect1;}
    public void setSkill_1_Effect2(String SkillEffect2){this.Skill_1_Effect1=SkillEffect2;}
    public void setSkill_1_Effect3(String SkillEffect3){this.Skill_1_Effect1=SkillEffect3;}
    public void setSkill_1_Effect4(String SkillEffect4){this.Skill_1_Effect1=SkillEffect4;}
    public void setSkill_1_Effect5(String SkillEffect5){this.Skill_1_Effect1=SkillEffect5;}
    public void setSkill_1_Effect6(String SkillEffect6){this.Skill_1_Effect1=SkillEffect6;}
    public void setSkill_1_Effect7(String SkillEffect7){this.Skill_1_Effect1=SkillEffect7;}
    public void setSkill_1_Effect8(String SkillEffect8){this.Skill_1_Effect1=SkillEffect8;}
    public void setSkill_1_Effect9(String SkillEffect9){this.Skill_1_Effect1=SkillEffect9;}
    public void setSkill_1_Effect10(String SkillEffect10){this.Skill_1_Effect1=SkillEffect10;}
    public void setSkill_2_Effect1(String SkillEffect1){this.Skill_2_Effect1=SkillEffect1;}
    public void setSkill_2_Effect2(String SkillEffect2){this.Skill_2_Effect1=SkillEffect2;}
    public void setSkill_2_Effect3(String SkillEffect3){this.Skill_2_Effect1=SkillEffect3;}
    public void setSkill_2_Effect4(String SkillEffect4){this.Skill_2_Effect1=SkillEffect4;}
    public void setSkill_2_Effect5(String SkillEffect5){this.Skill_2_Effect1=SkillEffect5;}
    public void setSkill_2_Effect6(String SkillEffect6){this.Skill_2_Effect1=SkillEffect6;}
    public void setSkill_2_Effect7(String SkillEffect7){this.Skill_2_Effect1=SkillEffect7;}
    public void setSkill_2_Effect8(String SkillEffect8){this.Skill_2_Effect1=SkillEffect8;}
    public void setSkill_2_Effect9(String SkillEffect9){this.Skill_2_Effect1=SkillEffect9;}
    public void setSkill_2_Effect10(String SkillEffect10){this.Skill_2_Effect1=SkillEffect10;}
    public void setSkill_3_Effect1(String SkillEffect1){this.Skill_3_Effect1=SkillEffect1;}
    public void setSkill_3_Effect2(String SkillEffect2){this.Skill_3_Effect1=SkillEffect2;}
    public void setSkill_3_Effect3(String SkillEffect3){this.Skill_3_Effect1=SkillEffect3;}
    public void setSkill_3_Effect4(String SkillEffect4){this.Skill_3_Effect1=SkillEffect4;}
    public void setSkill_3_Effect5(String SkillEffect5){this.Skill_3_Effect1=SkillEffect5;}
    public void setSkill_3_Effect6(String SkillEffect6){this.Skill_3_Effect1=SkillEffect6;}
    public void setSkill_3_Effect7(String SkillEffect7){this.Skill_3_Effect1=SkillEffect7;}
    public void setSkill_3_Effect8(String SkillEffect8){this.Skill_3_Effect1=SkillEffect8;}
    public void setSkill_3_Effect9(String SkillEffect9){this.Skill_3_Effect1=SkillEffect9;}
    public void setSkill_3_Effect10(String SkillEffect10){this.Skill_3_Effect1=SkillEffect10;}
    //endregion

    //region Set NP Describe
    public void setNP_CardColor(int NP_CardColor){this.NP_CardColor=NP_CardColor;}
    public void setNP_Name1(String Name){this.NP_Name1=Name;}
    public void setNP_Describe(String NP_Describe){this.NP_Describe=NP_Describe;}
    public void setNP_Describe_Rank1(String Rank){this.NP_Describe_Rank1=Rank;}
    public void setNP_Describe_Target(String Target){this.NP_Describe_Target=Target;}
    public void setNP_1_Effect1(String Effect){this.NP_1_Effect1=Effect;}
    public void setNP_1_Effect2(String Effect){this.NP_1_Effect2=Effect;}
    public void setNP_1_Effect3(String Effect){this.NP_1_Effect3=Effect;}
    public void setNP_1_Effect4(String Effect){this.NP_1_Effect4=Effect;}
    public void setNP_1_Effect5(String Effect){this.NP_1_Effect5=Effect;}
    public void setNP_Name2(String Name){this.NP_Name2=Name;}
    public void setNP_Rank2(String Rank){this.NP_Rank2=Rank;}
    public void setNP_2_Effect1(String Effect){this.NP_2_Effect1=Effect;}
    public void setNP_2_Effect2(String Effect){this.NP_2_Effect2=Effect;}
    public void setNP_2_Effect3(String Effect){this.NP_2_Effect3=Effect;}
    public void setNP_2_Effect4(String Effect){this.NP_2_Effect4=Effect;}
    public void setNP_2_Effect5(String Effect){this.NP_2_Effect5=Effect;}
    //endregion

    //region Level Required Material

    public void setLevelMaterial_11(String levelMaterial_11) {
        LevelMaterial_11 = levelMaterial_11;
    }



    //endregion

    @Exclude
    public Map<String,Object> toMap(){
        HashMap<String,Object> result=new HashMap<>();
        result.put("NameCH",NameCH);
        result.put("NameEN",NameEN);
        result.put("NameJP",NameJP);
        result.put("NameChina",NameChina);
        return result;
    }
}
