package com;

public class UserModel {
    private String id;
    private String name;
    private String level;
    private String levelName;

    public UserModel(String id, String name, String level) {
        this.id = id;
        this.name = name;
        this.setLevel(level);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
        this.levelName = CommonCodeContextHolder.getCommonCodeText("UserLevel", level);
    }

    public String getLevelName() {
        return levelName;
    }

    @Override
    public String toString() {
        return "UserModel [id=" + id + ", name=" + name + ", level=" + level + ", levelName=" + levelName + "]";
    }
}
