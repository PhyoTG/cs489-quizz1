package edu.miu.cs.cs489.model;

public class Label {
    private Long labelId;
    private String name;
    public Label(Long labelId, String name) {
        this.labelId = labelId;
        this.name = name;
    }

    public Long getLabelId() {
        return labelId;
    }

    public void setLabelId(Long labelId) {
        this.labelId = labelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
