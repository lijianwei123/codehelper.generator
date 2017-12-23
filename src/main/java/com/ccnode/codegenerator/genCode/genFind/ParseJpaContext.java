package com.ccnode.codegenerator.genCode.genFind;

import com.ccnode.codegenerator.pojo.BaseResponse;
import com.ccnode.codegenerator.pojo.OnePojoInfo;
import com.ccnode.codegenerator.pojo.ResultMapRow;
import com.ccnode.codegenerator.pojo.TextBuilder;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * What always stop you is what you always believe.
 * <p>
 * Created by zhengjun.du on 2017/08/05 12:39
 */
public class ParseJpaContext extends BaseResponse{
    OnePojoInfo onePojoInfo;
    String inputMethodName;
    String tableName;
    List<ResultMapRow> resultMapRowList = Lists.newArrayList();
    List<SqlWord> sqlWordList;
    List<SqlWord> hasBuilds;
    List<SqlWord> unBuilds;
    StringBuilder builder;
    TextBuilder textBuilder;
    String javaReturnType;
    String xmlReturnType;
    List<MethodParameter> javaMethodParameterList = Lists.newArrayList();
    String daoMethodText;
    String serviceMethodText;
    String xmlMethodText;

    public List<ResultMapRow> getResultMapRowList() {
        return resultMapRowList;
    }

    public void setResultMapRowList(List<ResultMapRow> resultMapRowList) {
        this.resultMapRowList = resultMapRowList;
    }

    public TextBuilder getTextBuilder() {
        return textBuilder;
    }

    public void setTextBuilder(TextBuilder textBuilder) {
        this.textBuilder = textBuilder;
    }

    public void addMethodParameter(String parameterType, String parameterName){
        MethodParameter methodParameter = new MethodParameter();
        methodParameter.setParameterName(Strings.nullToEmpty(parameterName).trim());
        methodParameter.setParameterType(Strings.nullToEmpty(parameterType).trim());
        javaMethodParameterList.add(methodParameter);
    }

    public String getInputMethodName() {
        return inputMethodName;
    }

    public void setInputMethodName(String inputMethodName) {
        this.inputMethodName = inputMethodName;
    }

    public OnePojoInfo getOnePojoInfo() {
        return onePojoInfo;
    }

    public void setOnePojoInfo(OnePojoInfo onePojoInfo) {
        this.onePojoInfo = onePojoInfo;
    }

    public String getDaoMethodText() {
        return daoMethodText;
    }

    public void setDaoMethodText(String daoMethodText) {
        this.daoMethodText = daoMethodText;
    }

    public String getServiceMethodText() {
        return serviceMethodText;
    }

    public void setServiceMethodText(String serviceMethodText) {
        this.serviceMethodText = serviceMethodText;
    }

    public String getXmlMethodText() {
        return xmlMethodText;
    }

    public void setXmlMethodText(String xmlMethodText) {
        this.xmlMethodText = xmlMethodText;
    }

    public String getXmlReturnType() {
        return xmlReturnType;
    }

    public void setXmlReturnType(String xmlReturnType) {
        this.xmlReturnType = xmlReturnType;
    }

    public List<SqlWord> getHasBuilds() {
        return hasBuilds;
    }

    public void setHasBuilds(List<SqlWord> hasBuilds) {
        this.hasBuilds = hasBuilds;
    }

    public List<SqlWord> getUnBuilds() {
        return unBuilds;
    }

    public void setUnBuilds(List<SqlWord> unBuilds) {
        this.unBuilds = unBuilds;
    }

    public String getJavaReturnType() {
        return javaReturnType;
    }

    public void setJavaReturnType(String javaReturnType) {
        this.javaReturnType = javaReturnType;
    }

    public List<MethodParameter> getJavaMethodParameterList() {
        return javaMethodParameterList;
    }

    public void setJavaMethodParameterList(List<MethodParameter> javaMethodParameterList) {
        this.javaMethodParameterList = javaMethodParameterList;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<SqlWord> getSqlWordList() {
        return sqlWordList;
    }

    public void setSqlWordList(List<SqlWord> sqlWordList) {
        this.sqlWordList = sqlWordList;
    }

    public StringBuilder getBuilder() {
        return builder;
    }

    public void setBuilder(StringBuilder builder) {
        this.builder = builder;
    }
}
