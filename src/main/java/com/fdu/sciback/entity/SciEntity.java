package com.fdu.sciback.entity;



import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.Map;


public class SciEntity {
    private int id;
    private String name;
    private String nameZh;
    private int level;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String definition;
    private String definitionZh;
    private String parent;
    private List<Integer> childnodes;
    private String experts;//这里需要更改 数据库里存错了。
    private List<Map<String,Object>> publications;

//    public static class DictContent {
//        private String key;
//        private String value;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getDefinitionZh() {
        return definitionZh;
    }

    public void setDefinitionZh(String definitionZh) {
        this.definitionZh = definitionZh;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public List<Integer> getChildnodes() {
        return childnodes;
    }

    public void setChildnodes(List<Integer> childnodes) {
        this.childnodes = childnodes;
    }

    public String getExperts() {
        return experts;
    }

    public void setExperts(String experts) {
        this.experts = experts;
    }

    public List<Map<String,Object>> getPublications() {
        return publications;
    }

    public void setPublications(List<Map<String,Object>> publications) {
        this.publications = publications;
    }
}
