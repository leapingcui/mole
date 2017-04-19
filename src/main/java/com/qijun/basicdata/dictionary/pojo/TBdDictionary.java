package com.qijun.basicdata.dictionary.pojo;

public class TBdDictionary {
    private Long dictionaryId;

    private String dictionaryCommonCata;

    private String dictionaryDetailCata;

    private String dictionaryContent;

    private Integer dictionaryOrder;

    private String dictionaryNotes;

    public Long getDictionaryId() {
        return dictionaryId;
    }

    public void setDictionaryId(Long dictionaryId) {
        this.dictionaryId = dictionaryId;
    }

    public String getDictionaryCommonCata() {
        return dictionaryCommonCata;
    }

    public void setDictionaryCommonCata(String dictionaryCommonCata) {
        this.dictionaryCommonCata = dictionaryCommonCata == null ? null : dictionaryCommonCata.trim();
    }

    public String getDictionaryDetailCata() {
        return dictionaryDetailCata;
    }

    public void setDictionaryDetailCata(String dictionaryDetailCata) {
        this.dictionaryDetailCata = dictionaryDetailCata == null ? null : dictionaryDetailCata.trim();
    }

    public String getDictionaryContent() {
        return dictionaryContent;
    }

    public void setDictionaryContent(String dictionaryContent) {
        this.dictionaryContent = dictionaryContent == null ? null : dictionaryContent.trim();
    }

    public Integer getDictionaryOrder() {
        return dictionaryOrder;
    }

    public void setDictionaryOrder(Integer dictionaryOrder) {
        this.dictionaryOrder = dictionaryOrder;
    }

    public String getDictionaryNotes() {
        return dictionaryNotes;
    }

    public void setDictionaryNotes(String dictionaryNotes) {
        this.dictionaryNotes = dictionaryNotes == null ? null : dictionaryNotes.trim();
    }

    @Override
    public String toString() {
        return "TBdDictionary{" +
                "dictionaryId=" + dictionaryId +
                ", dictionaryCommonCata='" + dictionaryCommonCata + '\'' +
                ", dictionaryDetailCata='" + dictionaryDetailCata + '\'' +
                ", dictionaryContent='" + dictionaryContent + '\'' +
                ", dictionaryOrder=" + dictionaryOrder +
                ", dictionaryNotes='" + dictionaryNotes + '\'' +
                '}';
    }
}